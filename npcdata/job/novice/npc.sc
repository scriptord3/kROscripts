npc "iz_int04" "루민#new01_ship" 4_M_NOV_RUMIN 91 62 3 0 0
OnClick:
	var q = isbegin_quest 7471
	if (q == 0)
		dialog "[루민]"
		dialog "............."
		dialog ".. ?"
		showimage "nov_lumin01.bmp" 0
		wait
		showimage "fly_trock.bmp" 2
		dialog "[선장 카록]"
		dialog "아, 이제야 깨어났는가?"
		dialog "말 없는 그 친구는 바다에서 표류 중인 녀석을 내가 주웠지."
		wait
		dialog "[선장 카록]"
		dialog "기억이 잃었더군."
		dialog "내가 루민이란 이름을 지어줬어. 그냥 편하게 루 라고 부르고 있지만.."
		wait
		dialog "[선장 카록]"
		dialog "그리고 방금 자네가 내게 말을 걸었다시피 앞으로 만나는 많은 사람들도 그런식으로 말을 걸면 되네."
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff기본적으로 마우스 왼쪽 클릭으로 게임의 조작이 가능합니다."
		dialog "NPC 대화 및 이동, 공격은 마우스 왼쪽 클릭을 이용합니다.^000000"
		showimage "tutorial01.bmp" 4
		wait
		showimage "tutorial01.bmp" 255
		dialog "[선장 카록]"
		dialog "많은 청년들이 각자의 꿈을 위해 ^4d4dff룬-미드가츠 왕국^000000을 찾아온다네."
		dialog "우리가 곧 도착할 이즈루드는 미드가츠 왕국의 수도인 프론테라의 위성도시야."
		wait
		dialog "[선장 카록]"
		dialog "이즈루드는 자네같은 젊은 청년과 막 세상을 향해 모험을 시작하는 자들이 모여들지."
		dialog "이제 자네도 그 중 하나가 되겠군."
		wait
		dialog "[선장 카록]"
		dialog "많은 이야기를 해주고 싶다만 입항 준비를 해야겠군."
		dialog "이즈루드에는 자네같은 젊은 모험가를 위한 학원가 있다네."
		wait
		dialog "[선장 카록]"
		dialog "자세한 이야기는 배에서 내린 후 해주겠네."
		dialog "선착장에서 보세."
		wait
		dialog "[선장 카록]"
		dialog "배에서 내릴려면 저쪽의 ^4d4dff빛이 나는 포탈^000000로 들어가면 된다네."
		dialog "모든 장소이동은 포탈을 통하고 있지."
		setquest 7471
		completequest 7471
		wait
		showimage "nov_lumin01.bmp" 0
		dialog "[루민]"
		dialog "그렇다."
		wait
		showimage "fly_trock.bmp" 2
		dialog "[카록]"
		dialog "하핫, 녀석 참."
		dialog "반응이 귀엽구나."
		close
	else
		dialog "[루민]"
		dialog "....루민."
		showimage "nov_lumin01.bmp" 0
		wait
		choose menu "뭐지? 자기소개인가?" "내 이름은~!" 
		case 1
			dialog "["+PcName+"]"
			dialog "난 "+PcName+"님이시다!"
			dialog "앞으로 세상을 빛낼 미래의 위인이시지!"
			wait
			dialog "[루]"
			dialog "....."
			wait
			dialog "[루]"
			dialog "....."
			dialog "....그래서?"
			wait
			showimage "nov_lumin01.bmp" 255
			dialog "무심하게 반응한 루는 배에서 내려 저 멀리 사라졌다."
			wait
			showimage "fly_trock.bmp" 2
			dialog "[카록]"
			dialog "저 녀석. 부끄러워서 저러는거야."
			dialog "어차피 이즈루드에서 다 만나게 될걸. 잘 대해주게. 착한 녀석일세."
			wait
			dialog "[카록]"
			dialog "난 이제 이즈루드를 거점으로 하고 근거리 교통 운항을 할 계획이야."
			dialog "이제 내리자고?"
			close
			showimage "fly_trock.bmp" 255
		break
		case 2
			dialog "["+PcName+"]"
			dialog "난 "+PcName+"님이시다!"
			dialog "앞으로 세상을 빛낼 미래의 위인이시지!"
			wait
			dialog "[루]"
			dialog "....."
			wait
			dialog "[루]"
			dialog "....."
			dialog "....그래서?"
			wait
			showimage "nov_lumin01.bmp" 255
			dialog "무심하게 반응한 루는 배에서 내려 저 멀리 사라졌다."
			wait
			showimage "fly_trock.bmp" 2
			dialog "[카록]"
			dialog "저 녀석. 부끄러워서 저러는거야."
			dialog "어차피 이즈루드에서 다 만나게 될걸. 잘 대해주게. 착한 녀석일세."
			wait
			dialog "[카록]"
			dialog "난 이제 이즈루드를 거점으로 하고 근거리 교통 운항을 할 계획이야."
			dialog "이제 내리자고?"
			close
			showimage "fly_trock.bmp" 255
		break
		endchoose
	endif
return

