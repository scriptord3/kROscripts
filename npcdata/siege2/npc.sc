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

npc "prt_gld" "투자현황게시판#fund01" 4_BOARD3 163 99 3 0 0
OnClick:
	dialog "!-전 아지트 지역 투자 결과-!"
	dialog "^4d4dff[발키리렐름] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "^aaaaaa[청림호수] 투자미달^000000"
	dialog "^4d4dff[브리토리아] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "[루이나] 최소달성"
	dialog "-> 길드던전 심층(2층) 열림"
	close
return

npc "gef_fild13" "투자현황게시판#fund01" 4_BOARD3 190 209 3 0 0
OnClick:
	dialog "!-전 아지트 지역 투자 결과-!"
	dialog "^4d4dff[발키리렐름] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "^aaaaaa[청림호수] 투자미달^000000"
	dialog "^4d4dff[브리토리아] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "[루이나] 최소달성"
	dialog "-> 길드던전 심층(2층) 열림"
	close
return

npc "pay_gld" "투자현황게시판#fund03" 4_BOARD3 200 189 5 0 0
OnClick:
	dialog "!-전 아지트 지역 투자 결과-!"
	dialog "^4d4dff[발키리렐름] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "^aaaaaa[청림호수] 투자미달^000000"
	dialog "^4d4dff[브리토리아] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "[루이나] 최소달성"
	dialog "-> 길드던전 심층(2층) 열림"
	close
return

npc "alde_gld" "투자현황게시판#fund04" 4_BOARD3 188 158 3 0 0
OnClick:
	dialog "!-전 아지트 지역 투자 결과-!"
	dialog "^4d4dff[발키리렐름] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "^aaaaaa[청림호수] 투자미달^000000"
	dialog "^4d4dff[브리토리아] 최대달성^000000"
	dialog "-> 심연의 회랑 게이트 열림"
	dialog "[루이나] 최소달성"
	dialog "-> 길드던전 심층(2층) 열림"
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

