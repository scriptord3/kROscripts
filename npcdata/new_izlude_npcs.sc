trader "izlude" "고기상인" 1_M_JOBGUIDER 160 186 0 0 0
OnInit:
	sellitem Meat // 50
return

npc "izlude" "키릭" 4W_M_01 140 186 3 0 0
OnClick:
	dialog "[키릭]"
	dialog "엣헴~! 저희 이즈루드는요. 이 땅위의 안전뿐만아니라 바로 저기 보이는 넓은 바다의 안전도 책임지고 있답니다."
	wait
	dialog "[키릭]"
	dialog "때문에 커다란 망원경을 설치하고 바다 멀리까지 미리미리 살펴두지요. 모든건 미리미리 대비해놓는게 제일이니까요."
	close
return

npc "izlude" "쿠스코알" 4_F_TELEPORTER 174 164 3 0 0
OnClick:
	dialog "[쿠스코알]"
	dialog "프론테라의 주점안은 항상 주민과 타지에서온 사람들의 대화로 시끌시끌하죠."
	dialog "여러곳의 사람이 모이는 곳이라 항상 정보가 넘쳐나는곳이기도 해요 잘 귀를 기울여보면 유용한 정보들을 많이 접할 수 있을꺼에요."
	close
return

npc "izlude" "병사" 8W_SOLDIER 166 156 2 0 0
OnClick:
	dialog "[병사]"
	dialog "에헤헤헤"
	dialog "응? 뭐가 그리 기분좋냐구?"
	dialog "알려주까?"
	wait
	choose menu "네 왜그러시는거에요?" "아니요" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[병사]"
	dialog "아아.. 요즘 일거리가 팍 줄어버렸거든 자네도 알고있겠지? 몬스터를 잡아서 나오는 전리품들을 상인들이 돈을 주고 사들이고 있는거 말이야"
	wait
	choose menu "네 알아요" "에? 그래요?" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[병사]"
	dialog "훗 사실 그거 우리 일이였거든"
	dialog "그런데 요즘들어 사냥꾼들이 부쩍늘었잖아 그래서 우리만으로는 감당하기가 너무 벅찼었어"
	wait
	dialog "[병사]"
	dialog "정말이지 매일 야근의 연속이였다니깐 그때를 생각하면.. 우으으으~~~"
	dialog "어쨌든 그래서 정부에서 약은수를 쓴거야 판매증을 소지하고 있어야만 현상금지급소에서 돈을 지불하게끔 한거지."
	wait
	dialog "[병사]"
	dialog "판매증은 다른 많은 사람들에게서 전리품을 사들일 수 있는 기본적으로 자금이 있고 일정한장소에 항상 있는 상인들에게 나눠주고 말이야"
	wait
	dialog "[병사]"
	dialog "그렇게 되서 지금은 찾아오는사람이 팍!줄어버려서 말이야 사실 그리 널널한것도 아니지만 무지하게 편하게 느껴진단말이야~"
	dialog "역시 사람은 한번쯤은 힘든일을 겪어봐야 편한게 뭔지 알게된다니깐"
	dialog "하하하!"
	close
return

npc "izlude" "아레나#nb1" 4_BULLETIN_BOARD2 207 167 3 0 0
OnClick:
	dialog "== 도전 하라! 아 레 나! =="
	dialog " "
	dialog "몬스터와의 숨가쁜 전투!"
	dialog "자신의 한계점은 어디인가!"
	dialog "동료와 함께 하는 PVE 파티!"
	dialog "이 모든 것을 아레나에서..!"
	close
return

npc "izlude" "로카스#izj" 4_M_02 155 132 4 0 0
OnClick:
	dialog "[로카스]"
	dialog "오리데오콘 이나 에르늄의 원석을 각각 5개씩 가져오면 곧장 오리데오콘과 에르늄으로 만들어 드립니다."
	wait
	choose menu "오리데오콘 정제." "에르늄 정제." "궁금한 걸 물어본다." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	endchoose
	dialog "[로카스]"
	dialog "오리데오콘 원석 5개를 오리데오콘 1개로 정제하시겠습니까?"
	wait
	choose menu "1개교환" "원석모두교환" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[로카스]"
	dialog "농담을 좋아하시는 군요?"
	dialog "오리데오콘 원석 5개를 가져오셔야 오리데오콘 1개를 정제할 수 있습니다."
	close