npc "iz_int04" "선장 카록#new01_ship" 4_M_REINDEER 99 75 3 0 0
OnClick:
	var q = isbegin_quest 7471
	if (q == 0)
		dialog "[선장 카록]"
		dialog "좋은 꿈 꾸었는가, 젊은 친구?"
		dialog "이제 곧 ^4d4dff이즈루드^000000에 도착할걸세."
		wait
		dialog "[선장 카록]"
		dialog "그리고 방금 자네가 내게 말을 걸었다시피 앞으로 만나는 많은 사람들도 그런식으로 말을 걸면 되네."
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff기본적으로 마우스 왼쪽 클릭으로 게임의 조작이 가능합니다."
		dialog "NPC 대화 및 이동, 공격은 마우스 왼쪽 클릭을 이용합니다.^000000"
		showimage "tutorial01.bmp" 4
		wait
		showimage "tutorial01.bmp" 255
		dialog "[선장 카록]"
		dialog "많은 청년들이 각자의 꿈을 위해 ^4d4dff룬-미드가츠 왕국^000000을 찾아온다네."
		dialog "우리 목적지인 이즈루드는 미드가츠 왕국의 수도 프론테라의 위성도시야."
		wait
		dialog "[선장 카록]"
		dialog "이즈루드는 자네같은 젊은 청년과 막 세상을 향해 모험을 시작하는 자들이 모여들지."
		dialog "이제 자네도 그 중 하나가 되겠군."
		wait
		dialog "[선장 카록]"
		dialog "많은 이야기를 해주고 싶다만 입항 준비를 해야겠군."
		dialog "이즈루드에는 자네같은 젊은 모험가를 위한 학원가 있다네."
		wait
		dialog "[선장 카록]"
		dialog "자세한 이야기는 배에서 내린 후 해주겠네."
		dialog "선착장에서 보세."
		wait
		dialog "[선장 카록]"
		dialog "배에서 내릴려면 저쪽의 ^4d4dff빛이 나는 포탈^000000로 들어가면 된다네."
		dialog "모든 장소이동은 포탈을 통하고 있지."
		setquest 7471
		completequest 7471
		close
	else
		showimage "fly_trock.bmp" 2
		dialog "[선장 카록]"
		dialog "이즈루드에 도착했으니 배에서 내려야지?"
		dialog "^4d4dff빛이 나는 포탈^000000을 통해 밖으로 나갈 수 있다네."
		wait
		dialog "[선장 카록]"
		dialog "내려서 선착장에서 자세한 이야기를 하도록 하지."
		dialog "자네에겐 알려주고 싶은게 많아."
		close
		showimage "fly_trock.bmp" 255
	endif
return


npc "izlude" "선장 카록#new_iz" 4_M_REINDEER 198 213 3 0 0
OnClick:
	showimage "fly_trock.bmp" 2
	var q = isbegin_quest 7472
	if (q == 0)
		dialog "[카록]"
		dialog "여기가 이즈루드라네."
		dialog "자네의 꿈을 펼치기 위한 장소로는 더할나위 없이 좋은 도시지."
		wait
		dialog "[카록]"
		dialog "딱히 자네에게 특별한 애정이 있는것은 아니네만..."
		dialog "여객선을 운행하면서 자네같은 젊은이를 많이 보았지."
		wait
		dialog "[카록]"
		dialog "그들 중에는 성공한 자들도 있고, 세상에 적응하지 못하고 되돌아간 이들도 있었지."
		dialog "나는 자네가 이 곳을 시작으로 보란듯이 성공했으면 한다네."
		wait
		dialog "[카록]"
		dialog "그거 아는가?"
		dialog "이즈루드에는 자네같은 새내기 모험가들을 지원하기 위한 학원이 있다는 것."
		wait
		choose menu "학원요?" 
		case 1		
		break
		endchoose
		dialog "[카록]"
		dialog "그래. ^4d4dff왕립 크리투라 학원^000000 이라고 하더군."
		dialog "룬 미드가츠 왕실에서 모험가를 대대적으로 지원하기 위해 만든 곳이야."
		wait
		dialog "[카록]"
		dialog "학원에 내 친구가 직원으로 일을 하고 있으니 소개를 해주겠네."
		dialog "여러가지 편의를 봐주겠지."
		wait
		dialog "[카록]"
		dialog "늘 학원 입구 근처에서 새로 온 모험가에게 말을 걸고 있을테니.."
		dialog "가서 한번 직접 만나보게."
		wait
		dialog "[카록]"
		dialog "이름은 ^4d4dff 훈 ^000000 이라고 하지."
		dialog "지도에 표시를 해 줄테니 그 친구를 만나보게."
		setquest 7472
		compass 0 122 207 1 "0x4D4DFF00"
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff미니맵은 우측 상단에서 볼 수 있습니다."
		dialog " + 로 확대, - 로 축소할 수 있으며 NPC로부터 안내 받는 위치가 표시 되기도 합니다.^000000"
		wait
		showimage "tutorial02.bmp" 4
		dialog "!- 안내 -!"
		dialog "^4d4dff선장 카록으로부터 퀘스트를 받았습니다."
		dialog "퀘스트의 내용은 퀘스트 정보창에서 확인 할 수 있습니다."
		wait
		dialog "!- 안내 -"
		dialog "퀘스트 정보창은 ^4d4dffAlt + u^000000키로 열어 볼 수 있습니다."
		wait
		showimage "tutorial02.bmp" 255
		dialog "[카록]"
		dialog "지도를 봐도 잘 모르겠다면 <NAVI>[훈]<INFO>izlude,122,207</INFO></NAVI> 여길 눌러보게."
		dialog "그래 [훈] 이라는 이 부분 말이야."
		wait
		dialog "!- 안내 -"
		dialog "^4d4dff 대화 지문 중 <NAVI>[훈]<INFO>izlude,122,207</INFO></NAVI> 이런 표현은"
		dialog "길을 안내하기 위한 네비게이션 연결 링크 입니다."
		showimage "navi01.bmp" 4
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff 목표 대상을 검색하여 목적을 설정한 뒤 안내를 클릭하면"
		dialog "목표대상의 위치를 향해 화살표가 생성되며 안내가 시작됩니다.^000000"
		showimage "navi02.bmp" 4
		wait
		showimage "navi01.bmp" 255
		dialog "[카록]"
		dialog "어쨌든 그 친구라면 아카데미에 등록하는 방법을 알려줄테지."
		dialog "자네 앞길에 큰 도움이 되길 바라겠네."
		close
	elseif (q == 1)
		dialog "[카록]"
		dialog "자네가 원한다면 바로 세상을 향해 발걸음을 내디뎌도 되겠지."
		dialog "하지만 일단 학원을 방문 해 보기를 권하겠네."
		wait
		dialog "[카록]"
		dialog "이 세계를 살아가기에 혼자는 너무 외롭지 않는가."
		dialog "학원에서 평생을 같이 할 동료를 만날 수도 있으니.."
		wait
		dialog "[카록]"
		dialog "물론 학원의 여러가지 지원은 덤이라네. 하하하."
		wait
		dialog "[카록]"
		dialog "내 친구 '훈'은 학원 입구 근처에 있을 것이네."
		dialog "위치를 모르겠다면 다시 알려주지."
		compass 0 122 207 1 "0x4D4DFF00"
		wait
		dialog "[카록]"
		dialog "지도를 봐도 잘 모르겠다면 <NAVI>[훈]<INFO>izlude,122,207</INFO></NAVI> 여길 눌러보게."
		dialog "그래 [훈] 이라는 이 부분 말이야."
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff 대화 지문 중 <NAVI>[훈]<INFO>izlude,122,207</INFO></NAVI> 이런 표현은"
		dialog "길을 안내하기 위한 네비게이션 연결 링크 입니다."
		showimage "navi01.bmp" 4
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff 목표 대상을 검색하여 목적을 설정한 뒤 안내를 클릭하면"
		dialog "목표대상의 위치를 향해 화살표가 생성되며 안내가 시작됩니다.^000000"
		showimage "navi02.bmp" 4
		wait
		showimage "navi01.bmp" 255
		dialog "[카록]"
		dialog "어쨌든 그 친구라면 아카데미에 등록하는 방법을 알려줄테지."
		dialog "자네 앞길에 큰 도움이 되길 바라겠네."
		close
	else
		dialog "[카록]"
		dialog "오,"+PcName+"!"
		dialog "여전히 열심이군?"
		dialog "자네가 열심인 동안 나 또한 바빴지."
		dialog "배를 재정비 하고 있거든."
		wait
		dialog "[카록]"
		dialog "정비가 마무리 되는대로 재개할 생각이야."
		dialog "그때에는 ^4d4dff파로스 등대^000000로 뱃길이 열릴걸세."
		dialog "기대하게나."
		close
	endif
	showimage "fly_trock.bmp" 255