npc "prt_gld" "고양이손상단 두베" 4_CAT_MERMASTER 158 96 5 0 0
OnClick:
	dialog "[두베]"
	dialog "고양이손 상단 프론테라 발키리렐름 지부장 두베입니다."
	dialog "심연의 회랑 게이트 개발비용 유치를 위한 투자 상담을 맡고 있습니다."
	dialog "무엇을 도와 드릴까요?"
	wait
	choose menu "심연의 회랑은 무엇이죠?" "게이트 개발을 위한 투자는 뭐죠?" "이 지역에 투자하겠습니다." "취소" 
	case 1
		dialog "[두베]"
		dialog "심연의 회랑은 편의상 붙인 이름입니다만 간단하게 말씀 드리자면 ^4d4dff차원의 틈새 저 쪽^000000이라고 할 수 있죠."
		wait
		dialog "[두베]"
		dialog "모로크가 차원의 균열을 만든 이후 이런 차원의 틈새는 여기 저기 발견 되고 있습니다."
		dialog "이번에 발견 된 심연의 회랑은 먼 과거, 혹은 미래의 일부가 아닐까 합니다만..."
		wait
		dialog "[두베]"
		dialog "특히나 강하게 연결 된 차원의 저 편을 강제로 연결한 것이 심연의 회랑."
		dialog "아마도 엠펠리움의 힘에 이끌린 자들이 존재하기 때문이 아닌가 싶습니다."
		wait
		dialog "[두베]"
		dialog "현재 발견된 차원의 회랑은 총 4 곳. 모두가 엠펠리움의 기운을 가진 아지트 지역과 접점을 이루고 있죠."
		wait
		dialog "[두베]"
		dialog "우리는 각각의 틈새 너머를 이렇게 이름 지었습니다."
		dialog "^4d4dff전사의 길, 망자의 언덕, 태고의 바람, 영웅의 눈물.^000000"
		dialog "그리고 그 모두를 통틀어 ^4d4dff심연의 회랑^000000이라고 부르고 있죠."
		wait
		dialog "[두베]"
		dialog "과거 혹은 미래, 또는 우리가 모르는 미지의 지역이 품고 있는 것..."
		dialog "심연의 회랑이 지닌 힘은 두려우면서도 달콤하지요."
		wait
		dialog "[두베]"
		dialog "당신도 심연의 회랑을 탐험 해 보지 않겠습니까?"
		dialog "후후.. 그럴려면 많은 절차가 필요하긴 합니다만."
		wait
		dialog "[두베]"
		dialog "흥미가 있으시다면 저와 함께"
		dialog "심연의 회랑 게이트 유지를 위한 투자에 대해 이야기 할 시간을 가지지 않겠습니까?"
		close
	break
	case 2
		dialog "[두베]"
		dialog "게이트 개발을 위한 투자에 대해 궁금하십니까?"
		dialog "무엇에 대해 알려드릴까요?"
		wait
		choose menu "게이트란?" "투자란?" "투자 방법은?" "투자를 통한 혜택은?" 
		case 1
			dialog "[두베]"
			dialog "게이트는 말 그대로 게이트, 문(門)입니다."
			dialog "이쪽과 저쪽을 이어주는 차원의 통로를 말하죠."
			wait
			dialog "[두베]"
			dialog "심연의 회랑은 차원의 틈새 너머에 아주 불안정한 경로를 가지고 형성되어 있기 때문에"
			dialog "이 쪽과 회랑을 드나들려면 인위적인 차원의 연결 작업이 필요하죠."
			wait
			dialog "[두베]"
			dialog "인간들에겐 아직 그런 고도의 기술은 무리겠지만"
			dialog "우리 고양이손 상단은 차원의 균열을 이용하던 기술력이 있지요."
			wait
			dialog "[두베]"
			dialog "그래서 우리는 제안했습니다."
			dialog "게이트 연결과 유지에 드는 막대한 비용과 고양이손 상단의 후원을 약속한다면"
			dialog "차원의 틈새를 연결 해 주기로요."
			wait
			dialog "[두베]"
			dialog "물론 불안정한 차원의 틈새를 헤집는 일은 결코 만만한 일이 아니죠."
			dialog "때에 따라서는 차원의 미아가 될 수도 있으니까요."
			wait
			dialog "[두베]"
			dialog "우리가 찾아낸 최상의 유지 시간은 약 나흘정도."
			dialog "당신들은 우리에게 투자를 하고, 우리는 차원의 틈을 연결하는 문을 만든다.."
			wait
			dialog "[두베]"
			dialog "서로에게 괜찮은 장사 아닙니까?"
			close
		break
		case 2
			dialog "[두베]"
			dialog "불안정한 차원의 틈새를 강제로 헤집어서 통로를 만드는 것은 상당한 위험을 동반하죠."
			dialog "막대한 자원도 들고요."
			wait
			dialog "[두베]"
			dialog "그런 위험을 감수해서 게이트를 만들어 유지 할테니 그에 드는 제반비용 및 위험수당을"
			dialog "여러분께서 우리 고양이손 상단에 투자를 통해 지불 하시라는 겁니다."
			wait
			dialog "[두베]"
			dialog "물론 게이트에 드는 비용이 만만찮기 필요한 자금도 상당합니다."
			dialog "여럿이 모여 공동투자를 하면 해결 될 일이긴 하지만요."
			wait
			dialog "[두베]"
			dialog "게이트를 연결하기 위해 필수적으로 드는 제반비용이 있습니다."
			dialog "그만큼 투자금이 모인다면 그에 상응하는 결과가 나타나겠죠."
			wait
			dialog "[두베]"
			dialog "게다가 심연의 회랑은 각 아지트 지역별로 존재합니다."
			dialog "전 지역을 개발하려면 얼마나 많은 비용과 우리 상단의 희생이 필요 하겠습니까?"
			wait
			dialog "[두베]"
			dialog "그렇기에 투자는 지역별 경쟁으로 이루어 질 것입니다."
			dialog "충분한 게이트 유지 비용이 모이지 않는다면, 혜택을 보는 곳은 투자금이 가장 많이 모인 곳..이 되겠죠."
			wait
			dialog "[두베]"
			dialog "대신 ^4d4dff심연의 회랑이 성공적으로 연결 될 경우 해당 아지트의 또 다른 던전은"
			dialog "길드 소유가 아닌 다른 이들도 이용^000000할 수 있도록 배려를 할 예정이니 부담없이 투자해 주시기 바랍니다."
			wait
			dialog "[두베]"
			dialog "어디까지나 회랑이 연결 될 경우지만 말입니다."
			close
		break
		case 3
			dialog "[두베]"
			dialog "간단합니다."
			dialog "^4d4dff투자가 가능한 시간에 투자 하시고자 하는 지역^000000의 지부장을 찾아서 투자를 하면 되죠."
			wait
			dialog "[두베]"
			dialog "보통 ^4d4dff이 곳의 통용화폐인 제니^000000로 받습니다만"
			dialog "어디까지나 우리 고양이손 상단이 지원을 받은 것이기 때문에 말랑도에서 필요로 하는 물품으로 대신 투자를 할 수도 있습니다."
			wait
			dialog "[두베]"
			dialog "말랑도에 있는 고양이손 상단의 총무 나미스에게 상단이 필요로 하는 물자를 제공하고"
			dialog "그걸 증명하는 투자증서를 받아오면 투자내역에 포함을 시켜드리고 있습니다."
			wait
			dialog "[두베]"
			dialog "투자를 하는 지역에 해당 투자내역이 반영되기 때문에 자신이 지지하는 지역에서 투자를 해주셔야 합니다."
			close
		break
		case 4
			dialog "[두베]"
			dialog "심연의 회랑은 기본적으로 아지트를 점유하고 있는 성과 계약을 맺고 연결하는 것이기 때문에"
			dialog "게이트의 연결 및 유지 비용이 모두 충당이 된다면 저희가 제공할 수 있는 모든 것을 제공합니다."
			wait
			dialog "[두베]"
			dialog "작업에 사용되는 최소 비용과 최대 비용을 기준으로 말씀을 드리자면"
			dialog "투자금이 우리가 작업에 필요한 ^4d4dff최소치 이상을 도달^000000하면 당신들이 모르던 ^4d4dff길드 던전의 심층^000000과 연결 할 수 있습니다."
			wait
			dialog "[두베]"
			dialog "우리가 필요로 하면 자금의 최대치 이상에 도달하면 투자 순위에 관계없이 해당 지역은"
			dialog "^4d4dff심연의 회랑^000000과 연결 해 드립니다. 물론 기존의 길드던전 심층도 포함해서요."
			wait
			dialog "[두베]"
			dialog "^ff0000최대치에 도달한 아지트 지역이 존재하지 않을 경우 가장 높은 투자도를 보이는 지역으로"
			dialog "전 지역에서 모인 자금을 모두 끌어모아 심연의 회랑을 연결합니다.^000000"
			wait
			dialog "[두베]"
			dialog "심연의 회랑이 연결 될 경우, 미리 약속한바 길드 던전-심층(2F)을 포함한-은"
			dialog "지역 투자에 같이 힘을 보태 준 일반 모험가들에게 공개합니다."
			wait
			dialog "[두베]"
			dialog "모험가들이 던전을 이용한 만큼은 다음 투자에 해당 아지트 지역에 반영될 예정이니"
			dialog "아지트의 성을 차지한 길드는 모쪼록 그들과 함께 어울려 주시면 좋겠군요."
			wait
			dialog "[두베]"
			dialog "참, 심연의 회랑을 연결하는 것은 지속하기 힘드므로 일주일 단위로 투자와 게이트 연결을"
			dialog "반복 실행할 예정이니, 미지의 힘을 원한다면 아낌없는 성원과 투자 바랍니다."
			close
		break
		endchoose
	break
	case 3
		dialog "[두베]"
		dialog "현재는 투자금을 받지 않습니다."
		dialog "다음 투자 시간이 되면 찾아주십시오."
		close
	break
	case 4
		dialog "[두베]"
		dialog "그렇습니까?"
		dialog "심연의 회랑과 게이트 개발비용 유치를 위한 투자상담은 언제든지 가능하므로 다시 찾아 주십시오."
		close
	break
	endchoose
return