return

npc "izlude" "수리 중인 블랙스미스#iz" 4_F_JOB_BLACKSMITH 147 131 5 0 0
OnClick:
	dialog "[수리 중인 블랙스미스]"
	dialog "저기 저 앉아 있는 청년말야, 몇 시간 째 <와그작>을 노려보고 있어. 모든 무기를 다 잃고 나이프 하나 남았다나?"
	wait
	dialog "[수리 중인 블랙스미스]"
	dialog "안전 제련으로 편히 사용하면 될 텐데, 나로서는 굳이 실패를 감행하는 모험을 하는 지 이해가 잘 안되."
	close
return

npc "izlude" "제련소주인 한#jtuto" 4_M_02 153 126 2 0 0
OnClick:
	dialog "[제련소주인 한]"
	dialog "안녕하십니까? 룬 미드가츠의 차세대 제련문화를 이끌어 나갈 한 이라고 합니다."
	wait
	dialog "[제련소주인 한]"
	dialog "뒤늦게 시장에 뛰어들어서인지 역시 고정손님이 많지 않으면 장사하기가 쉽지 않아서요. 이렇게 홍보를 하게 되었습니다."
	wait
	dialog "[제련소주인 한]"
	dialog "혹시 당신을 강하게 만들어줄 ^3E86C3제련^000000이란 것에 관심 있으신가요?"
	wait
	choose menu "관심 없어요." "제련? 먹는 건가요?" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	Emotion "제련소주인 한#jtuto" ET_SORRY
	dialog "[제련소주인 한]"
	dialog "아.. 죄송합니다. 제가 바쁜 분을 붙잡았군요."
	close
return

npc "izlude" "타드데#izj" 4_M_04 145 122 8 0 0
OnClick:
	dialog "[타드데]"
	dialog "철이나 강철로 된 무기를 제련할 때 쓰이는 금속을 팔고 있습죠."
	dialog "1레벨의 무기제련에 쓰이는 ^007777프라콘^000000 과... 2레벨의 무기제련에 쓰이는 ^007777엠베르타콘^000000 을 얼마든지 팔고 있습니다요."
	wait
	choose menu "프라콘 - 200z." "엠베르타콘 - 1000z." "궁금한 걸 물어본다." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	endchoose
	close
return

npc "izlude" "제련매니아#iz_bs" 4_M_SITDOWN 148 122 5 0 0
OnClick:
	dialog "[제련매니아]"
	dialog "쉿! 조용히 해봐요."
	dialog "지금 전 아이템 ^3131FF제련^000000에 온 정신을 집중하는 중이란 말이에요."
	wait
	choose menu "제련이 뭐죠?" "행운을 빌어요." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[제련매니아]"
	dialog "일부 부위를 제외한 아이템들은 ^3131FF제련을 통해 강화^000000 시킬 수 있어요."
	wait
	dialog "[제련매니아]"
	dialog "특히 무기는 ^3131FF공격력이 상승^000000되기 때문에 제련이 성공한다면 큰 도움이 된다고요."
	wait
	dialog "[제련매니아]"
	dialog "1레벨 무기의 경우 +7 제련까지는 100% 성공이 보장되지만, 그 이후로는 ^FF0000실패^000000할 수도 있어요. ^FF0000아이템이 사라져 버린단 말이에요^000000."
	wait
	dialog "[제련매니아]"
	dialog "지금 난 +10에 도전하고 있어요. 어느새 여기까지 와 버렸죠!!"
	dialog "후-웁! 후-웁!!"
	wait
	dialog "[제련매니아]"
	dialog "자세한 설명은 옆의 '제련소 주인'에게 물어보도록 해요. 나에겐 +10이라는 중요한 사명이 있으니까요!"
	close
return