return


npc "izlude" "크리투라학원 직원 훈#nb" 4_M_KHKYEL 122 207 3 0 0
OnClick:
	compass 0 1 1 2 "0xFFFFFF00"
	var q = isbegin_quest 7472
	if (q == 1)
		dialog "[훈]"
		dialog "오오.. 카록이 말하던 사람이 자네로구만!"
		dialog "자네 고향이 어딘지 모르겠네만 인생의 시작으로 룬 미드가츠는 부족함이 없지."
		wait
		dialog "[훈]"
		dialog "새출발을 하는 젊은이들을 보는건 즐거워."
		dialog "여기까지 오느라 피곤했을테니 마실 것이라도 하나 줄까?"
		changequest 7472 7473
		getexp 1200
		getitem Apple_Juice 1
		wait
		dialog "[훈]"
		dialog "왼쪽 상단의 기본정보창에서 'Item'아이콘을 누르면 아이템창이 활성화 된다네."
		wait
		dialog "[훈]"
		dialog "아이템창은 크게 세가지 탭으로 분류되는데"
		dialog "각각, '소비', '장비', '기타', '개인'으로 각자 용도에 맞게 자동 분류가 되지."
		wait
		dialog "[훈]"
		dialog "사용하거나 장비하고자 하는 아이템은 해당 ^4d4dff아이템을 더블클릭^000000 하거나"
		dialog "^4d4dff장비창으로 드래그 하여 이용^000000할 수 있거든."
		wait
		showimage "tutorial03.BMP" 4
		dialog "!- 안내 -!"
		dialog "^4d4dff아이템들은 간단하게 더블클릭으로 사용하거나 장착할 수 있습니다."
		dialog "아이템창은 단축키 Alt + E 로 간단하게 열고 닫을 수 있습니다."
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff장착한 아이템의 확인은 단축키 ALT + Q 로 열어서 확인이 가능합니다."
		dialog "장착하고자 하는 위치로 해당 아이템을 드래그하여도 됩니다."
		wait
		showimage "tutorial03.BMP" 255
		dialog "[훈]"
		dialog "각 ^4d4dff아이템에 대한 상세한 설명이 보고 싶으면 해당 아이템을 우클릭^000000 하는거야."
		dialog "선택한 아이템의 세부 설명을 볼 수 있지."
		wait
		showimage "tutorial04.BMP" 4
		dialog "!- 안내 -!"
		dialog "^4d4dff아이템을 마우스 오른쪽 클릭을 하면 해당 아이템의 상세한 설명을 볼 수 있습니다."
		wait
		dialog "!- 안내 -!"
		dialog "^4d4dff플레이어를 선택할 경우 커뮤니티 메뉴가 활성화되며 파티가입, 거래 등을 요청할 수 있습니다."
		wait
		showimage "tutorial04.BMP" 255
		dialog "[훈]"
		dialog "그럼 ^4d4dff내가 준 사과쥬스를 마셔보게.^000000"
		close
	else
		dialog "[훈]"
		dialog "아이템 창을 열고 내가 준 사과쥬스를 쭉 들이키게."
		dialog "그 다음에 이야기를 진행하도록 하지."
		close
	endif
return






npc "izlude" "크리투라 학원생#lumin01" 4_M_NOV_RUMIN 140 249 7 0 0
OnClick:
	dialog "어딘가 생각에 잠겨 있는 것 같다."
	dialog "무시 한다!"
	close
	showimage "nov_lumin01.bmp" 255
return

