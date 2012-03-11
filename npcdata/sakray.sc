npc "geffen" "차원 술사 안내인#sa" 4_F_JOB_HUNTER 140 196 5 0 0
OnClick:
	dialog "[사차]"
	dialog "안녕하세요."
	dialog "여러분들에게 다른 세상을"
	dialog "경험시켜드릴 곳으로 안내해 드리는"
	dialog "'사차'입니다."
	wait
	dialog "[사차]"
	dialog "물론 제가 해 드리는 것은 아니고요."
	dialog "제가 안내해 드리는 장소에 있는"
	dialog "분께서 여러분들을 다른 세상으로"
	dialog "안내해 드릴겁니다."
	wait
	dialog "[사차]"
	dialog "자 그럼 다른 세상으로 여행이"
	dialog "준비 되셨나요?"
	wait
	choose menu "예" "아니오" 
	case 1
		dialog "[사차]"
		dialog "와우~"
		dialog "정말 잘 결정하셨어요~"
		dialog "그럼 지금 그 곳으로 보내드릴테니"
		dialog "각오 단단히 하세요~"
		moveto "geffen_in" 180 180
		close
	break
	case 2
		dialog "[사차]"
		dialog "저런..."
		dialog "아직도 준비 못하셨다니.."
		dialog "빨리 준비하고 다시오세요~♡"
		Emotion "차원 술사 안내인#sa" 3
		close
	break
	endchoose
return

//"geffen" 140 190

npc "geffen_in" "사크라이 차원술사#sa" 4_F_JOB_HUNTER 182 194 4 0 0
OnClick:
	dialog "[사사]"
	dialog "안녕하세요~"
	dialog "여러분을 다른 세상으로 여행시켜"
	dialog "드리는 '사사'입니다."
	wait
	dialog "[사사]"
	dialog "앞서 '사차'에게 설명을"
	dialog "들으셨겠지만, 제가 다시 설명을"
	dialog "드릴게요."
	wait
	dialog "[사사]"
	dialog "아! 그 전에 다른 세상으로 여행을"
	dialog "간단히 줄여 차원이동이라고 할게요."
	dialog "이 차원이동은 현재의 손님에게는"
	dialog "아무런 영향을 끼치지 않아요."
	wait
	dialog "[사사]"
	dialog "즉 저에게 차원이동을 받으시더라도"
	dialog "지금 이 곳에 있는 "+PcName+"님"
	dialog "에게는 어떠한 영향도 끼치지"
	dialog "않는다는 거죠."
	wait
	dialog "[사사]"
	dialog "물론 원하신다면 몇 번이든"
	dialog "차원이동을 하실 수 있습니다."
	dialog "하지만 너무 많은 차원 이동을"
	dialog "하시면, 그 쪽 세계의 균형을"
	dialog "깨뜨릴 수 있기 때문에 적절한 수로"
	dialog "제한을 하고 있어요."
	wait
	dialog "[사사]"
	dialog "자 그럼 차원 이동을"
	dialog "신청하시겠어요?"
	dialog "불안하시다면 나중에 신청하셔도"
	dialog "문제없어요."
	wait
	choose menu "지금 신청한다." "다음 기회에..." 
	case 1
		dialog "[사사]"
		dialog "그럼 제가 안전하고 빠르게"
		dialog "차원 이동을 해 드릴게요."
		dialog "잠시만 기다려주세요."
		wait
		wait
		wait
		wait
		wait
		dialog "[사사]"
		dialog "이얍~"
		wait
		dialog "[사사]"
		dialog "휴우...."
		dialog "오래 기다리셨죠?"
		dialog ""+PcName+"님의 정보를"
		dialog "'사크라이' 란 세계로 안정하게"
		dialog "차원이동 시켜 드렸어요."
		wait
		dialog "[사사]"
		dialog "그 곳으로 가시면 저희 안내원이"
		dialog "다시 안내해 드릴테니 꼭 안내를"
		dialog "받으세요~"
		wait
		dialog "[사사]"
		dialog "이용해 주셔서 감사합니다~"
		dialog "좋은 하루 되세요."
		close
	break
	case 2
		dialog "[사사]"
		dialog "아쉽지만 다음에 꼭 다시 들려주세요~"
		dialog "그럼 좋은 하루 되세요~"
		close
	break
	endchoose
return