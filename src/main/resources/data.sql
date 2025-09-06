-- category (id 1,2)
insert into category (name, icon, color, created_at, modified_at) values
    ('식당', 'url-icon-restaurant', '#FF0000', '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
    ('정류장', 'url-icon-bus', '#00AAFF', '2025-09-10 00:00:00', '2025-09-10 00:00:00');

-- area (id 1,2)
insert into area (name, summary, description, open, close, created_at, modified_at) values
    ('대운동장', '대운동장 한줄소개', '대운동장 소개', '2025-09-10 09:00:00', '2025-09-10 18:00:00', '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
    ('푸드트럭존', '푸드트럭존 한줄소개', '푸드트럭존 소개', '2025-09-10 09:00:00', '2025-09-10 20:00:00', '2025-09-10 00:00:00', '2025-09-10 00:00:00');

-- area_image
insert into area_image (area_id, src) values
    (1, 'https:///images.com/area/central_1.jpg'),
    (2, 'https:///images.com/area/food_1.jpg');

-- area_link
insert into area_link (area_id, label, href) values
    (1, '우천시 안내', 'https://example.com/area1'),
    (2, '총학생회 문의 창구', 'https://example.com/area2');

-- Booth (id 1: store, id 2: stop)
insert into Booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
    (2, 1, 'Store', '바베큐 푸드트럭', '푸드트럭 한줄소개', '푸드트럭 설명', 120, 340, '2025-09-10 10:00:00', '2025-09-10 19:00:00', null, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
    (1, 2, 'Stop', '인자셔틀 정류장', '정류장 한중소개', '정류장 설명', 80, 260, '2025-09-10 09:00:00', '2025-09-10 18:30:00', null, '2025-09-10 00:00:00', '2025-09-10 00:00:00');

-- Booth_image
insert into Booth_image (Booth_id, src) values
    (1, 'https://example.com/booth/barbecue.jpg'),
    (2, 'https://example.com/booth/stop_a.jpg');

-- Booth_link
insert into Booth_link (Booth_id, label, href) values
    (1, '푸드트럭 회사 페이지', 'https://example.com/store/barbecue'),
    (2, '셔틀 운영 관련 문의', 'https://example.com/shuttle/a');

-- menu (store_id -> Booth 1)
insert into menu (store_id, image, name, price, created_at, modified_at) values
    (1, 'https://example.com/menu/barbecue_basic.jpg', '기본 바베큐', 10000, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
    (1, 'https://example.com/menu/barbecue_spicy.jpg', '매운 바베큐', 10500, '2025-09-10 00:00:00', '2025-09-10 00:00:00');

-- post
insert into post (title, content, created_at, modified_at) values
    ('라인업 공개', '2025 ESKARA 라인업 공개', '2025-09-10 08:00:00', '2025-09-10 08:00:00'),
    ('온라인 강의 안내', '축제 기간동안 온라인 강의로 전환됩니다.', '2025-09-10 09:00:00', '2025-09-10 09:00:00');

-- post_image
insert into post_image (post_id, src) values
    (1, 'https://example.com/post/event_schedule.jpg'),
    (2, 'https://example.com/post/shuttle_change.jpg');

-- post_link
insert into post_link (post_id, label, href) values
    (1, '총학생회 문의 창구', 'https://example.com/event/schedule'),
    (2, '총학생회 문의 창구', 'https://example.com/shuttle/update');

-- stop_time (stop_id -> Booth 2)
insert into stop_time (stop_id, time) values
    (2, '08:00:00'),
    (2, '09:00:00');

-- timeslot
insert into timeslot (name, start_time, end_time, href, created_at, modified_at) values
    ('오전 부스', '2025-09-10 09:00:00', '2025-09-10 12:00:00', 'https://example.com/session/morning', '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
    ('오후 공연', '2025-09-10 13:00:00', '2025-09-10 17:00:00', 'https://example.com/session/afternoon', '2025-09-10 00:00:00', '2025-09-10 00:00:00');