npc "iz_ac01" "아카데미 접수원#nk" 4_F_01 100 39 5 0 0
OnClick:
	var q = isbegin_quest 4269
	if (q == 0)
		dialog "[접수원]"
		dialog "아카데미에 오신 것을 환영합니다. 저는 안내와 노비스 교육 과정의 접수를 맡고 있습니다."
		wait
		dialog "[접수원]"
		dialog "무엇을 도와드릴까요?"
		wait
		choose menu "교육 과정 등록" "학교 설명" "대화 종료" 
		case 1
			dialog "[접수원]"
			dialog "어디 보자...성함이..."+PcName+"이시군요."
			dialog "새로 등록해 드리겠습니다."
			dialog "수업은 자유로이 선택하실 수"
			dialog "있으며 각 과정은 개별적인 성격을 가지고 있습니다."
			wait
			dialog "[접수원]"
			dialog "그리고 이것은 교육 과정에 필요한"
			dialog "가장 기본적인 장비입니다."
			dialog "유용하게 사용하시길 바랍니다."
			dialog "재지급되진 않으므로 주의하세요."
			setquest 4269
			completequest 4269
			getitem Novice_Plate 1
			getitem Novice_Hood 1
			getitem Novice_Boots 1
			getitem Novice_Egg_Cap 1
			getitem Novice_Knife 1
			getitem Novice_Guard 1
			getitem Novice_Potion 300
			wait
			dialog "[접수원]"
			dialog "일단 여기를 찾았다는 것이"
			dialog "당신의 모험가로서의 길의 일보입니다."
			getexp 600
			getJexp 600
			wait
			dialog "[접수원]"
			dialog "다음에 만날 때는 조금 더 성장해"
			dialog "있기를 기대할게요."
			close
		break
		case 2
			choose menu "1층 설명" "2층 설명" "마을 설명" "대화를 종료한다." 
			case 1
				dialog "[접수원]"
				dialog "1층에는 다음과 같은 시설들이"
				dialog "존재하며, 위치에 따른 강의들이"
				dialog "준비되어 있습니다."
				wait
				dialog "[접수원]"
				dialog "우선 의무실에서는 체력을 회복할 수 있는 방법과 응급치료 스킬을 습득할 수 있습니다."
				wait
				dialog "[접수원]"
				dialog "병참에서는 전투에 관한 설명을 들을 수 있고 간단한 훈련을 받을 수 있습니다."
				wait
				dialog "[접수원]"
				dialog "식당에서는 요리에 관한 연습을 할 수 있고, 요리 스킬에 대한 설명도 들을 수 있습니다."
				wait
				dialog "[접수원]"
				dialog "무엇을 도와드릴까요?"
				wait
			break
			case 2
				dialog "[접수원]"
				dialog "2층에는 각 직업에 대한"
				dialog "훈련을 진행해주는 교육 담당"
				dialog "선생님들이 있습니다."
				wait
				dialog "[접수원]"
				dialog "각 직업들을 체험해볼 수 있는"
				dialog "입문서와 간단한 아이템 등도"
				dialog "제공하고 있으니 돌아 본 뒤,"
				dialog "자신의 진로를 결정해 주시길 바랍니다."
				wait
			break
			case 3
				dialog "[접수원]"
				dialog "이 마을의 이름은 이즈루드라고 하며 룬 미드가츠의 수도인 프론테라의 위성도시 겸 항구입니다."
				wait
				dialog "[접수원]"
				dialog "새로 유입되는 초보자들의 교육에 적합하도록 마을 전체가 개편되어 있으며"
				dialog "마을 곳곳에는 그에 따른 안내 및 교육을 담당하는 사람들이 배치되어 있습니다."
				wait
				dialog "[접수원]"
				dialog "무엇을 도와드릴까요?"
				wait
			break
			case 4
				dialog "[접수원]"
				dialog "필요한 것이 있으면 다시 찾아 주세요."
				close
			break
			endchoose
		break
		case 3
			dialog "[접수원]"
			dialog "알겠습니다."
			dialog "필요한 것이 있으면 다시 찾아주세요."
			close
		break
		endchoose
	else
		dialog "[접수원]"
		dialog "안녕하세요,"+PcName+"님."
		dialog "오늘도 좋은 하루를 보내고 계신가요?"
		dialog "저는 접수와 안내를 맡고 있습니다."
		dialog "무엇을 도와드릴까요?"
		wait
		while (1)
			dialog "[접수원]"
			dialog "무엇을 도와드릴까요?"
			wait
			choose menu "학교 내외 설명" "선생님 위치 안내" "대화 종료"
			case 1
				choose menu "1층 설명" "2층 설명" "마을 설명" "대화를 종료한다." 
				case 1
					dialog "[접수원]"
					dialog "1층에는 다음과 같은 시설들이"
					dialog "존재하며, 위치에 따른 강의들이"
					dialog "준비되어 있습니다."
					wait
					dialog "[접수원]"
					dialog "우선 의무실에서는 체력을 회복할 수 있는 방법과 응급치료 스킬을 습득할 수 있습니다."
					wait
					dialog "[접수원]"
					dialog "병참에서는 전투에 관한 설명을 들을 수 있고 간단한 훈련을 받을 수 있습니다."
					wait
					dialog "[접수원]"
					dialog "식당에서는 요리에 관한 연습을 할 수 있고, 요리 스킬에 대한 설명도 들을 수 있습니다."
					wait
					dialog "[접수원]"
					dialog "무엇을 도와드릴까요?"
					wait
				break
				case 2
					dialog "[접수원]"
					dialog "2층에는 각 직업에 대한"
					dialog "훈련을 진행해주는 교육 담당"
					dialog "선생님들이 있습니다."
					wait
					dialog "[접수원]"
					dialog "각 직업들을 체험해볼 수 있는"
					dialog "입문서와 간단한 아이템 등도"
					dialog "제공하고 있으니 돌아 본 뒤,"
					dialog "자신의 진로를 결정해 주시길 바랍니다."
					wait
				break
				case 3
					dialog "[접수원]"
					dialog "이 마을의 이름은 이즈루드라고 하며 룬 미드가츠의 수도인 프론테라의 위성도시 겸 항구입니다."
					wait
					dialog "[접수원]"
					dialog "새로 유입되는 초보자들의 교육에 적합하도록 마을 전체가 개편되어 있으며"
					dialog "마을 곳곳에는 그에 따른 안내 및 교육을 담당하는 사람들이 배치되어 있습니다."
					wait
					dialog "[접수원]"
					dialog "무엇을 도와드릴까요?"
					wait
				break
				case 4
					dialog "[접수원]"
					dialog "필요한 것이 있으면 다시 찾아 주세요."
					close
				break
				endchoose
			break
			case 2		
				while (1)
					choose menu "각종 훈련 담당" "1차 직업 담당" "이전의 메뉴로 돌아간다." "대화를 종료한다." 
					case 1
						dialog "[접수원]"
						dialog "찾고자 하는 선생님의 이름을 마우스의 왼쪽 단추로 클릭하시면 안내를 해 드리겠습니다."
						wait
						dialog "치료와 회복 담당 <NAVI>치료사<INFO>iz_ac01,59,43</INFO></NAVI>"
						dialog "전투 훈련 담당 <NAVI>스비노<INFO>iz_ac01,59,83</INFO></NAVI>"
						dialog "상태 이상 정보의 교관 <NAVI>마인즈<INFO>iz_ac01,134,47</INFO></NAVI>"
						dialog "요리를 가르쳐 주는 <NAVI>다쿠와즈<INFO>iz_ac01,147,47</INFO></NAVI>"
						dialog "제련에 관한 교육은 <NAVI>제련소주인 한<INFO>izlude,153,126</INFO></NAVI>"
						dialog "진로 상담을 하려면 <NAVI>슈크림<INFO>iz_ac02,143,55</INFO></NAVI>"
					break
					case 2
						dialog "[접수원]"
						dialog "찾고자 하는 선생님의 이름을 마우스의 왼쪽 단추로 클릭하시면 안내를 해 드리겠습니다."
						wait
						dialog "검사 담당 <NAVI>검사 교관<INFO>iz_ac02,47,48</INFO></NAVI>"
						dialog "복사 담당 <NAVI>엘리스<INFO>iz_ac02,156,169</INFO></NAVI>"
						dialog "궁수 담당 <NAVI>궁수 선생님<INFO>iz_ac02,65,109</INFO></NAVI>"
						dialog "마술사 담당 <NAVI>찰스<INFO>iz_ac02,148,110</INFO></NAVI>"
						dialog "도둑 담당 <NAVI>메이셀<INFO>iz_ac02,52,136</INFO></NAVI>"
						dialog "닌자 담당 <NAVI>닌자 가이드<INFO>iz_ac02,140,139</INFO></NAVI>"
						dialog "건슬링거 담당 <NAVI>길드 파견 직원<INFO>iz_ac02,162,86</INFO></NAVI>"
						dialog "태권 담당 <NAVI>아랑<INFO>iz_ac02,70,85</INFO></NAVI>"
					break
					case 3
						exitwhile
					break
					case 4
						dialog "[접수원]"
						dialog "잘 알겠습니다, 필요한 것이 생기면 다시 찾아 주세요."
						close
						return
					break
					endchoose
					wait
					dialog "[접수원]"
					dialog "안내가 되었습니까?"
					wait
					choose menu "잠시만..." "그럼 저는 이만." 
					case 1
						wait
					break
					case 2
						dialog "[접수원]"
						dialog "다음에 만날 때는 조금 더 멋있어져 있으리라 믿어요. 열심히 하세요~"
						close
						return
					break
					endchoose
				endwhile
			break
			case 3
				exitwhile
			break
			endchoose
		endwhile
		close
	endif