npc "alde_gld" "고양이손상단 메그레즈" 4_CAT_MERMASTER 186 157 3 0 0
OnClick:
	dialog "[두베]"
	dialog "고양이손 상단 프론테라 발키리렐름 지부장 두베입니다."
	dialog "심연의 회랑 게이트 개발비용 유치를 위한 투자 상담을 맡고 있습니다."
	dialog "무엇을 도와 드릴까요?"
	wait
	choose menu "심연의 회랑은 무엇이죠?" "게이트 개발을 위한 투자는 뭐죠?" "이 지역에 투자하겠습니다." "취소" 
	case 1
		dialog "[두베]"
		dialog "심연의 회랑은 편의상 붙인 이름입니다만 간단하게 말씀 드리자면 ^4d4dff차원의 틈새 저 쪽^000000이라고 할 수 있죠."
		wait
		dialog "[두베]"
		dialog "모로크가 차원의 균열을 만든 이후 이런 차원의 틈새는 여기 저기 발견 되고 있습니다."
		dialog "이번에 발견 된 심연의 회랑은 먼 과거, 혹은 미래의 일부가 아닐까 합니다만..."
		wait
		dialog "[두베]"
		dialog "특히나 강하게 연결 된 차원의 저 편을 강제로 연결한 것이 심연의 회랑."
		dialog "아마도 엠펠리움의 힘에 이끌린 자들이 존재하기 때문이 아닌가 싶습니다."
		wait
		dialog "[두베]"
		dialog "현재 발견된 차원의 회랑은 총 4 곳. 모두가 엠펠리움의 기운을 가진 아지트 지역과 접점을 이루고 있죠."
		wait
		dialog "[두베]"
		dialog "우리는 각각의 틈새 너머를 이렇게 이름 지었습니다."
		dialog "^4d4dff전사의 길, 망자의 언덕, 태고의 바람, 영웅의 눈물.^000000"
		dialog "그리고 그 모두를 통틀어 ^4d4dff심연의 회랑^000000이라고 부르고 있죠."
		wait
		dialog "[두베]"
		dialog "과거 혹은 미래, 또는 우리가 모르는 미지의 지역이 품고 있는 것..."
		dialog "심연의 회랑이 지닌 힘은 두려우면서도 달콤하지요."
		wait
		dialog "[두베]"
		dialog "당신도 심연의 회랑을 탐험 해 보지 않겠습니까?"
		dialog "후후.. 그럴려면 많은 절차가 필요하긴 합니다만."
		wait
		dialog "[두베]"
		dialog "흥미가 있으시다면 저와 함께"
		dialog "심연의 회랑 게이트 유지를 위한 투자에 대해 이야기 할 시간을 가지지 않겠습니까?"
		close
	break
	case 2
		dialog "[두베]"
		dialog "게이트 개발을 위한 투자에 대해 궁금하십니까?"
		dialog "무엇에 대해 알려드릴까요?"
		wait
		choose menu "게이트란?" "투자란?" "투자 방법은?" "투자를 통한 혜택은?" 
		case 1
			dialog "[두베]"
			dialog "게이트는 말 그대로 게이트, 문(門)입니다."
			dialog "이쪽과 저쪽을 이어주는 차원의 통로를 말하죠."
			wait
			dialog "[두베]"
			dialog "심연의 회랑은 차원의 틈새 너머에 아주 불안정한 경로를 가지고 형성되어 있기 때문에"
			dialog "이 쪽과 회랑을 드나들려면 인위적인 차원의 연결 작업이 필요하죠."
			wait
			dialog "[두베]"
			dialog "인간들에겐 아직 그런 고도의 기술은 무리겠지만"
			dialog "우리 고양이손 상단은 차원의 균열을 이용하던 기술력이 있지요."
			wait
			dialog "[두베]"
			dialog "그래서 우리는 제안했습니다."
			dialog "게이트 연결과 유지에 드는 막대한 비용과 고양이손 상단의 후원을 약속한다면"
			dialog "차원의 틈새를 연결 해 주기로요."
			wait
			dialog "[두베]"
			dialog "물론 불안정한 차원의 틈새를 헤집는 일은 결코 만만한 일이 아니죠."
			dialog "때에 따라서는 차원의 미아가 될 수도 있으니까요."
			wait
			dialog "[두베]"
			dialog "우리가 찾아낸 최상의 유지 시간은 약 나흘정도."
			dialog "당신들은 우리에게 투자를 하고, 우리는 차원의 틈을 연결하는 문을 만든다.."
			wait
			dialog "[두베]"
			dialog "서로에게 괜찮은 장사 아닙니까?"
			close
		break
		case 2
			dialog "[두베]"
			dialog "불안정한 차원의 틈새를 강제로 헤집어서 통로를 만드는 것은 상당한 위험을 동반하죠."
			dialog "막대한 자원도 들고요."
			wait
			dialog "[두베]"
			dialog "그런 위험을 감수해서 게이트를 만들어 유지 할테니 그에 드는 제반비용 및 위험수당을"
			dialog "여러분께서 우리 고양이손 상단에 투자를 통해 지불 하시라는 겁니다."
			wait
			dialog "[두베]"
			dialog "물론 게이트에 드는 비용이 만만찮기 필요한 자금도 상당합니다."
			dialog "여럿이 모여 공동투자를 하면 해결 될 일이긴 하지만요."
			wait
			dialog "[두베]"
			dialog "게이트를 연결하기 위해 필수적으로 드는 제반비용이 있습니다."
			dialog "그만큼 투자금이 모인다면 그에 상응하는 결과가 나타나겠죠."
			wait
			dialog "[두베]"
			dialog "게다가 심연의 회랑은 각 아지트 지역별로 존재합니다."
			dialog "전 지역을 개발하려면 얼마나 많은 비용과 우리 상단의 희생이 필요 하겠습니까?"
			wait
			dialog "[두베]"
			dialog "그렇기에 투자는 지역별 경쟁으로 이루어 질 것입니다."
			dialog "충분한 게이트 유지 비용이 모이지 않는다면, 혜택을 보는 곳은 투자금이 가장 많이 모인 곳..이 되겠죠."
			wait
			dialog "[두베]"
			dialog "대신 ^4d4dff심연의 회랑이 성공적으로 연결 될 경우 해당 아지트의 또 다른 던전은"
			dialog "길드 소유가 아닌 다른 이들도 이용^000000할 수 있도록 배려를 할 예정이니 부담없이 투자해 주시기 바랍니다."
			wait
			dialog "[두베]"
			dialog "어디까지나 회랑이 연결 될 경우지만 말입니다."
			close
		break
		case 3
			dialog "[두베]"
			dialog "간단합니다."
			dialog "^4d4dff투자가 가능한 시간에 투자 하시고자 하는 지역^000000의 지부장을 찾아서 투자를 하면 되죠."
			wait
			dialog "[두베]"
			dialog "보통 ^4d4dff이 곳의 통용화폐인 제니^000000로 받습니다만"
			dialog "어디까지나 우리 고양이손 상단이 지원을 받은 것이기 때문에 말랑도에서 필요로 하는 물품으로 대신 투자를 할 수도 있습니다."
			wait
			dialog "[두베]"
			dialog "말랑도에 있는 고양이손 상단의 총무 나미스에게 상단이 필요로 하는 물자를 제공하고"
			dialog "그걸 증명하는 투자증서를 받아오면 투자내역에 포함을 시켜드리고 있습니다."
			wait
			dialog "[두베]"
			dialog "투자를 하는 지역에 해당 투자내역이 반영되기 때문에 자신이 지지하는 지역에서 투자를 해주셔야 합니다."
			close
		break
		case 4
			dialog "[두베]"
			dialog "심연의 회랑은 기본적으로 아지트를 점유하고 있는 성과 계약을 맺고 연결하는 것이기 때문에"
			dialog "게이트의 연결 및 유지 비용이 모두 충당이 된다면 저희가 제공할 수 있는 모든 것을 제공합니다."
			wait
			dialog "[두베]"
			dialog "작업에 사용되는 최소 비용과 최대 비용을 기준으로 말씀을 드리자면"
			dialog "투자금이 우리가 작업에 필요한 ^4d4dff최소치 이상을 도달^000000하면 당신들이 모르던 ^4d4dff길드 던전의 심층^000000과 연결 할 수 있습니다."
			wait
			dialog "[두베]"
			dialog "우리가 필요로 하면 자금의 최대치 이상에 도달하면 투자 순위에 관계없이 해당 지역은"
			dialog "^4d4dff심연의 회랑^000000과 연결 해 드립니다. 물론 기존의 길드던전 심층도 포함해서요."
			wait
			dialog "[두베]"
			dialog "^ff0000최대치에 도달한 아지트 지역이 존재하지 않을 경우 가장 높은 투자도를 보이는 지역으로"
			dialog "전 지역에서 모인 자금을 모두 끌어모아 심연의 회랑을 연결합니다.^000000"
			wait
			dialog "[두베]"
			dialog "심연의 회랑이 연결 될 경우, 미리 약속한바 길드 던전-심층(2F)을 포함한-은"
			dialog "지역 투자에 같이 힘을 보태 준 일반 모험가들에게 공개합니다."
			wait
			dialog "[두베]"
			dialog "모험가들이 던전을 이용한 만큼은 다음 투자에 해당 아지트 지역에 반영될 예정이니"
			dialog "아지트의 성을 차지한 길드는 모쪼록 그들과 함께 어울려 주시면 좋겠군요."
			wait
			dialog "[두베]"
			dialog "참, 심연의 회랑을 연결하는 것은 지속하기 힘드므로 일주일 단위로 투자와 게이트 연결을"
			dialog "반복 실행할 예정이니, 미지의 힘을 원한다면 아낌없는 성원과 투자 바랍니다."
			close
		break
		endchoose
	break
	case 3
		dialog "[두베]"
		dialog "현재는 투자금을 받지 않습니다."
		dialog "다음 투자 시간이 되면 찾아주십시오."
		close
	break
	case 4
		dialog "[두베]"
		dialog "그렇습니까?"
		dialog "심연의 회랑과 게이트 개발비용 유치를 위한 투자상담은 언제든지 가능하므로 다시 찾아 주십시오."
		close
	break
	endchoose