npc "izlude" "제련머신 와그작" 2_MONEMUS 153 121 1 0 0
OnClick:
	dialog "[제련머신 와그작]"
	dialog "-띠릿-"
	dialog "와그작 가동.. 완료"
	dialog "사용자 체크 중.. 완료"
	dialog "제련 장비를 선택하세요."
	wait
	choose menu "하단-[장착안됨]" "갑옷-[장착안됨]" "왼손-[장착안됨]" "오른손-[장착안됨]" "걸칠것-[장착안됨]" "신발-[장착안됨]" "악세사리1-[장착안됨]" "악세사리2-[장착안됨]" "투구-[장착안됨]" "중단-[장착안됨]" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	case 6
		
	break
	case 7
		
	break
	case 8
		
	break
	case 9
		
	break
	case 10
		
	break
	endchoose
	close
return

npc "izlude" "제련머신 와그작" 2_MONEMUS 153 121 1 0 0
OnClick:
	dialog "[제련머신 와그작]"
	dialog "-띠릿-"
	dialog "와그작 가동.. 완료"
	dialog "사용자 체크 중.. 완료"
	dialog "제련 장비를 선택하세요."
	wait
	choose menu "하단-[장착안됨]" "갑옷-[장착안됨]" "^nItemID^2112" "오른손-[장착안됨]" "걸칠것-[장착안됨]" "신발-[장착안됨]" "악세사리1-[장착안됨]" "악세사리2-[장착안됨]" "투구-[장착안됨]" "중단-[장착안됨]" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	case 6
		
	break
	case 7
		
	break
	case 8
		
	break
	case 9
		
	break
	case 10
		
	break
	endchoose
	dialog "[제련머신 와그작]"
	dialog "장비정보 검색 중.. 완료"
	wait
	dialog "[제련머신 와그작]"
	dialog "^FF0000- 오류번호 4444 -^000000"
	dialog "제련이 불가능한 장비입니다."
	close
return

npc "izlude" "제조매니아#iz_ac" 2_M_ALCHE 93 143 3 0 0
OnClick:
	dialog "[제조매니아]"
	dialog "안녕하세요? 전 알케미스트입니다."
	dialog "상인에서 전직할 수 있는 직업이죠."
	wait
	dialog "[제조매니아]"
	dialog "지금 포션을 만들고 있어요."
	dialog "역시 포션 제조는 조용한 곳에서 해야 왠지 성공률이 올라가는 것 같아서 이즈루드까지 왔는데, 왠지 느낌이 좋아요. 얍! 떠라!"
	close
return

npc "izlude" "홍보요원" 4W_SAILOR 102 171 5 0 0
OnClick:
	dialog "[홍보요원]"
	dialog "자아자아 호기심 많고 용감한"
	dialog "모험가를 모집중입니다~ 강한"
	dialog "모험가들이여 도전하라!"
	wait
	dialog "[홍보요원]"
	dialog "거기 자네, 꽤 날리는 모험가인"
	dialog "것으로 추정되는데, 내 이야기"
	dialog "좀 듣고 가는 것은 어떠한가?"
	wait
	choose menu "그러죠." "갈 길이 멀어서..." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	close
return

npc "izlude" "스마일도우미" 4_F_03 125 175 4 0 0
OnClick:
	dialog "[스마일걸]"
	dialog "안녕하세요 ♬ 안녕하세요 ♪"
	dialog "스마일도우미 입니다"
	dialog "무엇을 도와드릴까요 ?"
	wait
	choose menu "^3355FF스마일가면^000000 에 대하여" "^3355FF스마일가면^000000 을 제작한다" "대화를 종료한다" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	endchoose
	close
return

trader "izlude" "과일상인" 1_M_INNKEEPER 124 165 4 0 0
OnInit:
	sellitem Apple // 15
	sellitem Banana // 15
	sellitem Carrot // 15
	sellitem Sweet_Potato // 15
return

trader "izlude" "우유상인" 4_F_01 128 158 7 0 0
OnInit:
	sellitem Milk // 25
return

