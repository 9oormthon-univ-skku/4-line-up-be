-- category TODO icon
insert into category (name, icon, color, created_at, modified_at) values
('무대', 'basketball', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('부스', 'flag', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('게이트', 'gate', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('정류장', 'bus', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('가게', 'store', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('주점', 'bar', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('굿즈', 't-shirts', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('식당', 'restaurant', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('화장실', 'toilet', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('포토부스', 'camera', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('분리수거', 'trash', '#043113', '2025-09-11 00:00:00', '2025-09-11 00:00:00');

-- booth, 주간 부스
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 2, 'Booth', '잡았S:CATCH', '총학생회와 함께 ESKARA를 꽉! 잡을 준비 되셨나요?, 초록의 파도 속에서 즐거운 추억을 CATCH 해가세요!', '**1398을 잡았S:CATCH!**\n성균관 설립 연도 1398년, 그 숫자를 쌀로 맞춰라!\n쌀알을 저울에 올렸을 때 **139.8g**에 가장 가까운 사람이 승리!\n\n**운명의 사람을 잡았S:CATCH!**\n제시된 키워드에 맞는 상대 캠퍼스를 찾아라!\n둘이서 미니게임 이구동성에 도전!\n*어맛? 우리 … 운명인가봐*', 120, 280, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-9 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', '수제로켓전문점 아레스 🚀', 'ARES는 성균관대학교 유일의 아마추어 로켓 제작 학술 동아리로 로켓공학을 이론과 실습을 통해 연구하는 동아리입니다! 누구든 관심과 열정만 있다면 환영합니다!', '수제로켓공방에서 로켓을 만들 때 필요한 자질들을 키워보세요!! 🚀\n게임에 참여하시고 굿즈와 기프티콘 받아가세요!', 180, 320, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', '실험실 탈출🔬❗️', '성균관대학교 화학과 학생회는 학과 구성원들을 위해 다양한 학과 행사와 사업들을 기획 및 운영하는 학생 단체입니다. 화학기반 학생성공 교육연구단은 대한민국 교육부 주관의 BK21 사업 교육연구단으로, 우수한 화학 인재들을 양성하고 있습니다.', '눈 떠 보니 실험실에 갇혀 버린 나, 그러나 현실에선 화포자이던 내가 *에스카라에선 화학 천재?* 🧑🏻‍🔬 🧪\n\n**화학과 학생회 × BK21 연구단이 준비한 본격 *실험실 탈출* 체험 부스!** 🎮\n\n분자~~꼬치~~의 달인🍡 실험복 챌린지🥼 pH 컬러 게임🎨 등의 미션을 통해 우당탕탕 실험실을 탈출하세요❗️\n탈출에 성공하면 스탠리, 락앤락 텀블러 등 푸짐한 상품들이 여러분을 기다리고 있답니다😎', 200, 340, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', 'ROTC 부트캠프', '성균관대학교 학군단은 문무겸전을 바탕으로 리더십과 책임감을 갖춘 장교를 양성하는 단체입니다.', '여기는 성균관대학교 부트캠프, 지금부터 임무를 하달한다.\n\n***🪖첫 번째 임무, 사격 훈련이다.***\n\n표적을 정조준하여 정확히 명중시켜라!\n\n***🎯두 번째 임무, RC 전차 전투 시뮬레이션이다.***\n\n전차를 조종하여 적 전차를 제압하라.임무를 완수한 자만이 용맹한 성균인으로 인정받을 것이다. 이상, 하달 끝!', 220, 360, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', '[ESKARA 정복 미션] 코드네임: TYPE-S', '정체불명의 단체가 당신을 불러냈다. ESKARA를 정복하기 위한 마지막 테스트, 코드네임 TYPE:S가 시작된다!', '*당신은 선택받은 요원이다. 이곳은 학생들을 잠입·훈련시키는, 캠퍼스 속 가장 은밀한 비밀 기지. 인간 이하의 대접과 강도 높은 검증을 견뎌낸 자만이 ''Gemini 비밀요원''의 칭호를 얻을 수 있다.*\n\n***당신 앞에 놓인 것은 단 하나 - 정복 미션.***\n\n**나와 친구의 성격을 꿰뚫는 요원 심리테스트**를 통과해야 한다.\n\n혼자가 두렵다면, 부스 요원과 함께 작전을 수행하라.\n테스트를 끝까지 마친 인원은 ''특급 요원 뱃지''를 수여받으며, 이번 작전의 공식 요원으로 기록된다.\n\n**오늘, 당신의 운명은 이곳에서 결정된다.**', 240, 380, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', '돌잔치', '참여하면 간식도 받을 수 있는 게임! 축제에 딱인 반다나와 타투 스티커! 디어스크 부스에 놀러오세요 ~', '**🔥 명륜 vs 율전, 자존심을 건 한판 승부! 🔥**\n\n"청개구리 절대음감 테스트"로 우리 캠퍼스를 승리로 이끄세요!\n\n**🍬 보상:** 참여만 하면 바로 **간식** 증정!\n\n**🏆 승리:** 가장 빠른 기록을 세워 우리 팀을 우승으로 이끌면, 상위 랭커 3명에게는 **특별 상품**까지!\n\n✨ 전통 굿즈 판매 ✨\n여기서만 만날 수 있는 특별한 굿즈들도 구경하고 가세요! 💖', 260, 400, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', '모태솔로지만 젠디는 하고싶어', 'SEPO는 1965년에 창립된 성균관대학교 내에서 가장 오랜 역사를 가지고 있는 경영학회입니다. 저희는 스터디와 토론을 통해 경영학적 지식과 리더십을 습득하고, 이를 바탕으로 전략을 설계해 나가는 일련의 과정을 통해 경영전략의 실전 적용이라는 학회의 목적을 실현해 나가고 있습니다.', '''모태솔로지만 젠디는 하고싶어'' 부스는 어보브테크와 세포가 함께 진행하는 프로젝트로, 학우분들께 연애운과 궁합운을 확인해보실 수 있는 체험을 제공해 드리고 있습니다.\n특별히 솔로분들은 부스에서 매칭까지 진행해준다니 꼭 참여해야겠죠?', 280, 320, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', '인생은 랜덤, 향기는 커스텀🔮', '향실은 성균관대학교 유일 향수 동아리입니다. 조향, 시향, 견학 및 스터디 등 향에 대한 체계적 학습과 실습을 진행합니다.', '**"나의 사주가 향수가 된다면?"**\n사주와 향수 제작 체험을 결합했습니다.\n• 사주를 통해 오행 중 어떤 성질이 과다/부족인지 알려드려요.\n• 본인의 오행에 해당하는 향을 맡아보고, 사주 향수를 직접 조향해볼 수도 있어요.\n\n> ***사주 보고, 직접 조향한 향수도 받아가세요!***', 300, 340, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(1, 2, 'Booth', 'S-LINK', 'S-LINK', 'S-LINK', 320, 360, '2025-09-11 10:00:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

-- booth, 야간 주점

-- 1. 슈퍼 정통 X 경영 브라더스
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '슈퍼 정통 X 경영 브라더스', '[포브스 선정] 쿠파가 탐내는 안주 1위 🍺', '쿠파도 탐낼 안주, 피치공주도 반할 이벤트 🏰\n\n쿠파는 피치를 원하고 피치는 마리오를 원하고 마리오는 여러분을 원해요 ㅜㅜ\n쿠파가 피치공주를 데려간다? 하지만 괜찮다\n이집 안주는 맛있으니까\n\n여기아니면 어디간단 마리오 🍄\n빨리오란 마리오 ⭐\n친구랑 같이오란 와루이지 🪙\n\n🍄사전 예약 정보\n⏱️ 1타임: 18:00 - 19:30\n⏱️ 2타임: 19:40 - 21:10\n⏱️ 3타임: 21:20 - 22:50\n\n🍄입장료\n- 경영대학 및 정통대학 원전공생 - 16,000원\n- 경영대학 및 정통대학을 제외한 성균인 - 18,000원\n- 성균관대 재적생이 아닌 외부인 - 20,000원\n*1타임 사전예약 시 인당 2,000원 할인', 100, 150, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(1, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/super1.webp'),
(1, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/super2.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '쿠파의 용암 떡볶이🌶️', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '슈퍼스타 튀김 세트🍟', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '요시 알 주먹밥🍙', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '받아라! 파이어마리오 볼🥏', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '꿈틀! 밟아봐 굼바🍫', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '음료수🥤', 2000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '라면🍜', 2000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(10, '사전예약', 'https://forms.gle/hAd75ksARGiuYEaB9'),
(10, '인스타그램', 'https://www.instagram.com/p/DONw2sGEUan/?utm_source=ig_web_copy_link&igsh=ZHF3MDZ4YmpoYXpk');

-- 2. ♨️불가마 24시 스파동 숙/취/전/문
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '♨️불가마 24시 스파동 숙/취/전/문', '♨️불가마 24시 스파동 숙/취/전/문', '2025 ESKARA!!!\n연석동아리연합회가 제대로 미쳤어요 🥵\n(공자: 인정;)\n\n불가마보다 화끈한 인심,\n얼음방보다 시원한 메뉴가 여러분을 기다립니다!\n\n역대급 메뉴 라인업과 함께\n술찜질 한 번 시원하게 가보자고 😵\n\n💸 입욕료\n성균관대학교 중앙동아리인 15,000원\n(중앙동아리인이 아닌) 성균인 17,000원\n비성균인 20,000원\n\n* 1개 타임, 1인 기준\n* 2개 타임 이상 연속 예약시 2000원 할인\n\n1부: 18:00~19:30\n2부: 19:40~21:10\n3부: 21:20~23:00', 120, 170, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/bool.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '맥반석 냉동삼겹살 🥩', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '얼음방 ice묵사발 🥶', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '온천수 어묵탕 🍢', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '황토숙성 감자튀김 🍟', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '장인이 구운 계란 🥚', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '시원한 살얼음식혜 🧊', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(11, '사전예약', 'https://forms.gle/4K88qWtXVyQTW2Zc8'),
(11, '인스타그램', 'https://www.instagram.com/p/DOTQUusjyL_/?utm_source=ig_web_copy_link&igsh=MTYzeDFmd2IxbnEwcQ==');

-- 3. 솦융이랑 유대랑 싸우나 TODO image
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '솦융이랑 유대랑 싸우나', '♨️솦융이랑 유대랑 싸우나♨️에서 식혜로 머리 좀 식혜고 가실래요…? 🧠🌡️', '👤👤뭐야…?👤👥**솦융이랑 유대랑 싸우나봐…**👥 👤수군수군....👥👥엥 왜 싸우는데…?👤👥웅성웅성👤👤👥\n\n……알고 보니 솦융이랑 유대랑 싸우나를 개업한 거였다네요 💦💦\n\n🔊 Boys&Girls을 위한 합석 시스템 2/4/시(아님)/양/일/운/영 🥵🥵\n\n♨️ 양일 이용시간\n◈ 1타임 (18:30~20:00)\n◈ 2타임 (20:10~21:40)\n◈ 3타임 (21:50~23:00)\n\n♨️ 타임별 이용 금액\n소프트웨어융합대학 및 유학대학 소속 원전공생\n| 사전예약 15,000원 / 워크인 17,000원\n그 외 성균인 | 사전예약 17,000원 / 워크인 19,000원\n非성균인 | 사전예약 19,000원 / 워크인 21,000원', 140, 190, '2025-09-11 18:30:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/13.webp');

insert into booth_link (booth_id, label, href) values
(12, '인스타그램', 'https://www.instagram.com/p/DOWKw4lkoYU/?utm_source=ig_web_copy_link&igsh=dHA4dHR2OWxoNDg0');

-- 4. 인어공酒(주)
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '인어공酒(주)', '무슨 9월이 이렇게 덥고 습해?💦 차라리 바닷속에서 사는 게 낫겠다!', '그래서 만들었습니다. 해저호텔.\n시원한 바닷속에서 술도 마시고 축제도 즐겨요!\n\n**입장료**\n<사전예약>\n✅ 사범대학, 성균융합원 소속: 16,000원\n✅ 타 단과대학 성균인: 19,000원\n✅ 외부인: 21,000원\n\n<현장접수>\n✅ 사범대학, 성균융합원 소속: 17,000원\n✅ 타 단과대학 성균인: 20,000원\n✅ 외부인: 22,000원', 160, 210, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/ariel.webp'),
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/ariel2.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🪼 물고기들 눈 감아…어묵탕', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🪼 인어공주도 몰래 먹는 두부김치', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🪼 고래 싸움에 등 터진 새우볶음밥', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🪼 해적도 탐내는 황금빛 황도', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🪼 상어 이빨 나쵸', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(13, '사전예약', 'https://forms.gle/kBYurq3R1c27VZGs6'),
(13, '인스타그램', 'https://www.instagram.com/p/DOVJYCekpaE/?utm_source=ig_web_copy_link&igsh=ZjJudzFkamVzeG4x');

-- 5. 예스(yes), 크리스마스! TODO image
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '예스(yes), 크리스마스!', '1398년 성균관 주막, 잊지 못할 한 철의 추억을 빚는다.', '**컨셉 소개**\n\n성균관대학교 건학 연도 **1398년**을 모티브로 한 **조선시대 주막 콘셉트 체험형 주점**!\n\n포토존과 체험 요소를 통해 **ESKARA:초록의 파도**에서 특별한 하루를 선사합니다.\n\n전통의 정취 속에서 특별한 ''가을 추억''을 만들어보세요. 🌙✨\n\n*약과는 서비스~ ♡̊̈*', 180, 230, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '묵사발', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '두부김치', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '김치전 / 부추전', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '장국', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '컵라면', 1500, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '식혜', 1000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(14, '사전예약', 'https://forms.gle/EEQs6EfcXbzYyG7V9'),
(14, '인스타그램', 'https://www.instagram.com/p/DOTfKtuEi8v/?utm_source=ig_web_copy_link&igsh=cXhsaDJ0bXJlNXFu');

-- 6. 골 때리는 킥 호프
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '골 때리는 킥 호프', '📢 아, 말씀드리는 순간 시작하는 어마어마한 빅매치!', '시작하자마자 분위기는 이미 풀타임을 넘어 승부차기 직전! 하지만 이 경기의 결과는 언제나 같습니다.가득한 웃음과 잊지못할 추억, 그리고 내일 약간 힘든 숙취까지. 🍻\n\n2025 에스카라, 여러분의 오늘을 가장 빛나는 하이라이트로 만들어 드립니다!\n\n**입장료**\n\n**사전예약: 8000원\n\n현장대기:\n[성균인] 10000원\n[외부인] 11000원\n\n[1타임] 18:00 ~ 20:00\n[2타임] 20:00 ~ 21:30\n[3타임] 21:30 ~ 23:00**', 200, 250, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(15, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/soccer1.webp'),
(15, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/soccer2.webp'),
(15, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/soccer3.webp');

insert into booth_link (booth_id, label, href) values
(15, '사전예약', 'https://forms.gle/uoMifkozS78dpPp86'),
(15, '인스타그램', 'https://www.instagram.com/p/DOVCqfdEt0l/?utm_source=ig_web_copy_link&igsh=M3l0aGVlcGtrMWU0');

-- 7. 이자카藥 (IZAKAYAK)
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '이자카藥 (IZAKAYAK)', '✨ 약대가 말아주는 단짠단짠 일본 감성 주점 ✨', '💹이날의 환율 : ¥ 1,000 = 10,000 ₩\n\n💰 입장료(인당)\n성균인: ¥ 1,000\n외부인: ¥ 1,500\n(현장 입장 시 + ¥ 200 추가)', 220, 270, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(7, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/izakaya1.webp'),
(7, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/izakaya3.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '에다마메🫛', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '김부각🥢', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '오코노미야키🥬🐙', 12000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '오뎅 나베🍢', 9000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '유즈폰즈 가라아게🍋🍗', 14000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '모둠 야키토리 셋또🍡', 12000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '철판 교자 🥟🔥', 9000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '스페셜 하이보루✨', 4000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(16, '사전예약', 'https://forms.gle/x6E3Ea8z2ASdjFdp9'),
(16, '인스타그램', 'https://www.notion.so/7-IZAKAYAK-2678b91a086b80e48976f9dbb263b80c');

-- 8. 만병통취약💊
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '만병통취약💊', '💊 오늘 밤, 처방은 술 한 잔! 🍺✨', '🍻 약대로 놀러오면 부작용은 ''행복''뿐! 😍\n\n🥂 오늘의 약효: 친구와 웃음, 술 한잔 💊\n📌 복용법: 주점에서 무한 리필! 🔄\n\n🍶 스트레스 OUT 👉 만병통치 처방전은 여기서! 🧾\n💊 약학대학 학생회 주점에서 힐링하세요 🌙\n\n✅️ 입장료: 성균인 15,000원 / 외부인 18,000원\n(1타임 사전예약 할인: 성균인 12,000원 / 외부인 15,000원)', 240, 290, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(8, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/man1.webp'),
(8, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/man2.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍢 오뎅탕이레놀', 7000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🥢 아랍두부김치', 7000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🌭 모둠소세진통제', 7000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🌽 나(약)쵸', 4000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🔥 까르르불닭', 4000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍗 닭다리 과자', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🥔 마카로니', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(17, '인스타그램', 'https://www.instagram.com/p/DOSYp02E0IJ/?utm_source=ig_web_copy_link&igsh=NDBpbDN6azJkYWt0');

-- 9. 컴comm온! 산리오🩵
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '컴comm온! 산리오🩵', '미디어커뮤니케이션학과 주점', '**입장료**\n\n🩷 미컴 원전공생 - 16000원\n🩵 성균관대학교 재학/휴학생 - 18000원\n🩶 외부인 - 20000원\n\n**[1타임]** 18:00~19:30\n**[2타임]** 19:45~21:15\n**[3타임]** 21:30~23:00', 260, 310, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(9, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/come1.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '😈 쿠로미의 악랄한 장난 (불닭볶음면)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍥 마이멜로디의 순정 (기본 라면)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍳 구데타마의 침대 (볶음밥)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍿 폼폼푸린의 꽃다발 (팝콘)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍟 포차코의 다이어트 실패 (감자튀김)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍡 시나모롤의 쫀득 뱃살 (꿀가래떡)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '💦 한교동의 눈물 (블루레몬 에이드)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍑 모카의 복숭아 알레르기 (복숭아에이드)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍎 키티의 리본 볶음 (떡볶이)', 3000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(18, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🍜 산리오 중국여행 (마라탕)', 5000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(18, '사전예약', 'https://forms.gle/BimAw2kFrzLXAbQ6A'),
(18, '인스타그램', 'https://www.instagram.com/p/DOVX9FWjyxr/?utm_source=ig_web_copy_link&igsh=MWJjamVydzUzcXpuaw==');

-- TODO
-- 10. 부추전, 김치전, 인자전, let’s go
-- https://forms.gle/WeEGbHWijKHSY1BC8
-- https://skkuscatchhssc.notion.site/10-let-s-go-2678b91a086b80cbb626d27dc106f010

-- day1
-- 1. 헤라의 불시착
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '헤라의 불시착', '올림푸스의 신들이 성균관대에 불시착?!', '제우스⚡️: 뭐야.. 여기가 어디야?\n디오니소스🍷: 너 때문에 흥이 깨져버렸으니까 책임져\n오르페우스🎵: 알겠습니다. 디오니소스님\n\n이제 캠퍼스가 신들의 연회장으로 변신합니다\n가장 찬란한 가을밤, ✨별들의 연회✨에서 신들과 함께 놀아보세요\n\n**입장료**\n\n🏛️사전예약🏛️\n👥헤라/로타랙트 부원 15,000원\n👥성균인 17,000원\n👥외부인 19,000원\n\n🏛️현장접수🏛️\n👥헤라/로타랙트 부원 16,000원\n👥성균인 18,000원\n👥외부인 20,000원', 280, 150, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/hera1.webp'),
(10, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/hera2.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(19, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '치즈 플레이트', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(19, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '넥타르(포도주스+탄산수)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(19, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '포세이돈의 오뎅탕', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(19, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '아테나의 떡볶이', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(19, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '데메테르의 감자와 소시지', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(19, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '제우스의 치즈불닭볶음면', 5000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(19, '사전예약', 'https://docs.google.com/forms/d/e/1FAIpQLSdobACDxAyFkmF2inzTQ1VpSMqio2KdyVomvOSVuR7GOcinig/viewform'),
(19, '인스타그램', 'https://www.instagram.com/p/DONpzDMgCOR/?utm_source=ig_web_copy_link&igsh=MWd0dDlheTVubGt3dQ==');

-- 2. ㄴr는… ㄱr끔… 술을 흘린ㄷㅏ…
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', 'ㄴr는… ㄱr끔… 술을 흘린ㄷㅏ…', 'ㄱ ㅣ 억 ㄴ r니..? 싸이월드 / Y2K 감성주점', '싸이월드, 미니홈피, 도토리…\n\n나… 그냥 옛 추억에 잠식돼서…\n이런… 주점… 만들었어…\n\n그때…\n우린… 아무것도 없어도…\n도토리 하나면… 행복했잖아…☆\n\n**입장료**\n\n💃무용학과, 신소재공학부 및 사전예약🕺 [16,000원]\n🌱성균인🌱 [18,000원]\n외부인 [20,000원]\n\n예약 가능 시간💃\n[1부] 18:00 ~ 19:30\n[2부] 19:30 ~ 21:00\n[3부] 21:00 ~ 22:30', 300, 170, '2025-09-11 18:00:00', '2025-09-11 22:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/na1.webp'),
(11, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/na2.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(20, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '제육볶음', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(20, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '참치마요 주먹밥', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(20, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '들기름 계란후라이', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(20, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '꾀돌이, 쫀드기', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(20, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '컵라면', 2000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(20, '사전예약', 'https://naver.me/G4GdyLAl'),
(20, '인스타그램', 'https://www.instagram.com/p/DOVHiumD9dK/?utm_source=ig_web_copy_link&igsh=YjFtOHlnMnFheTFv');

-- 3. 우끼끼친
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '우끼끼친', '2025년, 드디어 원숭이들이 캠퍼스로 상륙했다', '**입장료**\n\n📍입장료(안주 가격은 별도입니다)\n🏃현장:\n공과대학 원전공생 - 1인당 15,000원\n성균인 - 1인당 17,000원\n외부인 - 1인당 25,000원\n\n🎊사전예약 특가:\n공과대학 원전공생 - 1인당 13,000원\n성균인 - 1인당 15,000원\n외부인 - 1인당 20,000원', 320, 190, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(12, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/wookiki1.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(21, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '바나나칩과 견과류', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(21, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '원숭이 볶음밥', 12000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(21, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '닭강정', 13000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(21, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '오뎅탕', 11000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(21, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '불파게티', 9000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(21, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '바나나 브륄레', 7000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(21, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '화채', 7000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(21, '사전예약', 'https://forms.gle/rHx3GYCnwrBnNpQK7'),
(21, '인스타그램', 'https://www.instagram.com/p/DOaq0f1EYJb/?utm_source=ig_web_copy_link&igsh=MXE2MjQxdjF3YjZiOQ==');

-- day1
-- 1. 엔젤항공🪽✈️
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '엔젤항공🪽✈️', '손님 여러분, 환영합니다. 에스엔젤 소속 엔젤항공 SA1004편은 여러분의 탑승을 기다리고 있습니다. 🪽', '우리 비행기는 2025 에스카라(ESKARA)를 향해 곧 이륙할 예정입니다.\n\n지금부터 즐거운 여행를 함께 떠나보시죠. ✈️\n\n**입장료**\n\n🪽사전예약\n8000원\n\n🪽현장예매\n- 성균인 : 9000원\n- 외부인 : 10000원', 280, 330, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(13, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/angel1.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '프레첼', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '오렌지 주스', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '치즈 그라탕', 15000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '구름 떡볶이', 15000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '닭강정', 15000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '나쵸', 5000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '라면', 3500, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(22, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '콘치즈', 8000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(22, '사전예약', 'https://forms.gle/4SYT3pnVduU4cu8Y8'),
(22, '인스타그램', 'https://www.instagram.com/p/DOVtmDgD5aY/?utm_source=ig_web_copy_link&igsh=MXF6eWN0dTE2ZmU0OA==');

-- 2. 가면酒도회 🎭
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '가면酒도회 🎭', '오늘 밤 무대의 주인공은 바로 당신입니다 🌙', '가면을 쓰고 들어서는 순간,\n당신은 이 밤의 주인공\n\n알 수 없는 사람들과 잔을 부딪히며\n속삭임과 웃음이 흐르는 곳—\n이곳은 바로 가면酒도회\n\n한 잔의 술, 한 개의 가면\n그리고 끝없는 밤\n\n새로운 무대의 주인공을 환영합니다 🎭\n\n입장료\n극회인: 13,000원\n성균인: 15,000원\n외부인: 17,000원\n\n[1타임] 18:00 – 19:30\n[2타임] 19:30 – 21:00\n[3타임] 21:00 – 23:00', 300, 350, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/gamyeon1.webp'),
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/gamyeon2.webp'),
(14, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/gamyeon3.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(23, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🌮 가면 속 도리토스 타코', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(23, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🥂 입 안에서 펼쳐지는 카나페 갈라쇼', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(23, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '✨ 황금빛 미트볼 디너쇼', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(23, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🌙 달빛 속 빛나는 콘치즈', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(23, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '컵라면', 4000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(23, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '물', 1000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(23, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '포도 환타', 2000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(23, '사전예약', 'https://docs.google.com/forms/d/1rT_Mm1RE5Jmsd1dtZ8_Myoix8gFjUV0lhAd1Pdr39lE'),
(23, '인스타그램', 'https://www.instagram.com/p/DOVKSAqAbRC/?utm_source=ig_web_copy_link&igsh=MXVvM2FuODl4dGg5MA==');

-- 3. F1: AIimi Pit Stop
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', 'F1: AIimi Pit Stop', '🏎️ "Pit in, All in" 🏎️', '끝나지 않는 레이스, 지치신다고요?\n여기, Pit Stop 에서 연료 충전하고 가세요!\n\n심장은 엔진, 안주는 코너, 알콜은 연료,\nLights out and away we go!\n\n**입장료**\n\n<사전예약(예약금)>\n✳️ 특성학과 학부생: 11,000원\n✳️ 타 단과대학 성균인: 13,000원\n✳️ 외부인: 15,000원\n\n<현장접수>\n🔆 특성학과 학부생: 12,000원\n🔆 타 단과대학 성균인: 14,000원\n🔆 외부인: 16,000원\n\n➕ 1시간 추가 금액: 10,000원\n\n🛞[1타임] 18:00-19:30\n[2타임] 19:30-21:00\n[3타임] 21:00-22:50', 320, 370, '2025-09-11 18:00:00', '2025-09-11 22:50:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(15, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/f1.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🃏 GBAston Martin의 Final Lap 떡볶이', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🚨 Gerrari의 엔진 쿨러 화채', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🚧 GLD Bull의 Pit Stop 어니언링&나쵸', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🚦Swilliams의 2가지 플래그 음료', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🎥 Kick SSEber의 썸머 서킷 김치말이국수', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '⚙️ MEDass의 Box Box 치즈 나쵸', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '♣️ PharmLaren의 Pit Stop 마약 콘치즈', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '🎰 GBMErcedes의 브래드 피트도 반한 주먹밥', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(24, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '물', 2000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(24, '사전예약', 'https://naver.me/FNItMYPq'),
(24, '인스타그램', 'https://www.instagram.com/p/DOUW8N-Eufo/?utm_source=ig_web_copy_link&igsh=MXR2NjllcDVicmdkYQ==');

-- 4. 1루수가 누구야
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '1루수가 누구야', '📣 오늘 주점 경기 요약드립니다. 맥주 1루타, 칵테일 2루타, 소주 홈런~!', '최종 스코어는 숙취 10 : 간 0\n"오늘 경기 MVP는 여기 온 당신입니다!"\n\n**입장료**\n\n**외야석, 3루석**\n🟢 성균인 : 15,000원 / 사전 예약가 : 14,000원\n🔴 외부인 : 17,000원\n\n**1루석**\n🟢 성균인 : 18,000원 / 사전 예약가 : 17,000원\n🔴 외부인 : 20,000원', 340, 390, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/baseball1.webp'),
(16, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/baseball2.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '1️⃣번 두산 나쵸 한입 베어스', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '2️⃣번 롯데 자이언츠 삼진 어묵탕', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '3️⃣번 KT 매지컬 체리콕', 3000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '4️⃣번 키움 히어로즈 에너지드링크 칵테일', 3000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '5️⃣번 NC 다이노스 공룡 모히또', 3000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '6️⃣번 삼성 라이온즈 블루레몬에이드', 3000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '7️⃣번 LG 트윈스 츄러스', 3000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '8️⃣번 한화 이글스 불닭 + 콘치즈', 4000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '9️⃣번 기아 타이거즈 무등산 수박 화채', 4000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(25, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '선발투수 SSG 랜더스 홈런 주먹밥 + 컵라면', 4000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(25, '사전예약', 'https://forms.gle/pHKRxAwmH7d4hQXE7'),
(25, '인스타그램', 'https://www.instagram.com/p/DOUpfytE-EU/?utm_source=ig_web_copy_link&igsh=MXh3OWoycTBhcGlocQ==');

-- 5. 술과 취히로의 행방불명
insert into booth (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) values
(1, 6, 'Store', '술과 취히로의 행방불명', '이름을 잃어버린 당신, 신비로운 주점에 초대합니다.', '''술과 취히로의 행방불명''에서 익명의 이름표를 받고, 진짜 인연을 찾아보세요. 따뜻한 홍등 아래, 술 한잔과 함께 새로운 이야기가 시작됩니다.\n\n📌 가격(타임당)\n[성균인] 18,000원\n[외부인] 20,000원\n\n[1타임] 18:00 ~ 19:30\n[2타임] 19:45 ~ 21:15\n[3타임] 21:30 ~ 23:00', 360, 410, '2025-09-11 18:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_image (booth_id, src) values
(17, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/chihiro1.webp');

insert into menu (store_id, image, name, price, created_at, modified_at) values
(26, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '기본 안주(알새우칩)', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(26, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '오코노미야끼', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(26, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '주먹밥', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(26, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '닭꼬치', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(26, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '오뎅탕', 0, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(26, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '음료(콜라)', 2000, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(26, 'https://dytktlylpptxuzaiiaof.supabase.co/storage/v1/object/public/line-up/placeholder.jpg', '물', 1000, '2025-09-11 00:00:00', '2025-09-11 00:00:00');

insert into booth_link (booth_id, label, href) values
(26, '사전예약', 'https://forms.gle/VR6wrTJ4sQtL1ap27'),
(26, '인스타그램', 'https://www.notion.so/5-2678b91a086b80aaa84aeb9885c65720');

-- booth TODO gate
INSERT INTO marker (area_id, category_id, dtype, name, summary, description, x, y, open, close, type, created_at, modified_at) VALUES
(null, 1, 'Booth', '메인 스테이지', '10:00 ~ 상시 입장', NULL, 0, 0, '2025-09-11 10:00:00', '2025-09-12 23:59:59', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 2, 'Booth', '프로모션', '업체별 운영 시간 상이', '프로모 공지글로 이동 (lineup 서비스 내)', 0, 0, '2025-09-11 00:00:00', '2025-09-12 23:59:59', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 4, 'Stop', '인자셔틀 정류장', '정류장 한줄소개', '정류장 설명', 80, 260, '2025-09-11 09:00:00', '2025-09-11 18:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
(null, 7, 'Store', '총학생회 굿즈샵', '11:00 ~ 20:00', NULL, 0, 0, '2025-09-11 11:00:00', '2025-09-12 20:00:00', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 7, 'Booth', '티셔츠 배부', '1일차 12:00~ 2일차 10:00~ ', NULL, 0, 0, '2025-09-11 12:00:00', '2025-09-12 23:59:59', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 7, 'Booth', '프리오더 현장 배부', '11:00 ~ 18:00', NULL, 0, 0, '2025-09-11 11:00:00', '2025-09-12 18:00:00', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 8, 'Booth', '취식존', '10:00 ~ 22:00', NULL, 0, 0, '2025-09-11 10:00:00', '2025-09-12 22:00:00', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 8, 'Store', '푸드트럭', '11:00 ~ 23:00', NULL, 0, 0, '2025-09-11 11:00:00', '2025-09-12 23:00:00', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 9, 'Booth', '화장실', '상시 이용 가능', NULL, 0, 0, '2025-09-11 00:00:00', '2025-09-12 23:59:59', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 10, 'Store', '셀프 촬영 부스', '상시 이용 가능', NULL, 0, 0, '2025-09-11 00:00:00', '2025-09-12 23:59:59', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00'),
(null, 10, 'Booth', '총학생회 촬영 부스', '11:00 ~ 18:00', NULL, 0, 0, '2025-09-11 11:00:00', '2025-09-12 18:00:00', NULL, '2025-09-10 00:00:00', '2025-09-10 00:00:00');

-- post
insert into post (title, content, created_at, modified_at) values
('행사 복지 안내', '안녕하세요, 성균관대학교 제57대 총학생회 S:CATCH입니다.\n\n2025 ESKARA: 초록의 파도를 함께하시는 성균인의 복지를 위한 행사 복지 안내입니다.\n\n- ESKARA 기간 학부 수업\n9. 11. (목) - 9. 12. (금) ESKARA 행사 기간 동안 학부 수업이 온라인으로 전환됩니다.\n* 단, 교강사 재량에 따라 수업 운영 방식이 상이할 수 있으며, 수업별 운영 방식에 따라 일부 과목은 기존과 동일하게 오프라인으로 진행될 수 있으니 참고 부탁드립니다.\n\n- 기숙사 통금 연장\nESKARA 기간 동안 학우 여러분의 원활한 귀가를 위하여 9. 11. (목) 자과캠, 인사캠 양 캠퍼스의 기숙사 통금이 연장됩니다.\n* 기존 1:00 》 연장 2:00\n* 9. 12. (금)은 통금 시간이 적용되지 않습니다.\n\n- 건강센터 운영 연장\n축제 내 안전사고를 대비하여 ESKARA 양일간 자연과학캠퍼스 건강센터가 연장되어 운영됩니다.\n* 기존 9:00 - 17:30 》 연장 9:00 - 22:00\n* 위치: 성균관대학교 자연과학캠퍼스 복지회관 2층\n\n- 배리어프리존 및 속기 안내\n- 성균관대학교 장애 학우분들을 대상으로 배리어프리존을 운영합니다.\n- 축제 중 아티스트 공연 동안 전광판 화면으로 속기가 진행될 예정입니다.', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('셀프 촬영 부스 운영', 'ESKARA 기간 학우분들의 소중한 기억을 편리하게 기록하기 위해 양 캠퍼스 모두에 셀프 촬영 부스를 설치합니다.\n\n설치업체 및 대수\n자연과학캠퍼스: 아우라픽 포토부스 2대\n인문사회과학캠퍼스: 구도필름 포토부스 2대\n\n설치 기간\n자연과학캠퍼스: 2025. 9. 10. (수) - 2025. 9. 13. (토)\n인문사회과학캠퍼스: 2025. 9. 8. (월) - 2025. 9. 13. (토)\n* 철거는 13일 오전 또는 낮 중 이른 시간에 진행될 수 있으니, 이 점 양해 부탁드립니다.\n\n설치 장소\n자연과학캠퍼스: 학생회관 1층 필로티 우리은행 ATM 옆\n인문사회과학캠퍼스: 경영관 1층 필로티 좌측\n\n촬영 비용\nHalf-cut: 5,000원\nFull-cut: 6,000원', '2025-09-04 10:00:00', '2025-09-04 10:00:00'),
('드레스코드 안내 및 ESKARA 티셔츠 배부', 'DRESS CODE - DEEP GREEN\n\nESKARA의 드레스코드 - DEEP GREEN으로 더욱 깊은 초록의 파도를 만들어 주세요.\n\n2025 ESKARA, 성균인 모두가 하나되어 초록의 파도를 이룰 수 있도록 9. 11. (목), 9. 12. (금) 양일 대운동장 내부에서 티셔츠를 배부합니다.\n\n* 성균인이라면 누구나 수령 가능합니다. (본교 재학생, 휴학생, 수료생, 졸업생, 대학원생, 유학생, 교직원)\n* 티셔츠는 행사 기간(양일 통합) 동안 1인 1벌만 수령 가능합니다.\n\n- 위치: 대운동장 내 티셔츠 배부 부스\n- 시간: 9. 11. (목) 오후 12시 ~ 소진 시까지 / 9. 12. (금) 오전 10시 ~ 소진 시까지', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('통제구역 및 안전 매뉴얼', '안녕하세요, 성균관대학교 제57대 총학생회 S:CATCH입니다.\n\nESKARA: 초록의 파도가 안전하게 운영되기 위한 통제구역 및 안전 매뉴얼을 안내드리니 확인하시고 숙지 부탁드립니다.\n\n[통제구역 안내]\n- 기숙사 사생 외, 성균인을 포함한 모든 인원의 기숙사 출입이 전면 통제됩니다.\n- 양일 모두 축구장-수성관 사이 도로와 도로 방면 수성관 문/야외계단이 전면 통제됩니다.\n- 양일 모두 대운동장 우측 샛길을 통한 대운동장 진입이 전면 통제됩니다.\n- 성균인의 안전한 입장을 위하여, 양일 모두 축구장 방면 대운동장 우측 구역이 전면 통제됩니다.\n- 양일 모두 후문부터 신관 삼거리 사이 도로가 푸드트럭존으로 활용되며, 차량 통행이 전면 통제됩니다\n- 양일 모두 전 건물의 옥상 진입이 전면 통제됩니다.\n\n[반입금지물품 안내]\n1. 전문 촬영기기: 핸드폰 제외 모든 촬영 기기\n2. 시야 방해 물품: 장우산, 사다리, 간이형 의자, 모든 형태의 응원봉, 셀카봉\n3. 위험한 물품: 유리병(류), 화약류, 칼/가위 등 뾰족한 물품\n4. 기타: 유모차/자전거 등 이동수단', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('티켓 수령 / 외부인 티켓 안내', '2025 ESKARA: 초록의 파도 성균인 티켓 사전예약이 9. 5. (금) 23:59 마감되었습니다.\n\n현재 약 11,000명 분의 티켓이 사전예약되었으며, 잔여 티켓은 성균인에게 현장 접수로 배부되거나 외부인에게 배부될 예정입니다.\n\n✅️ 티켓 수령 가능 시간\n10:00 - 14:00: 성균인 중 티켓 사전예약자\n14:00 - 22:00: 성균인 (예약자 / 비예약자 모두)\n15:00 - 22:00: 외부인\n\n✅️ 티켓 수령 위치\n성균인 티켓 (예약자 / 비예약자 모두) : 복지회관 앞 티켓부스\n외부인 티켓: 삼성정보학술관 앞 글로벌 광장 티켓부스\n\n✅️ 외부인 티켓 수령 안내\n환경부담금: 18,000원\n지불방법: 현장 계좌이체', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('대운동장 입장 시스템', '9. 12. (금), 축제 둘째 날에는 더욱 안전하고 질서 있는 축제를 위해 입장 티켓 소지자만 대운동장 입장이 허가됩니다.\n\n* 11일에는 별도의 성균인 확인이 진행되지 않으며, 누구든 자유로운 관람이 가능합니다.\n* 준비된 수량의 티켓이 소진되었을 경우, 도장으로 대체될 수 있습니다.\n\n✅️ 입장 티켓 수령 안내\n복지회관 앞 티켓부스에서 입장 티켓 수령을 마친 후, 실무단의 안내를 따라 메인 게이트 쪽으로 입장해 주시기 바랍니다.\n\n✅️ 대운동장 게이트 안내\n입장 가능 - 메인 게이트, 구령대 게이트\n퇴장 가능 - 메인 게이트, 퇴장 게이트\n\n✅️ 소지품 검사\n진행 양일 간 안전 문제에 대비하기 위하여 대운동장 입장 시 소지품 검사가 진행됩니다.', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('인자/자인셔틀 증차 및 인사캠 패스트트랙', 'ESKARA 기간 성균인들의 교통 편의 증진을 위하여 축제 양일간 인자/자인셔틀이 증차됩니다.\n\n• 인자/자인셔틀 증차\n- 인자셔틀 탑승 위치: 학생회관 앞\n- 자인셔틀 탑승 위치: (낮) N센터 건너편 / (밤) 수성관 앞\n\n• 인문사회과학캠퍼스 성균인을 위한 패스트트랙\n인문사회과학캠퍼스에서 출발하는 성균인이 더욱 빠르고 편리하게 2025 ESKARA를 즐기실 수 있도록, 인문사회과학캠퍼스에서 미리 입장 티켓을 수령할 수 있는 패스트트랙 제도를 실시합니다.\n\n운영 장소&시간\n- 9. 12. (금) 비천당 앞\n- 사전예약자 발급ㅣ9:30 - 14:00\n- 현장 발급ㅣ14:00 - 16:30', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('F&B 및 배달존', '2025 ESKARA: 초록의 파도에서 눈과 입이 함께 즐거울 수 있도록 다양한 F&B를 준비하였습니다.\n\n푸드트럭 운영 안내\n- 위치: 후문 - 신관 사이 도로\n- 운영 시간: 양일 11:00 - 23:00\n\n배달존 운영 안내\n- 위치: 후문 앞 외부 구역\n- 운영 시간: 양일 10:00 - 22:00\n\n취식존 운영 안내\n- 위치: 대운동장 내 동산 방향 계단\n- 운영 시간: 양일 10:00 - 22:00\n* 대운동장 트랙 안쪽부터는 취식이 불가합니다.', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('SKKU TOWN', 'SKKU TOWN은 대학과 지역이 함께하는 축제 공간으로, 지역 상권과의 협업을 통해 다채로운 즐길 거리를 제공합니다.\n\nSKKU TOWN 기간\n- 상권 제휴: 9. 11. (목) - 9. 12. (금)\n- 인문사회과학캠퍼스 현수막 게시: 9. 8. (월) - 9. 12. (금)\n\nSKKU TOWN 내용\n- 캠퍼스 인근 축제 분위기 조성\n- 축제 기간 특별 혜택 제공\n- 매장 내 축제 플레이리스트 재생\n- 매장 운영 시간 새벽 3시 이후 연장\n- (인문사회과학캠퍼스) 거리 현수막 게시', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('프로모션 및 후원사', '2025 ESKARA: 초록의 파도에 풍성한 콘텐츠를 더해줄 프로모션 및 후원사를 소개합니다!\n\n메인 후원사\n우리은행\n성균관대학교 총동창회 | 인자-자인셔틀 40대 후원\n\n양일 부스 입점사\n프로모션 구역: 대운동장 농구장 옆\n온누리 상품권 | 양일 11:00 – 16:00\n빗썸 | 양일 11:00 – 17:00\n밝은성모안과 | 양일 11:00 – 16:00\ncounselor | 양일 11:00 – 23:00\n\n협찬품 제공\n농심 | 츄파춥스 오션믹스 젤리 (총 5,000개)\n자연은 | 자연은 크렘브륄레맛 or 크림치즈케이크맛 (총 4,000개)', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('응원제 1398 1부', '하나 된 성균관을 외치는 응원제 1398.\n모두가 어깨를 걸고 하나 되어, 대운동장을 가득 메울 여러분의 뜨거운 열정을 보여주시기 바랍니다!\n\n성균인이 만들어내는 응원의 파도가, 곧 하나의 초록의 파도로 번져가길 기대하며, ESKARA에서 성균인 여러분을 기다리겠습니다.', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('응원제 1398 2부: Finale', '응원제 1398 2부: Finale는 모두가 원을 이루고, 성균인이 사랑하는 응원가를 쉼 없이 폭발적으로 쏟아내는 순간이자 응원제의 하이라이트입니다.\n축제의 마지막 순간까지 성균관을 외치며, 성균인의 뜨거운 열정을 불태우는 시간을 함께하시기 바랍니다.\n\n이 순간, 성균인은 하나.\n대운동장에서 펼쳐질 응원제 1398 2부: Finale에서 여러분을 기다립니다!', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('포토부스 이벤트 안내', '안녕하세요, 성균관대학교 제57대 총학생회 S:CATCH입니다.\n\n2025 ESKARA 포토부스 이벤트 안내드립니다.\n\n부스 운영 시간\n양일 11:00 - 18:00\n\n부스 운영 장소\n대운동장 구령대 옆 포토슛캐치 부스\n\n포토부스 이벤트 참여 방법\n1. 구령대 옆 포토슛캐치 부스를 방문합니다.\n2. 원하는 카메라를 선택합니다. (폴라로이드 or 디카)\n3. 부스 앞 초록의 파도 포토존에서 다양한 소품과 함께 사진을 촬영합니다.\n4. 보정 여부를 선택합니다.\n5. 오직 2025 ESKARA: 초록의 파도에서만 찍을 수 있는 사진 득템!\n\n@skku_eskara 계정 태그 이벤트\n당첨자 13명 선정\n에어팟 4세대 1명\n5만원 상당의 스탠리 텀블러 2명\n배달의 민족 2만원 상품권 10명', '2025-09-10 10:00:00', '2025-09-10 10:00:00'),
('종합 안내', '불어오는 바람을 따라 더욱 거세게 일렁일, 2025 ESKARA: 초록의 파도가 드디어 하루 앞으로 다가왔습니다! 학우 여러분께서 보다 편리하게 정보를 확인하실 수 있도록 종합 안내 자보를 업로드하니 많은 관심과 참여 부탁드립니다.', '2025-09-10 10:00:00', '2025-09-10 10:00:00');

-- post_image TODO
insert into post_image (post_id, src) values
(1, 'https://example.com/post/event_schedule.jpg'),
(2, 'https://example.com/post/shuttle_change.jpg');

-- post_link
insert into post_link (post_id, label, href) values
(1, '행사 복지', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58149&article.offset=9&articleLimit=9'),
(2, '셀프 촬영 부스', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58182&article.offset=9&articleLimit=9'),
(3, '드레스 코드', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58197&article.offset=9&articleLimit=9'),
(4, '통제구역', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58228&article.offset=9&articleLimit=9'),
(5, '티켓 수령', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58239&article.offset=9&articleLimit=9'),
(6, '대운동장 입장', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58241&article.offset=0&articleLimit=9'),
(7, '인자/자인셔틀', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58242&article.offset=0&articleLimit=9'),
(8, 'F&B', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58246&article.offset=0&articleLimit=9'),
(9, 'SKKU TOWN', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58248&article.offset=0&articleLimit=9'),
(10, '프로모션', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58251&article.offset=0&articleLimit=9'),
(11, '응원제 1부', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58291&article.offset=0&articleLimit=9'),
(12, '응원제 2부', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58290&article.offset=0&articleLimit=9'),
(13, '포토부스 이벤트', 'https://student.skku.edu/student/notice3.do?mode=view&articleNo=58306&article.offset=0&articleLimit=9'),
(14, '종합 안내', 'https://www.instagram.com/p/DOavpxVEirx/?utm_source=ig_web_copy_link&igsh=YWh0aGV4ZHdlNXhk');

-- stop_time TODO
insert into stop_time (stop_id, time) values
(2, '08:00:00'),
(2, '09:00:00');

-- timeslot TODO href
insert into timeslot (name, start_time, end_time, href, created_at, modified_at) values
-- day1
('지성전 예선 및 본선', '2025-09-11 12:00:00', '2025-09-11 13:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('체력전', '2025-09-11 13:30:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('초록 원숭이', '2025-09-11 16:00:00', '2025-09-11 16:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('수원상륙작전', '2025-09-11 16:30:00', '2025-09-11 17:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('찐막', '2025-09-11 17:00:00', '2025-09-11 17:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('그루브', '2025-09-11 17:30:00', '2025-09-11 18:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
("나는 솔로_'돌싱' 특집", '2025-09-11 18:00:00', '2025-09-11 18:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('파아란', '2025-09-11 18:30:00', '2025-09-11 19:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('지성전 결승', '2025-09-11 19:00:00', '2025-09-11 19:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('불꽃소년 김정우', '2025-09-11 19:30:00', '2025-09-11 20:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('화려한 혈통', '2025-09-11 20:00:00', '2025-09-11 20:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('B.E.S.T.', '2025-09-11 20:30:00', '2025-09-11 21:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('화록청', '2025-09-11 21:00:00', '2025-09-11 21:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('아티스트', '2025-09-11 21:30:00', '2025-09-11 23:00:00', 'https://example.com/session/afternoon', '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
-- day2
('GRVN(그루븐)', '2025-09-11 14:00:00', '2025-09-11 14:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('솔카프', '2025-09-11 14:30:00', '2025-09-11 15:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('성균상사', '2025-09-11 15:00:00', '2025-09-11 15:30:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('놈놈놈', '2025-09-11 15:30:00', '2025-09-11 16:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('아티스트', '2025-09-11 16:00:00', '2025-09-11 19:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
("응원제 '1398' 1부", '2025-09-11 19:00:00', '2025-09-11 20:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
('아티스트', '2025-09-11 20:00:00', '2025-09-11 22:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00'),
("응원제 '1398' 2부:Finale", '2025-09-11 22:00:00', '2025-09-11 23:00:00', null, '2025-09-11 00:00:00', '2025-09-11 00:00:00');