package com.lineup.skku.post

import com.lineup.skku.booth.booth.Booth
import com.lineup.skku.booth.booth.BoothExceptionCode
import com.lineup.skku.common.CodeException
import com.lineup.skku.common.redis.CacheTemplate
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PostService (
    private val postRepository: PostRepository,
    private val postImageRepository: PostImageRepository,
    private val postLinkRepository: PostLinkRepository,
    private val cacheTemplate: CacheTemplate
){
    @Transactional(readOnly = true)
    fun findAll(): List<PostSummary> {
        return cacheTemplate.findCache("posts",
            {
                postRepository.findAll().map {
                    PostSummary(
                        it.id,
                        it.title,
                        it.thumbnail,
                        it.content
                    )
                }
            }, CodeException(PostExceptionCode.NOT_FOUND))
    }

    @Transactional(readOnly = true)
    fun findById(id: Long): Post {
        return cacheTemplate.findCache("posts/$id", {
            val post = postRepository.findByIdOrNull(id)
            if (post != null) {
                val images = postImageRepository.findByPostId(post.id)
                val links = postLinkRepository.findByPostId(post.id)
                Post(
                    post.id,
                    post.title,
                    post.content,
                    images.map { it.src },
                    links.map { it.link }
                )
            } else null
        }, CodeException(PostExceptionCode.NOT_FOUND))
    }

    @Transactional
    fun create(request: PostCreateRequest): PostSummary {
        val post = PostEntity(
            request.title,
            request.images[0],
            request.content
        )
         postRepository.save(post)

        val images = request.images.map { PostImageEntity(post.id, it) }
        postImageRepository.saveAll(images)
        val links = request.links.map { PostLinkEntity(post.id, it) }
        postLinkRepository.saveAll(links)
        cacheTemplate.removeCache("posts")

        return PostSummary(
            post.id,
            post.title,
            post.thumbnail,
            post.content
        )
    }

    @Transactional
    fun update(id: Long, request: PostUpdateRequest) {
        val post = postRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(PostExceptionCode.NOT_FOUND)

        if (request.images != null) {
            postImageRepository.deleteByPostId(post.id)
            val images = request.images.map { PostImageEntity(post.id, it) }
            postImageRepository.saveAll(images)
        }

        if (request.links != null) {
            postLinkRepository.deleteByPostId(post.id)
            val links = request.links.map { PostLinkEntity(post.id, it) }
            postLinkRepository.saveAll(links)
        }

        post.update(request)
        postRepository.save(post)
        cacheTemplate.removeCache("posts")
        cacheTemplate.removeCache("posts/$id")
    }

    @Transactional
    fun delete(id: Long) {
        val post = postRepository.findByIdOrNull(id)?.takeIf { it.isActive() }
            ?: throw CodeException(PostExceptionCode.NOT_FOUND)

        postImageRepository.deleteByPostId(post.id)
        postLinkRepository.deleteByPostId(post.id)

        postRepository.delete(post)
        cacheTemplate.removeCache("posts")
        cacheTemplate.removeCache("posts/$id")
    }
}