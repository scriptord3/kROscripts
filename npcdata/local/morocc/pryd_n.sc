npc "moc_prydb1" "수상한 고양이#nightmare" 4_CAT_SAILOR4 103 54 3 0 0
OnClick:
	dialog "[수상한 고양이]"
	dialog "미이라 따위에게 당할 줄이야. 아이고 나 죽겠네. 이 일은 아무도 모르게…"
	wait
	choose menu "미이라? 무슨 일이야?" "모른 체 한다"
	case 1
		dialog "[수상한 고양이]"
		dialog "미이라 따위에게 당할 줄이야. 아이고 나 죽겠네. 이 일은 아무도 모르게…"
		wait
		dialog "[수상한 고양이]"
		dialog "아앗 들켰다! 제길… 이런 식으로 오랫동안 쌓아온 도굴꾼으로서의 명성이 추락할 줄은……."
		wait
		dialog "[수상한 고양이]"
		dialog "하지만 그 녀석들 정말 이상하다고! 미이라 주제에! 미이라잖아!! 그 녀석이 그렇게 쎄다니 말이야!"
		wait
		choose menu "강한 미이라라니, 어디에 있지?" "대화를 마친다"
		case 1
			dialog "[수상한 고양이]"
			dialog "후후, 그건 오로지 나만 알고 있지."
			dialog "내가 피라미드의 숨겨진 보물을 찾아 도굴을… 아, 아니 순,순수하게 피라미드를 거닐다가 우연히 찾아 버렸어."
			wait
			dialog "[수상한 고양이]"
			dialog "미아라가 다가오길래 헹~ 하며 비웃고 있었는데, 몸이 휭하고 날아갈 정도로 뺨을 때려버렸다고. 이 귀여운 고양이를… 캬아아아옹! 두고 보자 붕대녀석."
			wait
			choose menu "나도 가보고 싶어" "대화를 마친다"
			case 1
				dialog "[수상한 고양이]"
				dialog "캬악! 그 길이 내가 어떻게 알아낸 길인데!!"
				wait
				dialog "[수상한 고양이]"
				dialog "흠, 하지만 5000zeny 정도 주겠다면 그곳까지 안내해 주지."
				dialog "뭐야! 이상한 눈 하지 말라고! 고양이가 미드가르드에서 살아가는 게 얼마나 힘든줄 알았!"
				wait
				dialog "[수상한 고양이]"
				dialog "^FF0000그러고 보니 너 같이 허약한 애가 갔다간 1초 만에 전투불능이 될 것 같은데?^000000"
				dialog "뭐, 내가 걱정해줄 일은 아니지만 난 경고했다!"
				wait
				choose menu "지불하고 출발." "가지 않는다"
				case 1
					if v[VAR_MONEY] < 5000
						dialog "[수상한 고양이]"
						dialog "..."
						close
					endif
					dropgold 5000
					dialog "[수상한 고양이]"
					dialog "뭐야? 이 헌 돈은… 반짝반짝 한 새 돈 없어? 쳇. 투덜투덜."
					dialog "자, 빨리 따라오기나 해!"
					close
					moveto "moc_prydn1" 93 96
				break
				case 2
					dialog "[수상한 고양이]"
					dialog "5000zeny도 없어서 그러는 건 아니겠지?"
					close
				break
				endchoose
			break
			case 2
				close
			break
			endchoose
		break
		case 2
			dialog "[수상한 고양이]"
			dialog "뭐야 내 얘기가 궁금한 거 아녔어? 이녀서어어억 어디 가서 내 얘기하지 마라!!"
			close
		break
		endchoose
	break
	case 2
		close
	break
	endchoose
return