return


npc "iz_ac01" "카프라 안내 교관#1" 4_F_KAFRA1 95 46 6 0 0
OnClick:
	showimage "kafra_01.bmp" 2
	var q = isbegin_quest 4269
	if (q == 0)
		dialog "[카프라 안내 교관]"
		dialog "먼저 ^8B4513아카데미 등록 절차^000000를"
		dialog "거치고 와야 할 것 같아요~!"
		dialog "아카데미 1층 입구에 가면"
		dialog "등록 해 주는 분이"
		dialog "계실거에요~!"
		close
	else
		dialog "[카프라 안내 교관]"
		dialog "어서오십시오. 카프라 서비스는 언제나 여러분 곁에 있습니다."
		wait
		dialog "[카프라 안내 교관]"
		dialog "카프라 서비스를 처음"
		dialog "이용하는 분들을 위해서"
		dialog "카프라 서비스에 대한"
		dialog "다양한 설명을 해드리고"
		dialog "있지요~!"
		wait
		while(1)
			dialog "[카프라 안내 교관]"
			dialog "카프라 서비스에 관해서"
			dialog "뭐가 알고싶으세요~!"
			wait
			choose menu "저장 서비스 이용" "창고 서비스 이용" "공간 이동 서비스 이용" "카트 서비스 이용" "기타정보 확인" "종료"
			case 1
				dialog "[카프라 안내 교관]"
				dialog "저장 서비스란 말 그대로"
				dialog "필드에서 ^8B4513전투불능^000000이 되거나"
				dialog "^8B4513나비의 날개^000000와 같은 아이템을"
				dialog "사용했을 때 이동되는 지역을"
				dialog "정하는 것 이에요~"
				wait
				dialog "[카프라 안내 교관]"
				dialog "이해하기 아주 쉽죠~?"
				dialog "저장 서비스를"
				dialog "이용해 보시겠어요~?"
				wait
				choose menu "아니오" "예" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog "무서워 하지 말아요~!"
					dialog "저장서비스는 여러분을"
					dialog "잡아먹지 않아요~"
					dialog "생각이 바뀌면 저장 서비스를"
					dialog "꼭~ 이용해봤으면 좋겠어요~!"
					wait
				break
				case 2
					dialog "[카프라 안내 교관]"
					dialog "자~ 그럼"
					dialog "현재 크리투라 아카데미가 있는"
					dialog "마을인 ^8B4513이즈루드 광장^000000으로"
					dialog "저장을 합니다~!."
					wait
					dialog "[카프라 안내 교관]"
					dialog "짠~!"
					wait
					dialog "[카프라 안내 교관]"
					dialog "벌써 끝났어요~ 참 쉽죠~?"
					wait
					dialog "[카프라 안내 교관]"
					dialog "이제 ^006400나비의 날개^000000를"
					dialog "사용 해 보면 마지막으로"
					dialog "저장한 위치로 이동 될 거에요."
					wait
				break
				endchoose
			break
			case 2
				dialog "[카프라 안내 교관]"
				dialog "창고 서비스란~"
				dialog "말 그대로 각종 아이템들을"
				dialog "^8B4513안전하게 보관^000000 할 수 있도록 하는"
				dialog "중요한 금고와 같은 서비스에요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "창고를 이용하기 위해서는"
				dialog "^8B4513초보자 스킬레벨을 6^000000이상으로"
				dialog "올려야 하지요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "그리고 소정의 수고비로~"
				dialog "^006400500 제니^000000를 받아요!"
				dialog "창고를 이용해 보시겠어요~?"
				wait
				choose menu "아니오" "예" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog "창고 서비스는"
					dialog "필수 서비스니까~"
					dialog "꼭~ 이용해 보세요~!"
					wait
				break
				case 2
					dialog "[카프라 안내 교관]"
					dialog "창고를 이용하시려면"
					dialog "초보자 스킬레벨을 6 이상"
					dialog "올리셔야 해요."
					wait
				break
				endchoose
			break
			case 3
				dialog "[카프라 안내 교관]"
				dialog "공간 이동 서비스란~"
				dialog "말 그대로 고객님들께서"
				dialog "^8B4513원하는 장소^000000에 약간의"
				dialog "제니만 받고 편하게"
				dialog "이동시켜드리는 서비스랍니다~."
				wait
				dialog "[카프라 안내 교관]"
				dialog "보통~ 마을과 마을사이를 이어주는"
				dialog "^8B4513다리의 역할^000000을 하고요~"
				dialog "간혹~ 던전이나~ 필드로"
				dialog "이동시켜주는 곳도 있으니"
				dialog "정말 편리한 서비스지요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "어떤가요~? 현재는 교육을"
				dialog "위해서 시범 서비스를"
				dialog "^8B4513무료^000000로~! 운영하고 있으니~"
				dialog "서비스를 이용해 보겠어요~?"
				wait
				choose menu "아니오" "예" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog "정말 필요한 서비스라~"
					dialog "꼭~ 이용해 보는 편이"
					dialog "좋을텐데요~~."
					wait
				break
				case 2
					choose menu "아카데미 1층 대 강의실 입구" "아카데미 2층 총장실 입구" "다음에 이용한다" 
					case 1
						close
						moveto "iz_ac01" 98 85
					break
					case 2
						close
						moveto "iz_ac02" 104 179
					break
					case 3
						
					break
					endchoose
				break
				endchoose
			break
			case 4
				dialog "[카프라 안내 교관]"
				dialog "카트 서비스란~"
				dialog "카트를 사용할 수 있는"
				dialog "^8B4513상인 계열의 직업^000000들에게"
				dialog "약간의 제니를 받고"
				dialog "카트를 대여해 드리는"
				dialog "서비스랍니다~."
				wait
				dialog "[카프라 안내 교관]"
				dialog "상인 계열이 아니거나~"
				dialog "카트 장착 스킬을 습득하지"
				dialog "못했을 경우에는 이용할 수"
				dialog "없는 서비스라는걸~"
				dialog "알아두세요~!."
				wait
				dialog "[카프라 안내 교관]"
				dialog "일단 ^0000FF아카데미 교육생^000000들은~"
				dialog "이용하고 싶어도~"
				dialog "이용 할 수 없는 서비스니까~"
				dialog "일단 알아만 두세요~!!."
				wait
			break
			case 5
				dialog "[카프라 안내 교관]"
				dialog "기타 서비스 중 에는"
				dialog "적립 포인트라는 것이"
				dialog "있어요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "적립 포인트 확인이란~"
				dialog "각종~ 카프라 서비스를"
				dialog "이용할 때 마다"
				dialog "고객님들에게~ 감사의 의미로"
				dialog "조금씩 ^8B4513포인트를 쌓아^000000드리는"
				dialog "것을 말해요~."
				wait
				dialog "[카프라 안내 교관]"
				dialog "적립 포인트를 한 번"
				dialog "확인 해 보시겠어요~?"
				wait
				choose menu "적립포인트 확인" "취소" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog ""+PcName+" 고객님의 적립포인트는 0 점 이에요."
					wait
					dialog "[카프라 안내 교관]"
					dialog "적립포인트는 저희 카프라 본사에서 상품과 교환이 가능해요."
					dialog "편리한 저희 카프라 서비스도 이용하시고 많은 상품도 받아가세요~"
					wait
				break
				case 2
					wait
				break
				endchoose
			break
			case 6
				dialog "[카프라 안내 교관]"
				dialog "저희 카프라 서비스는 보다 완벽한 서비스와 엄격한 관리 업무로 고객 여러분이 안심하고 편하게 이용하실 수 있도록 최선을 다하고 있습니다."
				dialog "이용해 주셔서 감사합니다."
				close
				exitwhile
			break
			endchoose
		endwhile
	endif
	showimage "kafra_01.bmp" 255
