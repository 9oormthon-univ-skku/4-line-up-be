package com.lineup.skku.common

import java.net.URI

fun String.toUri(): URI = URI.create(this)