return

npc "gef_fild13" "고양이손상단 메라크" 4_CAT_MERMASTER 187 208 3 0 0
OnClick:
	dialog "[두베]"
	dialog "고양이손 상단 프론테라 발키리렐름 지부장 두베입니다."
	dialog "심연의 회랑 게이트 개발비용 유치를 위한 투자 상담을 맡고 있습니다."
	dialog "무엇을 도와 드릴까요?"
	wait
	choose menu "심연의 회랑은 무엇이죠?" "게이트 개발을 위한 투자는 뭐죠?" "이 지역에 투자하겠습니다." "취소" 
	case 1
		dialog "[두베]"
		dialog "심연의 회랑은 편의상 붙인 이름입니다만 간단하게 말씀 드리자면 ^4d4dff차원의 틈새 저 쪽^000000이라고 할 수 있죠."
		wait
		dialog "[두베]"
		dialog "모로크가 차원의 균열을 만든 이후 이런 차원의 틈새는 여기 저기 발견 되고 있습니다."
		dialog "이번에 발견 된 심연의 회랑은 먼 과거, 혹은 미래의 일부가 아닐까 합니다만..."
		wait
		dialog "[두베]"
		dialog "특히나 강하게 연결 된 차원의 저 편을 강제로 연결한 것이 심연의 회랑."
		dialog "아마도 엠펠리움의 힘에 이끌린 자들이 존재하기 때문이 아닌가 싶습니다."
		wait
		dialog "[두베]"
		dialog "현재 발견된 차원의 회랑은 총 4 곳. 모두가 엠펠리움의 기운을 가진 아지트 지역과 접점을 이루고 있죠."
		wait
		dialog "[두베]"
		dialog "우리는 각각의 틈새 너머를 이렇게 이름 지었습니다."
		dialog "^4d4dff전사의 길, 망자의 언덕, 태고의 바람, 영웅의 눈물.^000000"
		dialog "그리고 그 모두를 통틀어 ^4d4dff심연의 회랑^000000이라고 부르고 있죠."
		wait
		dialog "[두베]"
		dialog "과거 혹은 미래, 또는 우리가 모르는 미지의 지역이 품고 있는 것..."
		dialog "심연의 회랑이 지닌 힘은 두려우면서도 달콤하지요."
		wait
		dialog "[두베]"
		dialog "당신도 심연의 회랑을 탐험 해 보지 않겠습니까?"
		dialog "후후.. 그럴려면 많은 절차가 필요하긴 합니다만."
		wait
		dialog "[두베]"
		dialog "흥미가 있으시다면 저와 함께"
		dialog "심연의 회랑 게이트 유지를 위한 투자에 대해 이야기 할 시간을 가지지 않겠습니까?"
		close
	break
	case 2
		dialog "[두베]"
		dialog "게이트 개발을 위한 투자에 대해 궁금하십니까?"
		dialog "무엇에 대해 알려드릴까요?"
		wait
		choose menu "게이트란?" "투자란?" "투자 방법은?" "투자를 통한 혜택은?" 
		case 1
			dialog "[두베]"
			dialog "게이트는 말 그대로 게이트, 문(門)입니다."
			dialog "이쪽과 저쪽을 이어주는 차원의 통로를 말하죠."
			wait
			dialog "[두베]"
			dialog "심연의 회랑은 차원의 틈새 너머에 아주 불안정한 경로를 가지고 형성되어 있기 때문에"
			dialog "이 쪽과 회랑을 드나들려면 인위적인 차원의 연결 작업이 필요하죠."
			wait
			dialog "[두베]"
			dialog "인간들에겐 아직 그런 고도의 기술은 무리겠지만"
			dialog "우리 고양이손 상단은 차원의 균열을 이용하던 기술력이 있지요."
			wait
			dialog "[두베]"
			dialog "그래서 우리는 제안했습니다."
			dialog "게이트 연결과 유지에 드는 막대한 비용과 고양이손 상단의 후원을 약속한다면"
			dialog "차원의 틈새를 연결 해 주기로요."
			wait
			dialog "[두베]"
			dialog "물론 불안정한 차원의 틈새를 헤집는 일은 결코 만만한 일이 아니죠."
			dialog "때에 따라서는 차원의 미아가 될 수도 있으니까요."
			wait
			dialog "[두베]"
			dialog "우리가 찾아낸 최상의 유지 시간은 약 나흘정도."
			dialog "당신들은 우리에게 투자를 하고, 우리는 차원의 틈을 연결하는 문을 만든다.."
			wait
			dialog "[두베]"
			dialog "서로에게 괜찮은 장사 아닙니까?"
			close
		break
		case 2
			dialog "[두베]"
			dialog "불안정한 차원의 틈새를 강제로 헤집어서 통로를 만드는 것은 상당한 위험을 동반하죠."
			dialog "막대한 자원도 들고요."
			wait
			dialog "[두베]"
			dialog "그런 위험을 감수해서 게이트를 만들어 유지 할테니 그에 드는 제반비용 및 위험수당을"
			dialog "여러분께서 우리 고양이손 상단에 투자를 통해 지불 하시라는 겁니다."
			wait
			dialog "[두베]"
			dialog "물론 게이트에 드는 비용이 만만찮기 필요한 자금도 상당합니다."
			dialog "여럿이 모여 공동투자를 하면 해결 될 일이긴 하지만요."
			wait
			dialog "[두베]"
			dialog "게이트를 연결하기 위해 필수적으로 드는 제반비용이 있습니다."
			dialog "그만큼 투자금이 모인다면 그에 상응하는 결과가 나타나겠죠."
			wait
			dialog "[두베]"
			dialog "게다가 심연의 회랑은 각 아지트 지역별로 존재합니다."
			dialog "전 지역을 개발하려면 얼마나 많은 비용과 우리 상단의 희생이 필요 하겠습니까?"
			wait
			dialog "[두베]"
			dialog "그렇기에 투자는 지역별 경쟁으로 이루어 질 것입니다."
			dialog "충분한 게이트 유지 비용이 모이지 않는다면, 혜택을 보는 곳은 투자금이 가장 많이 모인 곳..이 되겠죠."
			wait
			dialog "[두베]"
			dialog "대신 ^4d4dff심연의 회랑이 성공적으로 연결 될 경우 해당 아지트의 또 다른 던전은"
			dialog "길드 소유가 아닌 다른 이들도 이용^000000할 수 있도록 배려를 할 예정이니 부담없이 투자해 주시기 바랍니다."
			wait
			dialog "[두베]"
			dialog "어디까지나 회랑이 연결 될 경우지만 말입니다."
			close
		break
		case 3
			dialog "[두베]"
			dialog "간단합니다."
			dialog "^4d4dff투자가 가능한 시간에 투자 하시고자 하는 지역^000000의 지부장을 찾아서 투자를 하면 되죠."
			wait
			dialog "[두베]"
			dialog "보통 ^4d4dff이 곳의 통용화폐인 제니^000000로 받습니다만"
			dialog "어디까지나 우리 고양이손 상단이 지원을 받은 것이기 때문에 말랑도에서 필요로 하는 물품으로 대신 투자를 할 수도 있습니다."
			wait
			dialog "[두베]"
			dialog "말랑도에 있는 고양이손 상단의 총무 나미스에게 상단이 필요로 하는 물자를 제공하고"
			dialog "그걸 증명하는 투자증서를 받아오면 투자내역에 포함을 시켜드리고 있습니다."
			wait
			dialog "[두베]"
			dialog "투자를 하는 지역에 해당 투자내역이 반영되기 때문에 자신이 지지하는 지역에서 투자를 해주셔야 합니다."
			close
		break
		case 4
			dialog "[두베]"
			dialog "심연의 회랑은 기본적으로 아지트를 점유하고 있는 성과 계약을 맺고 연결하는 것이기 때문에"
			dialog "게이트의 연결 및 유지 비용이 모두 충당이 된다면 저희가 제공할 수 있는 모든 것을 제공합니다."
			wait
			dialog "[두베]"
			dialog "작업에 사용되는 최소 비용과 최대 비용을 기준으로 말씀을 드리자면"
			dialog "투자금이 우리가 작업에 필요한 ^4d4dff최소치 이상을 도달^000000하면 당신들이 모르던 ^4d4dff길드 던전의 심층^000000과 연결 할 수 있습니다."
			wait
			dialog "[두베]"
			dialog "우리가 필요로 하면 자금의 최대치 이상에 도달하면 투자 순위에 관계없이 해당 지역은"
			dialog "^4d4dff심연의 회랑^000000과 연결 해 드립니다. 물론 기존의 길드던전 심층도 포함해서요."
			wait
			dialog "[두베]"
			dialog "^ff0000최대치에 도달한 아지트 지역이 존재하지 않을 경우 가장 높은 투자도를 보이는 지역으로"
			dialog "전 지역에서 모인 자금을 모두 끌어모아 심연의 회랑을 연결합니다.^000000"
			wait
			dialog "[두베]"
			dialog "심연의 회랑이 연결 될 경우, 미리 약속한바 길드 던전-심층(2F)을 포함한-은"
			dialog "지역 투자에 같이 힘을 보태 준 일반 모험가들에게 공개합니다."
			wait
			dialog "[두베]"
			dialog "모험가들이 던전을 이용한 만큼은 다음 투자에 해당 아지트 지역에 반영될 예정이니"
			dialog "아지트의 성을 차지한 길드는 모쪼록 그들과 함께 어울려 주시면 좋겠군요."
			wait
			dialog "[두베]"
			dialog "참, 심연의 회랑을 연결하는 것은 지속하기 힘드므로 일주일 단위로 투자와 게이트 연결을"
			dialog "반복 실행할 예정이니, 미지의 힘을 원한다면 아낌없는 성원과 투자 바랍니다."
			close
		break
		endchoose
	break
	case 3
		dialog "[두베]"
		dialog "현재는 투자금을 받지 않습니다."
		dialog "다음 투자 시간이 되면 찾아주십시오."
		close
	break
	case 4
		dialog "[두베]"
		dialog "그렇습니까?"
		dialog "심연의 회랑과 게이트 개발비용 유치를 위한 투자상담은 언제든지 가능하므로 다시 찾아 주십시오."
		close
	break
	endchoose
