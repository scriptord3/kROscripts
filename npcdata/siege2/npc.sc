npc "prt_gld" "투자현황게시판#fund01" 4_BOARD3 163 99 3 0 0
OnClick:
	dialog "5차 집계내역 (단위 만)"
	dialog "스반힐트 『한울』 길드: 0"
	dialog "라즈리그스 이카루스 길드: 0"
	dialog "스쾨굴 발키리아 길드: 0"
	dialog "괸들 Unique 길드: 0"
	dialog "발키리렐름 일반: 51"
	dialog "발키리렐름 투자 총 합 : 51"
	close
return

npc "prt_gld" "고양이손상단 두베" 4_CAT_MERMASTER 158 96 5 0 0
OnClick:
	dialog "[두베]"
	dialog "고양이손 상단 프론테라 발키리렐름 지부장 두베입니다."
	dialog "심연의 회랑 게이트 개발비용 유치를 위한 투자 상담을 맡고 있습니다."
	dialog "무엇을 도와 드릴까요?"
	wait
	choose menu "심연의 회랑은 무엇이죠?" "게이트 개발을 위한 투자는 뭐죠?" "이 지역에 투자하겠습니다." "취소" 
	case 1
		
	break
	case 2
		
	break
	case 3
		dialog "[두베]"
		dialog "^4d4dff발키리렐름^000000지역에 투자 하십니까?"
		dialog "점령한 성이 있을 경우 해당 성과 성을 차지한 길드의 이름으로 투자됩니다."
		wait
		dialog "[두베]"
		dialog "투자는 제니(zeny)와 고양이손 상단 투자증서 두 가지를 통해 할 수 있습니다."
		dialog "어떤 방식으로 투자 하시겠습니까?"
		wait
		choose menu "제니(Zeny)로 투자 한다." "고양이손상단 투자증서를 납입 한다." "취소" 
		case 1
			dialog "[두베]"
			dialog "제니로 투자 하시는군요."
			dialog "최소 투자  1 단위는 ^4d4dff10,000 zeny^000000입니다."
			dialog "한 번에 최대 50 단위 ^4d4dff 500,000 zeny^000000 까지 가능합니다."
			wait
			choose menu "1단위 1만z" "10단위 10만z" "50단위 50만z" "직접 입력" "취소" 
			case 1
				dialog "[두베]"
				dialog "가지고 계신 금액이 부족한 것 같습니다."
				close
			break
			case 2
				dialog "[두베]"
				dialog "가지고 계신 금액이 부족한 것 같습니다."
				close
			break
			case 3
				dialog "[두베]"
				dialog "가지고 계신 금액이 부족한 것 같습니다."
				close
			break
			case 4
				dialog "[두베]"
				dialog "투자 하실 단위를 입력 해 주세요."
				dialog "1 에서 200 사이로 결정 해 주시면 됩니다."
				dialog "취소는 0 입니다."
				wait
				dlgwrite 1 200
				if (input == 0)
					dialog "[두베]"
					dialog "취소 하셨습니다."
					close
				endif
				if (input == error)
					dialog "[두베]"
					dialog "한 번에 투자 가능한 범위를 넘었습니다."
					dialog "다시 시도 해 주십시오."
					close
				endif
				dialog "[두베]"
				dialog "가지고 계신 금액이 부족한 것 같습니다."
				close
			break
			case 5
				close
			break
			endchoose
		break
		case 2
			dialog "[두베]"
			dialog "오, 투자증서를 가지고 오셨군요."
			dialog "몇 장이나 납입 하시겠습니까?"
			wait
			choose menu "투자증서 1장" "투자증서 5장" "직접 입력" "취소" 
			case 1
				dialog "[두베]"
				dialog "예정하신 수량보다 소지하고 계시는 투자증서가 많이 부족해 보입니다만..."
				close
			break
			case 2
				dialog "[두베]"
				dialog "예정하신 수량보다 소지하고 계시는 투자증서가 많이 부족해 보입니다만..."
				close
			break
			case 3
				dialog "[두베]"
				dialog "납입할 투자증서의 갯수를 입력 해 주십시오."
				dialog "1 에서 20 사이로 결정 해 주시면 됩니다."
				dialog "취소는 0 입니다."
				wait
				dlgwrite 1 20
				if (input == 0)
					dialog "[두베]"
					dialog "취소 하셨습니다."
					close
				endif
				if (input == error)
					dialog "[두베]"
					dialog "한 번에 투자 가능한 범위를 넘었습니다."
					dialog "다시 시도 해 주십시오."
					close
				endif
				dialog "[두베]"
				dialog "예정하신 수량보다 소지하고 계시는 투자증서가 많이 부족해 보입니다만..."
				close
			break
			case 4
				close
			break
			endchoose
		break
		case 3
			dialog "[두베]"
			dialog "취소하셨습니다."
			close
		break
		endchoose
	break
	case 4
		
	break
	endchoose
return

npc "prt_gld" "게이트 관리자#prt_f00" 4_M_BOSSCAT 161 96 3 0 0
OnClick:
	dialog "[아리오스]"
	dialog "현재 연결 된 던전 게이트가 없습니다."
	close
return