return

npc "iz_ac02" "카프라 안내 교관#2" 4_F_KAFRA1 101 176 6 0 0
OnClick:
	showimage "kafra_01.bmp" 2
	var q = isbegin_quest 4269
	if (q == 0)
		dialog "[카프라 안내 교관]"
		dialog "먼저 ^8B4513아카데미 등록 절차^000000를"
		dialog "거치고 와야 할 것 같아요~!"
		dialog "아카데미 1층 입구에 가면"
		dialog "등록 해 주는 분이"
		dialog "계실거에요~!"
		close
	else
		dialog "[카프라 안내 교관]"
		dialog "어서오십시오. 카프라 서비스는 언제나 여러분 곁에 있습니다."
		wait
		dialog "[카프라 안내 교관]"
		dialog "카프라 서비스를 처음"
		dialog "이용하는 분들을 위해서"
		dialog "카프라 서비스에 대한"
		dialog "다양한 설명을 해드리고"
		dialog "있지요~!"
		wait
		while(1)
			dialog "[카프라 안내 교관]"
			dialog "카프라 서비스에 관해서"
			dialog "뭐가 알고싶으세요~!"
			wait
			choose menu "저장 서비스 이용" "창고 서비스 이용" "공간 이동 서비스 이용" "카트 서비스 이용" "기타정보 확인" "종료"
			case 1
				dialog "[카프라 안내 교관]"
				dialog "저장 서비스란 말 그대로"
				dialog "필드에서 ^8B4513전투불능^000000이 되거나"
				dialog "^8B4513나비의 날개^000000와 같은 아이템을"
				dialog "사용했을 때 이동되는 지역을"
				dialog "정하는 것 이에요~"
				wait
				dialog "[카프라 안내 교관]"
				dialog "이해하기 아주 쉽죠~?"
				dialog "저장 서비스를"
				dialog "이용해 보시겠어요~?"
				wait
				choose menu "아니오" "예" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog "무서워 하지 말아요~!"
					dialog "저장서비스는 여러분을"
					dialog "잡아먹지 않아요~"
					dialog "생각이 바뀌면 저장 서비스를"
					dialog "꼭~ 이용해봤으면 좋겠어요~!"
					wait
				break
				case 2
					dialog "[카프라 안내 교관]"
					dialog "자~ 그럼"
					dialog "현재 크리투라 아카데미가 있는"
					dialog "마을인 ^8B4513이즈루드 광장^000000으로"
					dialog "저장을 합니다~!."
					wait
					dialog "[카프라 안내 교관]"
					dialog "짠~!"
					wait
					dialog "[카프라 안내 교관]"
					dialog "벌써 끝났어요~ 참 쉽죠~?"
					wait
					dialog "[카프라 안내 교관]"
					dialog "이제 ^006400나비의 날개^000000를"
					dialog "사용 해 보면 마지막으로"
					dialog "저장한 위치로 이동 될 거에요."
					wait
				break
				endchoose
			break
			case 2
				dialog "[카프라 안내 교관]"
				dialog "창고 서비스란~"
				dialog "말 그대로 각종 아이템들을"
				dialog "^8B4513안전하게 보관^000000 할 수 있도록 하는"
				dialog "중요한 금고와 같은 서비스에요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "창고를 이용하기 위해서는"
				dialog "^8B4513초보자 스킬레벨을 6^000000이상으로"
				dialog "올려야 하지요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "그리고 소정의 수고비로~"
				dialog "^006400500 제니^000000를 받아요!"
				dialog "창고를 이용해 보시겠어요~?"
				wait
				choose menu "아니오" "예" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog "창고 서비스는"
					dialog "필수 서비스니까~"
					dialog "꼭~ 이용해 보세요~!"
					wait
				break
				case 2
					dialog "[카프라 안내 교관]"
					dialog "창고를 이용하시려면"
					dialog "초보자 스킬레벨을 6 이상"
					dialog "올리셔야 해요."
					wait
				break
				endchoose
			break
			case 3
				dialog "[카프라 안내 교관]"
				dialog "공간 이동 서비스란~"
				dialog "말 그대로 고객님들께서"
				dialog "^8B4513원하는 장소^000000에 약간의"
				dialog "제니만 받고 편하게"
				dialog "이동시켜드리는 서비스랍니다~."
				wait
				dialog "[카프라 안내 교관]"
				dialog "보통~ 마을과 마을사이를 이어주는"
				dialog "^8B4513다리의 역할^000000을 하고요~"
				dialog "간혹~ 던전이나~ 필드로"
				dialog "이동시켜주는 곳도 있으니"
				dialog "정말 편리한 서비스지요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "어떤가요~? 현재는 교육을"
				dialog "위해서 시범 서비스를"
				dialog "^8B4513무료^000000로~! 운영하고 있으니~"
				dialog "서비스를 이용해 보겠어요~?"
				wait
				choose menu "아니오" "예" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog "정말 필요한 서비스라~"
					dialog "꼭~ 이용해 보는 편이"
					dialog "좋을텐데요~~."
					wait
				break
				case 2
					choose menu "아카데미 1층 대 강의실 입구" "아카데미 2층 총장실 입구" "다음에 이용한다" 
					case 1
						close
						moveto "iz_ac01" 98 85
					break
					case 2
						close
						moveto "iz_ac02" 104 179
					break
					case 3
						
					break
					endchoose
				break
				endchoose
			break
			case 4
				dialog "[카프라 안내 교관]"
				dialog "카트 서비스란~"
				dialog "카트를 사용할 수 있는"
				dialog "^8B4513상인 계열의 직업^000000들에게"
				dialog "약간의 제니를 받고"
				dialog "카트를 대여해 드리는"
				dialog "서비스랍니다~."
				wait
				dialog "[카프라 안내 교관]"
				dialog "상인 계열이 아니거나~"
				dialog "카트 장착 스킬을 습득하지"
				dialog "못했을 경우에는 이용할 수"
				dialog "없는 서비스라는걸~"
				dialog "알아두세요~!."
				wait
				dialog "[카프라 안내 교관]"
				dialog "일단 ^0000FF아카데미 교육생^000000들은~"
				dialog "이용하고 싶어도~"
				dialog "이용 할 수 없는 서비스니까~"
				dialog "일단 알아만 두세요~!!."
				wait
			break
			case 5
				dialog "[카프라 안내 교관]"
				dialog "기타 서비스 중 에는"
				dialog "적립 포인트라는 것이"
				dialog "있어요~!"
				wait
				dialog "[카프라 안내 교관]"
				dialog "적립 포인트 확인이란~"
				dialog "각종~ 카프라 서비스를"
				dialog "이용할 때 마다"
				dialog "고객님들에게~ 감사의 의미로"
				dialog "조금씩 ^8B4513포인트를 쌓아^000000드리는"
				dialog "것을 말해요~."
				wait
				dialog "[카프라 안내 교관]"
				dialog "적립 포인트를 한 번"
				dialog "확인 해 보시겠어요~?"
				wait
				choose menu "적립포인트 확인" "취소" 
				case 1
					dialog "[카프라 안내 교관]"
					dialog ""+PcName+" 고객님의 적립포인트는 0 점 이에요."
					wait
					dialog "[카프라 안내 교관]"
					dialog "적립포인트는 저희 카프라 본사에서 상품과 교환이 가능해요."
					dialog "편리한 저희 카프라 서비스도 이용하시고 많은 상품도 받아가세요~"
					wait
				break
				case 2
					wait
				break
				endchoose
			break
			case 6
				dialog "[카프라 안내 교관]"
				dialog "저희 카프라 서비스는 보다 완벽한 서비스와 엄격한 관리 업무로 고객 여러분이 안심하고 편하게 이용하실 수 있도록 최선을 다하고 있습니다."
				dialog "이용해 주셔서 감사합니다."
				close
				exitwhile
			break
			endchoose
		endwhile
	endif
	showimage "kafra_01.bmp" 255