return

npc "pay_gld" "고양이손상단 페크다" 4_CAT_MERMASTER 203 189 3 0 0
OnClick:
	dialog "[두베]"
	dialog "고양이손 상단 프론테라 발키리렐름 지부장 두베입니다."
	dialog "심연의 회랑 게이트 개발비용 유치를 위한 투자 상담을 맡고 있습니다."
	dialog "무엇을 도와 드릴까요?"
	wait
	choose menu "심연의 회랑은 무엇이죠?" "게이트 개발을 위한 투자는 뭐죠?" "이 지역에 투자하겠습니다." "취소" 
	case 1
		dialog "[두베]"
		dialog "심연의 회랑은 편의상 붙인 이름입니다만 간단하게 말씀 드리자면 ^4d4dff차원의 틈새 저 쪽^000000이라고 할 수 있죠."
		wait
		dialog "[두베]"
		dialog "모로크가 차원의 균열을 만든 이후 이런 차원의 틈새는 여기 저기 발견 되고 있습니다."
		dialog "이번에 발견 된 심연의 회랑은 먼 과거, 혹은 미래의 일부가 아닐까 합니다만..."
		wait
		dialog "[두베]"
		dialog "특히나 강하게 연결 된 차원의 저 편을 강제로 연결한 것이 심연의 회랑."
		dialog "아마도 엠펠리움의 힘에 이끌린 자들이 존재하기 때문이 아닌가 싶습니다."
		wait
		dialog "[두베]"
		dialog "현재 발견된 차원의 회랑은 총 4 곳. 모두가 엠펠리움의 기운을 가진 아지트 지역과 접점을 이루고 있죠."
		wait
		dialog "[두베]"
		dialog "우리는 각각의 틈새 너머를 이렇게 이름 지었습니다."
		dialog "^4d4dff전사의 길, 망자의 언덕, 태고의 바람, 영웅의 눈물.^000000"
		dialog "그리고 그 모두를 통틀어 ^4d4dff심연의 회랑^000000이라고 부르고 있죠."
		wait
		dialog "[두베]"
		dialog "과거 혹은 미래, 또는 우리가 모르는 미지의 지역이 품고 있는 것..."
		dialog "심연의 회랑이 지닌 힘은 두려우면서도 달콤하지요."
		wait
		dialog "[두베]"
		dialog "당신도 심연의 회랑을 탐험 해 보지 않겠습니까?"
		dialog "후후.. 그럴려면 많은 절차가 필요하긴 합니다만."
		wait
		dialog "[두베]"
		dialog "흥미가 있으시다면 저와 함께"
		dialog "심연의 회랑 게이트 유지를 위한 투자에 대해 이야기 할 시간을 가지지 않겠습니까?"
		close
	break
	case 2
		dialog "[두베]"
		dialog "게이트 개발을 위한 투자에 대해 궁금하십니까?"
		dialog "무엇에 대해 알려드릴까요?"
		wait
		choose menu "게이트란?" "투자란?" "투자 방법은?" "투자를 통한 혜택은?" 
		case 1
			dialog "[두베]"
			dialog "게이트는 말 그대로 게이트, 문(門)입니다."
			dialog "이쪽과 저쪽을 이어주는 차원의 통로를 말하죠."
			wait
			dialog "[두베]"
			dialog "심연의 회랑은 차원의 틈새 너머에 아주 불안정한 경로를 가지고 형성되어 있기 때문에"
			dialog "이 쪽과 회랑을 드나들려면 인위적인 차원의 연결 작업이 필요하죠."
			wait
			dialog "[두베]"
			dialog "인간들에겐 아직 그런 고도의 기술은 무리겠지만"
			dialog "우리 고양이손 상단은 차원의 균열을 이용하던 기술력이 있지요."
			wait
			dialog "[두베]"
			dialog "그래서 우리는 제안했습니다."
			dialog "게이트 연결과 유지에 드는 막대한 비용과 고양이손 상단의 후원을 약속한다면"
			dialog "차원의 틈새를 연결 해 주기로요."
			wait
			dialog "[두베]"
			dialog "물론 불안정한 차원의 틈새를 헤집는 일은 결코 만만한 일이 아니죠."
			dialog "때에 따라서는 차원의 미아가 될 수도 있으니까요."
			wait
			dialog "[두베]"
			dialog "우리가 찾아낸 최상의 유지 시간은 약 나흘정도."
			dialog "당신들은 우리에게 투자를 하고, 우리는 차원의 틈을 연결하는 문을 만든다.."
			wait
			dialog "[두베]"
			dialog "서로에게 괜찮은 장사 아닙니까?"
			close
		break
		case 2
			dialog "[두베]"
			dialog "불안정한 차원의 틈새를 강제로 헤집어서 통로를 만드는 것은 상당한 위험을 동반하죠."
			dialog "막대한 자원도 들고요."
			wait
			dialog "[두베]"
			dialog "그런 위험을 감수해서 게이트를 만들어 유지 할테니 그에 드는 제반비용 및 위험수당을"
			dialog "여러분께서 우리 고양이손 상단에 투자를 통해 지불 하시라는 겁니다."
			wait
			dialog "[두베]"
			dialog "물론 게이트에 드는 비용이 만만찮기 필요한 자금도 상당합니다."
			dialog "여럿이 모여 공동투자를 하면 해결 될 일이긴 하지만요."
			wait
			dialog "[두베]"
			dialog "게이트를 연결하기 위해 필수적으로 드는 제반비용이 있습니다."
			dialog "그만큼 투자금이 모인다면 그에 상응하는 결과가 나타나겠죠."
			wait
			dialog "[두베]"
			dialog "게다가 심연의 회랑은 각 아지트 지역별로 존재합니다."
			dialog "전 지역을 개발하려면 얼마나 많은 비용과 우리 상단의 희생이 필요 하겠습니까?"
			wait
			dialog "[두베]"
			dialog "그렇기에 투자는 지역별 경쟁으로 이루어 질 것입니다."
			dialog "충분한 게이트 유지 비용이 모이지 않는다면, 혜택을 보는 곳은 투자금이 가장 많이 모인 곳..이 되겠죠."
			wait
			dialog "[두베]"
			dialog "대신 ^4d4dff심연의 회랑이 성공적으로 연결 될 경우 해당 아지트의 또 다른 던전은"
			dialog "길드 소유가 아닌 다른 이들도 이용^000000할 수 있도록 배려를 할 예정이니 부담없이 투자해 주시기 바랍니다."
			wait
			dialog "[두베]"
			dialog "어디까지나 회랑이 연결 될 경우지만 말입니다."
			close
		break
		case 3
			dialog "[두베]"
			dialog "간단합니다."
			dialog "^4d4dff투자가 가능한 시간에 투자 하시고자 하는 지역^000000의 지부장을 찾아서 투자를 하면 되죠."
			wait
			dialog "[두베]"
			dialog "보통 ^4d4dff이 곳의 통용화폐인 제니^000000로 받습니다만"
			dialog "어디까지나 우리 고양이손 상단이 지원을 받은 것이기 때문에 말랑도에서 필요로 하는 물품으로 대신 투자를 할 수도 있습니다."
			wait
			dialog "[두베]"
			dialog "말랑도에 있는 고양이손 상단의 총무 나미스에게 상단이 필요로 하는 물자를 제공하고"
			dialog "그걸 증명하는 투자증서를 받아오면 투자내역에 포함을 시켜드리고 있습니다."
			wait
			dialog "[두베]"
			dialog "투자를 하는 지역에 해당 투자내역이 반영되기 때문에 자신이 지지하는 지역에서 투자를 해주셔야 합니다."
			close
		break
		case 4
			dialog "[두베]"
			dialog "심연의 회랑은 기본적으로 아지트를 점유하고 있는 성과 계약을 맺고 연결하는 것이기 때문에"
			dialog "게이트의 연결 및 유지 비용이 모두 충당이 된다면 저희가 제공할 수 있는 모든 것을 제공합니다."
			wait
			dialog "[두베]"
			dialog "작업에 사용되는 최소 비용과 최대 비용을 기준으로 말씀을 드리자면"
			dialog "투자금이 우리가 작업에 필요한 ^4d4dff최소치 이상을 도달^000000하면 당신들이 모르던 ^4d4dff길드 던전의 심층^000000과 연결 할 수 있습니다."
			wait
			dialog "[두베]"
			dialog "우리가 필요로 하면 자금의 최대치 이상에 도달하면 투자 순위에 관계없이 해당 지역은"
			dialog "^4d4dff심연의 회랑^000000과 연결 해 드립니다. 물론 기존의 길드던전 심층도 포함해서요."
			wait
			dialog "[두베]"
			dialog "^ff0000최대치에 도달한 아지트 지역이 존재하지 않을 경우 가장 높은 투자도를 보이는 지역으로"
			dialog "전 지역에서 모인 자금을 모두 끌어모아 심연의 회랑을 연결합니다.^000000"
			wait
			dialog "[두베]"
			dialog "심연의 회랑이 연결 될 경우, 미리 약속한바 길드 던전-심층(2F)을 포함한-은"
			dialog "지역 투자에 같이 힘을 보태 준 일반 모험가들에게 공개합니다."
			wait
			dialog "[두베]"
			dialog "모험가들이 던전을 이용한 만큼은 다음 투자에 해당 아지트 지역에 반영될 예정이니"
			dialog "아지트의 성을 차지한 길드는 모쪼록 그들과 함께 어울려 주시면 좋겠군요."
			wait
			dialog "[두베]"
			dialog "참, 심연의 회랑을 연결하는 것은 지속하기 힘드므로 일주일 단위로 투자와 게이트 연결을"
			dialog "반복 실행할 예정이니, 미지의 힘을 원한다면 아낌없는 성원과 투자 바랍니다."
			close
		break
		endchoose
	break
	case 3
		dialog "[두베]"
		dialog "현재는 투자금을 받지 않습니다."
		dialog "다음 투자 시간이 되면 찾아주십시오."
		close
	break
	case 4
		dialog "[두베]"
		dialog "그렇습니까?"
		dialog "심연의 회랑과 게이트 개발비용 유치를 위한 투자상담은 언제든지 가능하므로 다시 찾아 주십시오."
		close
	break
	endchoose