npc "izlude" "포인트 상인#이즈루드" 8_F_GIRL 138 163 5 0 0
OnClick:
	dialog "[포인트 상인]"
	dialog "안녕하세요. 각종 촉매로 사용되는 ^FF0000포인트^000000를 팔고 있습니다. 필요하신 물건 없으신가요?"
	wait
	choose menu "스칼렛포인트 - 200z" "라임그린포인트 - 200z" "인디고포인트 - 200z" "옐로우위시포인트 - 200z" "대화종료" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	endchoose
	dialog "[포인트 상인]"
	dialog "스칼렛포인트를 선택하셨군요."
	dialog "몇 개 구매하시겠습니까?"
	dialog "취소하시려면 0을 입력해주세요."
	wait
	dlgwrite
	dialog "[포인트 상인]"
	dialog "소지금이 부족하여 구매하실 수 없습니다."
	close
return

npc "izlude" "생선의꼬리의흔적#33" CLEAR_NPC 136 160 0 0 0
OnClick:
	dialog "누군가 파헤친 흔적이 있습니다."
	close
return

	showimage "kafra_01.bmp" 2
npc "izlude" "카프라 직원" 4_F_KAFRA1 128 148 4 0 0
OnClick:
	dialog "[카프라 직원]"
	dialog "어서오십시오. 카프라 서비스는 언제나 여러분 곁에 있습니다."
	dialog "무엇을 도와드릴까요?"
	wait
	choose menu "저장 서비스 이용" "창고 서비스 이용" "공간이동 서비스 이용" "카트 서비스 이용" "기타정보 확인" "종료" 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	case 5
		
	break
	case 6
		
	break
	endchoose
	dialog "[카프라 직원]"
	dialog "저장 되었습니다."
	dialog "이용해 주셔서 감사합니다."
	close
return

	showimage "kafra_01.bmp" 255
npc "izlude" "낙원단 공간이동사#30" 4_F_NOVICE 131 148 3 0 0
OnClick:
	dialog "[낙원단 공간이동사]"
	dialog "이 세계의 모든 것이 낯설은 수련생이여 목표없이 방황중인 모험가여, 내게로 오세요!"
	dialog "당신의 어려움을 타파해 줄 낙원단 등장!"
	wait
	dialog "[낙원단 공간이동사]"
	dialog "흐르는 시간을 주체할 수가 없다고요?"
	dialog "기운은 넘치는데 할일이 없다고요?"
	dialog "전문 해결사가 되고 싶습니까?"
	dialog "무엇이 고민이십니까? 지금 당장 낙원단과 상담하세요!"
	wait
	choose menu "낙원단으로 이동" "대화를 마친다" 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[낙원단 공간이동사]"
	dialog "자아, 갑시다 우리들의 아지트로!"
	close
return

	showimage "thf_lumin01.bmp" 255
	dialog "[전투 교관 스비노]"
	dialog "어서 오게. 친구."
	dialog "나는 사냥담당 교관 스비노네."
	dialog "자네들이 하루빨리 훌륭한 용사가 될 수 있도록 돕기 위해 간단한 의뢰를 제공하고 있으니 관심 있다면 둘러보게."
	wait
	choose menu "의뢰를 본다." "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "세상에서 젤로 맛있는(1~3)" "당근은 맛있어(1~3)" "파브르 옷감기(4~6)" "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "포링은 어디에서나 볼 수 있는 귀여운 식물이지."
	dialog "물론 맛도 좋아서 야채를 싫어하는 아이들도 잘 먹고 말이야."
	wait
	dialog "[전투 교관 스비노]"
	dialog "크리투라 학원에서도 중요한 식재료로 사용되고 있으니 언제나 포링이 필요하다네."
	wait
	choose menu "퀘스트를 받는다." "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "포링은 크리투라 학원이 있는 이즈루드 마을의 서쪽 필드에서 쉽게 발견 할 수 있지."
	dialog "포링을 10마리 잡아서 젤로피 5개를 가져오게."
	dialog "받은 퀘스트는 Alt+U를 누르면 확인할 수 있다네."
	setquest 11339
	close