return

npc "iz_ac01" "전투 교관 스비노#크리투" 4_M_NOV_HUNT 59 83 4 0 0
OnClick:
	dialog "[전투 교관 스비노]"
	dialog "어서 오게. 친구."
	dialog "나는 사냥담당 교관 스비노네."
	dialog "자네들이 하루빨리 훌륭한 용사가 될 수 있도록 돕기 위해 간단한 의뢰를 제공하고 있으니 관심 있다면 둘러보게."
	wait
	choose menu "의뢰를 본다." "그만 둔다." 
	case 1
		choose menu "세상에서 젤로 맛있는(1~3)" "당근은 맛있어(1~3)" "파브르 옷감기(4~6)" "그만 둔다." 
		case 1
			setquest 11338
			erasequest 11338
			dialog "[전투 교관 스비노]"
			dialog "포링은 어디에서나 볼 수 있는 귀여운 식물이지."
			dialog "물론 맛도 좋아서 야채를 싫어하는 아이들도 잘 먹고 말이야."
			wait
			dialog "[전투 교관 스비노]"
			dialog "크리투라 학원에서도 중요한 식재료로 사용되고 있으니 언제나 포링이 필요하다네."
			wait
			choose menu "퀘스트를 받는다." "그만 둔다." 
			case 1
				dialog "[전투 교관 스비노]"
				dialog "포링은 크리투라 학원이 있는 이즈루드 마을의 서쪽 필드에서 쉽게 발견 할 수 있지."
				dialog "포링을 10마리 잡아서 젤로피 5개를 가져오게."
				dialog "받은 퀘스트는 Alt+U를 누르면 확인할 수 있다네."
				setquest 11339
				close				
			break
			case 2
				dialog "[전투 교관 스비노]"
				dialog "포링은 어디에서나 볼 수 있는 귀여운 식물이지."
				dialog "물론 맛도 좋아서 야채를 싫어하는 아이들도 잘 먹고 말이야."
				wait
				dialog "[전투 교관 스비노]"
				dialog "크리투라 학원에서도 중요한 식재료로 사용되고 있으니 언제나 포링이 필요하다네."
				wait
				choose menu "대화를 마친다." "퀘스트를 포기한다." 
				case 1
					close
				break
				case 2
					dialog "[전투 교관 스비노]"
					dialog "정말 퀘스트를 포기하겠나?"
					wait
					choose menu "대화를 마친다." "정말 포기한다." 
					case 1
						close
					break
					case 2
						dialog "[전투 교관 스비노]"
						dialog "내 도움이 필요한 이상 얼마든지 퀘스트에 다시 도전할 수 있으니 언제든 오게."
						erasequest 11339
						close
					break
					endchoose
				break
				endchoose
			break
			endchoose
		break
		case 2
			dialog "[전투 교관 스비노]"
			dialog "루나틱은 프론테라 근교에 서식하는 아주 귀여운 동물이라네."
			dialog "보들보들하고 폭신폭신하고…… 정말 귀엽지…… 귀여워……"
			wait
			dialog "[전투 교관 스비노]"
			dialog "게다가 항상 당근을 가지고 다니기 때문에 맛있는 당근을 쉽게 얻을 수 있네."
			dialog "당근은 식이섬유소가 풍부하고 비타민A와 카로틴을 함유하고 있어서 시력개선에도 효과가 있는 아주 좋은 채소야."
			wait
			var q = isbegin_quest 11340
			if (q == 0)
				choose menu "퀘스트를 받는다." "그만 둔다." 
				case 1
					dialog "[전투 교관 스비노]"
					dialog "루나틱은 크리투라 학원이 있는 이즈루드 마을의 서쪽필드에서 쉽게 발견 할 수 있지."
					dialog "루나틱을 10마리 잡아서 당근 3개를 가져오게. "
					dialog "받은 퀘스트는 Alt+U를 누르면 확인할 수 있다네."
					setquest 11340
					close
				break
				case 2
					
				break
				endchoose
			else
				choose menu "대화를 마친다." "퀘스트를 포기한다." 
				case 1
					
				break
				case 2
					dialog "[전투 교관 스비노]"
					dialog "정말 퀘스트를 포기하겠나?"
					wait
					choose menu "대화를 마친다." "정말 포기한다." 
					case 1
						close
					break
					case 2
						dialog "[전투 교관 스비노]"
						dialog "내 도움이 필요한 이상 얼마든지 퀘스트에 다시 도전할 수 있으니 언제든 오게."
						erasequest 11340
						close
					break
					endchoose
				break
				endchoose
			endif
		break
		case 3
			
		break
		case 4
			dialog "[전투 교관 스비노]"
			dialog "지금은 별로 생각이 없나 보군."
			dialog "생각이 바뀌면 언제든 오게."
			close
		break
		endchoose
	break
	case 2
		dialog "[전투 교관 스비노]"
		dialog "지금은 별로 생각이 없나 보군."
		dialog "생각이 바뀌면 언제든 오게."
		close
	break
	endchoose
return