return

npc "prt_gld" "게이트 관리자#prt_f00" 4_M_BOSSCAT 161 96 3 0 0
OnClick:
	dialog "[아리오스]"
	dialog "여러분들이 투자하신 노력으로 심연의 회랑 [전사의 길]을 성공적으로 연결 할 수 있게 되었습니다."
	dialog "발키리렐름에서는 이에 소정의 입장료를 받고 아지트 던전을 일반 공개합니다."
	wait
	dialog "[아리오스]"
	dialog "입장료는 추후 해당 지역의 투자금으로 적립되니 많은 이용 부탁드립니다."
	dialog "아지트 던전을 이용하시겠습니까?"
	wait
	choose menu "발키리렐름 던전 1F - 10000z" "발키리렐름 던전 2F - 10000z" "취소" 
	case 1
		if v[VAR_MONEY] < 10000
			dialog "[아리오스]"
			dialog "소정의 입장료를 받고 있답니다."
			dialog "다음 투자에 반영하기 위함이니 양해해 주시기 바랍니다."
			dialog "입장료는 10000z 입니다."
			close
			return
		endif
		dialog "[아리오스]"
		dialog "발키리렐름 아지트 던전 1F으로 보내드리겠습니다."
		close
		dropgold 10000
		moveto "gld_dun03" 164 268
	break
	case 2
		if v[VAR_MONEY] < 10000
			dialog "[아리오스]"
			dialog "소정의 입장료를 받고 있답니다."
			dialog "다음 투자에 반영하기 위함이니 양해해 주시기 바랍니다."
			dialog "입장료는 10000z 입니다."
			close
			return
		endif
		dialog "[아리오스]"
		dialog "발키리렐름 아지트 던전 2F으로 보내드리겠습니다."
		close
		dropgold 10000
		moveto "gld_dun03_2" 164 268
	break
	case 3
		dialog "[아리오스]"
		dialog "취소하셨습니다."
		close
	break
	endchoose