return

	dialog "[전투 교관 스비노]"
	dialog "어서 오게. 친구."
	dialog "나는 사냥담당 교관 스비노네."
	dialog "자네들이 하루빨리 훌륭한 용사가 될 수 있도록 돕기 위해 간단한 의뢰를 제공하고 있으니 관심 있다면 둘러보게."
	wait
	choose menu "의뢰를 본다." "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "세상에서 젤로 맛있는(1~3)" "당근은 맛있어(1~3)" "파브르 옷감기(4~6)" "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "루나틱은 프론테라 근교에 서식하는 아주 귀여운 동물이라네."
	dialog "보들보들하고 폭신폭신하고…… 정말 귀엽지…… 귀여워……"
	wait
	dialog "[전투 교관 스비노]"
	dialog "게다가 항상 당근을 가지고 다니기 때문에 맛있는 당근을 쉽게 얻을 수 있네."
	dialog "당근은 식이섬유소가 풍부하고 비타민A와 카로틴을 함유하고 있어서 시력개선에도 효과가 있는 아주 좋은 채소야."
	wait
	choose menu "퀘스트를 받는다." "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "루나틱은 크리투라 학원이 있는 이즈루드 마을의 서쪽필드에서 쉽게 발견 할 수 있지."
	dialog "루나틱을 10마리 잡아서 당근 3개를 가져오게. "
	dialog "받은 퀘스트는 Alt+U를 누르면 확인할 수 있다네."
	setquest 11340
	close
return

	dialog "[전투 교관 스비노]"
	dialog "어서 오게. 친구."
	dialog "나는 사냥담당 교관 스비노네."
	dialog "자네들이 하루빨리 훌륭한 용사가 될 수 있도록 돕기 위해 간단한 의뢰를 제공하고 있으니 관심 있다면 둘러보게."
	wait
	choose menu "의뢰를 본다." "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "세상에서 젤로 맛있는(1~3)" "당근은 맛있어(1~3)" "파브르 옷감기(4~6)" "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "루나틱은 프론테라 근교에 서식하는 아주 귀여운 동물이라네."
	dialog "보들보들하고 폭신폭신하고…… 정말 귀엽지…… 귀여워……"
	wait
	dialog "[전투 교관 스비노]"
	dialog "게다가 항상 당근을 가지고 다니기 때문에 맛있는 당근을 쉽게 얻을 수 있네."
	dialog "당근은 식이섬유소가 풍부하고 비타민A와 카로틴을 함유하고 있어서 시력개선에도 효과가 있는 아주 좋은 채소야."
	wait
	choose menu "대화를 마친다." "퀘스트를 포기한다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "정말 퀘스트를 포기하겠나?"
	wait
	choose menu "대화를 마친다." "정말 포기한다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	close
return

	dialog "[전투 교관 스비노]"
	dialog "어서 오게. 친구."
	dialog "나는 사냥담당 교관 스비노네."
	dialog "자네들이 하루빨리 훌륭한 용사가 될 수 있도록 돕기 위해 간단한 의뢰를 제공하고 있으니 관심 있다면 둘러보게."
	wait
	choose menu "의뢰를 본다." "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	choose menu "세상에서 젤로 맛있는(1~3)" "당근은 맛있어(1~3)" "파브르 옷감기(4~6)" "그만 둔다." 
	case 1
		
	break
	case 2
		
	break
	case 3
		
	break
	case 4
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "루나틱은 프론테라 근교에 서식하는 아주 귀여운 동물이라네."
	dialog "보들보들하고 폭신폭신하고…… 정말 귀엽지…… 귀여워……"
	wait
	dialog "[전투 교관 스비노]"
	dialog "게다가 항상 당근을 가지고 다니기 때문에 맛있는 당근을 쉽게 얻을 수 있네."
	dialog "당근은 식이섬유소가 풍부하고 비타민A와 카로틴을 함유하고 있어서 시력개선에도 효과가 있는 아주 좋은 채소야."
	wait
	choose menu "대화를 마친다." "퀘스트를 포기한다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "정말 퀘스트를 포기하겠나?"
	wait
	choose menu "대화를 마친다." "정말 포기한다." 
	case 1
		
	break
	case 2
		
	break
	endchoose
	dialog "[전투 교관 스비노]"
	dialog "내 도움이 필요한 이상 얼마든지 퀘스트에 다시 도전할 수 있으니 언제든 오게."
	erasequest 11340
	close
return