npc "moc_prydn1" "수상한 고양이#nightmare" 4_CAT_SAILOR4 94 98 3 0 0
OnClick:
	dialog "[수상한 고양이]"
	dialog "네가 한눈 판 사이에 미이라 한 녀석이 또 날 때리고 가버렸어. 흑흑. 이제 그만 돌아가자, 캬오오옹!"
	wait
	choose menu "돌아간다" "베릿트 처치" "에인션트 미이라 처치" "아무것도 아냐"
	case 1
		dialog "[수상한 고양이]"
		dialog "그래그래, 어서 돌아가자고."
		close
		moveto "moc_prydb1" 100 57
	break
	case 2
		var q_2290_pt = checkquest_playtime 2290
		if (q_2290_pt == 1)
			dialog "[수상한 고양이]"
			dialog "..."
			close
			return
		elseif (q_2290_pt == 2)
			erasequest 2290		 
		endif
		
		var q_2289_ht = checkquest_hunting 2289
		if (q_2289_ht == 0)
			dialog "[수상한 고양이]"
			dialog "고양이와 개는 원수지간이라는 것 알고 있니?"
			wait
			dialog "[수상한 고양이]"
			dialog "저 징그럽고 못생긴 베릿트를 봐. 나를 노려보며 꼬리를 좌우로 흔들어대며 다가오려 하고 있어."
			dialog "아, 넌 꼬리가 없지? 저건 내가 눈에 가시라는 의미야. 지금 내게 싸움을 걸어 오고 있는 거라고!"
			wait
			dialog "[수상한 고양이]"
			dialog "게걸스럽게 침도 뚝뚝 흘리고, 숨소리도 수상해. 고르륵 거리는 소리 따위 들을 수 없어."
			dialog "내 뒤를 치려고 때를 기다리고 있는 게 분명한 게지."
			wait
			dialog "[수상한 고양이]"
			dialog "내가 배만 아프지 않았어도 확 발톱으로 얼굴을 긁어줬을 텐데!"
			dialog "절대 마이너우로스가 무서워서 이러는 게 아니라고!"
			wait
			dialog "[수상한 고양이]"
			dialog "너도 집에 무사히 돌아가고 싶다면, 저 못생긴 멍멍이의 엉덩이를 팡팡 때려주는 게 좋을걸? 물리기 전에 말야."
			wait
			choose menu "돕는다" "돕지 않는다."
			case 1
				dialog "[수상한 고양이]"
				dialog "좋아, 그럼 목표치는 20마리다! 수고하도록!"
				setquest 2289
				close
			break
			case 2
				dialog "[수상한 고양이]"
				dialog "흥, 내가 어찌 되도 좋다 이거야? 이 의리 없는 녀석!"
				close
			break
			endchoose
		elseif (q_2289_ht == 1)		 
			dialog "[수상한 고양이]"
			dialog "에인션트 미이라 처치는 잘 되어가나?"
			wait
			choose menu "물론이지" "그만둘래"
				case 1
					dialog "[수상한 고양이]"
					dialog "좋아. 계속 수고하도록."
					close
				break
				case 2
					dialog "[수상한 고양이]"
					dialog "뭣이? 책임감 없는 녀석 같으니!"
					erasequest 2289
					close
				break
			endchoose
		elseif (q_2289_ht == 2) 
			dialog "[수상한 고양이]"
			dialog "이 녀석 보기보다 제법 쓸만하잖아! 잘했어!"
			dialog "베릿트 녀석, 한동안은 이 곳까지 올 생각은 얼씬도 못하겠지? 으헤헤헹!"
			changequest 2289 2290
			getexp 300000
			getJexp 100000
			close
		endif
	break
	case 3
		var q_2291_pt = checkquest_playtime 2291
		if (q_2291_pt == 1)
			dialog "[수상한 고양이]"
			dialog "..."
			close
			return
		elseif (q_2291_pt == 2)
			erasequest 2291		 
		endif
		
		var q_2292_ht = checkquest_hunting 2292
		if (q_2292_ht == 0)
			dialog "[수상한 고양이]"
			dialog "진귀한 보물은 자고로 깊고 깊은 곳에 숨겨져 있는 법!"
			dialog "분명 지하 2층에 아무도 발견하지 못한 미이라들의 생전의 보물들이 모셔져 있음에 틀림없다."
			wait
			dialog "[수상한 고양이]"
			dialog "하지만 조금만 정신을 흐트러뜨리면 어느새 에인션트 미이라가 와서 내 머리를 때리지 뭐야?!"
			wait
			dialog "[수상한 고양이]"
			dialog "이것은 나의 우수한 뇌세포를 감소시켜 보물을 찾지 못하게 하려는 미이라들의 계략임에 틀림없을 터!"
			wait
			dialog "[수상한 고양이]"
			dialog "그들의 계획대로 둘 순 없지! 자, 어서 에인션트 미이라를 처치하러 가는 거다!"
			wait
			dialog "[수상한 고양이]"
			dialog "왜냐는 질문은 받지 않겠어. 너도 아름다운 보석이 어둠 속에 숨죽여 지내는 것을 바라지는 않을 테지!"
			wait
			choose menu "돕는다" "돕지 않는다."
			case 1
				dialog "[수상한 고양이]"
				dialog "좋아, 그럼 목표치는 20마리다! 수고하도록!"
				setquest 2292
				close
			break
			case 2
				dialog "[수상한 고양이]"
				dialog "흥, 내가 어찌 되도 좋다 이거야? 이 의리 없는 녀석!"
				close
			break
			endchoose
		elseif (q_2292_ht == 1)		 
			dialog "[수상한 고양이]"
			dialog "에인션트 미이라 처치는 잘 되어가나?"
			wait
			choose menu "물론이지" "그만둘래"
				case 1
					dialog "[수상한 고양이]"
					dialog "좋아. 계속 수고하도록."
					close
				break
				case 2
					dialog "[수상한 고양이]"
					dialog "뭣이? 책임감 없는 녀석 같으니!"
					erasequest 2292
					close
				break
			endchoose
		elseif (q_2292_ht == 2) 
			dialog "[수상한 고양이]"
			dialog "이 녀석 보기보다 제법 쓸만하잖아! 잘했어!"
			dialog "베릿트 녀석, 한동안은 이 곳까지 올 생각은 얼씬도 못하겠지? 으헤헤헹!"
			changequest 2292 2291
			getexp 600000
			getJexp 200000
			close
		endif
	break
	case 4
		close
	break
	endchoose
return

// warps
warp "moc_prydn1" "PyramidsN1-2" 223 9 2 2
OnTouch:
	moveto "moc_prydn2" 192 8
return

warp "moc_prydn2" "PyramidsN2-1" 195 8 2 3
OnTouch:
	moveto "moc_prydn1" 220 9
return

// mobs
putmob "moc_prydn1" 0 0 0 0 60 N_MINOROUS 5000 0 0
putmob "moc_prydn1" 0 0 0 0 10 N_MUMMY 5000 0 0
putmob "moc_prydn1" 0 0 0 0 50 N_VERIT 5000 0 0
putmob "moc_prydn2" 0 0 0 0 30 N_MIMIC 5000 0 0
putmob "moc_prydn2" 0 0 0 0 30 N_VERIT 5000 0 0
putmob "moc_prydn2" 0 0 0 0 20 N_ARCLOUSE 5000 0 0
putmob "moc_prydn2" 0 0 0 0 20 N_ANCIENT_MUMMY 5000 0 0
putboss "moc_prydn2" 102 85 1 1 1 N_AMON_RA 3600000 600000 0 1