return

npc "gef_fild13" "게이트 관리자#gef_f00" 4_M_BOSSCAT 189 206 3 0 0
OnClick:
	dialog "[미자르]"
	dialog "여러분들이 투자하신 노력으로 심연의 회랑 [망자의 언덕]을 성공적으로 연결 할 수 있게 되었습니다."
	dialog "브리토리아에서는 이에 소정의 입장료를 받고 아지트 던전을 일반 공개합니다."
	wait
	dialog "[미자르]"
	dialog "입장료는 추후 해당 지역의 투자금으로 적립되니 많은 이용 부탁드립니다."
	dialog "아지트 던전을 이용하시겠습니까?"
	wait
	choose menu "브리토리아 던전 1F - 10000z" "브리토리아 던전 2F - 10000z" "취소" 
	case 1
		if v[VAR_MONEY] < 10000
			dialog "[아리오스]"
			dialog "소정의 입장료를 받고 있답니다."
			dialog "다음 투자에 반영하기 위함이니 양해해 주시기 바랍니다."
			dialog "입장료는 10000z 입니다."
			close
			return
		endif
		dialog "[미자르]"
		dialog "브리토리아 아지트 던전 1F으로 보내드리겠습니다."
		close
		dropgold 10000
		moveto "gld_dun04" 39 258
	break
	case 2
		if v[VAR_MONEY] < 10000
			dialog "[아리오스]"
			dialog "소정의 입장료를 받고 있답니다."
			dialog "다음 투자에 반영하기 위함이니 양해해 주시기 바랍니다."
			dialog "입장료는 10000z 입니다."
			close
			return
		endif
		dialog "[미자르]"
		dialog "브리토리아 아지트 던전 2F으로 보내드리겠습니다."
		close
		dropgold 10000
		moveto "gld_dun04_2" 39 258
	break
	case 3
		dialog "[아리오스]"
		dialog "취소하셨습니다."
		close
	break
	endchoose
	dialog "[미자르]"
	dialog "취소하셨습니다."
	close
return

npc "alde_gld" "게이트 관리자#alde_f00" 4_M_BOSSCAT 191 164 3 0 0
OnClick:
	dialog "[알코르]"
	dialog "루이나 아지트 던전의 2F을 이용할 수 있게 되었습니다만 심연의 회랑 연결 대상은 아니므로"
	dialog "아지트 던전은 아지트 길드만 이용 가능합니다."
	close
return

npc "pay_gld" "게이트 관리자#pay_f00" 4_M_BOSSCAT 206 189 3 0 0
OnClick:
	dialog "[알카이드]"
	dialog "청림호수은 이번 게이트 연결 대상으로 선정되지 못했습니다."
	dialog "다음번 투자 시기를 기다려 주시길."
	close
return

npc "payg_cas04" "게이트 관리자#pay_f02" 4_M_BOSSCAT 39 264 4 0 0
OnClick:
	dialog "[게이트 관리자]"
	dialog "현재 성을 차지하고 있는 길드원이 아니시군요."
	dialog "용건이 있으시다면 청림호수 광장에 있는 저희 상단원들을 만나 보시기 바랍니다."
	close
return


npc "payg_cas04" "야율아" 2_M_BARD_ORIENT 69 270 3 0 0
OnClick:
	dialog "[야율아]"
	dialog "당신은 누구?"
	dialog "이곳엔 어째서?"
	dialog "우리의 아지트에서 나가주시죠."
	dialog "^FF0000좋은 말로 말씀드릴때.....^000000"
	close
return

npc "payg_cas04" "아신" 1_M_ORIENT01 18 239 3 0 0
OnClick:
	dialog "[아신]"
	dialog "........................."
	wait
	dialog "[아신]"
	dialog "........................."
	wait
	dialog "[아신]"
	dialog "...저기 무슨 볼일이라도"
	dialog "있으신지요? 처음뵙는"
	dialog "분인데... 구경오신건가요?"
	close
return

npc "payg_cas04" "도설지" 4_M_SAGE_A 21 16 3 0 0
OnClick:
	dialog "[도설지]"
	dialog "아 글쎄 여기 오셔도 별로"
	dialog "볼 건 없어요. 뭐 그래도"
	dialog "좋으시다면 계속 있어도"
	dialog "되구요. 안 말려요~"
	close
return

npc "prt_gld" "게이트 관리자#prt_f00" 4_M_BOSSCAT 161 96 3 0 0
OnClick:
	dialog "[아리오스]"
	dialog "현재 연결 된 던전 게이트가 없습니다."
	close
return