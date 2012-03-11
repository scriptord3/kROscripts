npc "moc_para01" "카탈로그 마도사#catal01" 4_M_BIBI 22 16 5 0 0
OnClick:
	dialog "[카탈로그 마도사]"
	dialog "저기...게펜 마법학회에서"
	dialog "직접 공습, 아니 공급하는!"
	dialog "신상품, ^007777만능 카탈로그 실버^000000!"
	wait
	dialog "손바닥에 써 놓은 걸"
	dialog "열심히 읽고 있다."
	dialog "당신의 반응을 살필 여유조차"
	dialog "없는 것 같다."
	wait
	dialog "[카탈로그 마도사]"
	dialog "노점에서 무엇을 팔고,"
	dialog "무엇이 거래 되는지"
	dialog "한 눈에 알 수 있는"
	dialog "초 간편 주문서가"
	dialog "방금 출시 됐습니다!"
	dialog "전 세계 노점인이 가장 즐겨 쓴다는"
	wait
	dialog "[카탈로그 마도사]"
	dialog "^007777만능 카탈로그 실버^000000가"
	dialog "1매당 고작 200z!"
	dialog "한 번에 최대 50 매까지 구입 가능합니다!"
	wait
	choose menu "^007777만능 카탈로그 실버^000000 구입" "필요 없다!" "상인으로 안 보이는데?" 
	case 1
		dialog "[카탈로그 마도사]"
		dialog "저기...50장 전부 드릴까요?"
		dialog "얼마나... 필요하세요?"
		wait
		dlgwrite 0 50
		var total_vs = input * 200
		if (v[VAR_MONEY] < total_vs)
			dialog "[카탈로그 마도사]"
			dialog "구입하시려는 카탈로그는 총 10매로"
			dialog total_vs + " z를 주셔야 하는데,"
			dialog "돈이 아무래도 부족하네요."
			dialog "장비를 매각하시면"
			dialog "돈이 충분해질 텐데..."
			close
		endif
		dialog "[카탈로그 마도사]"
		dialog "구입하시려는 카탈로그는 총 1매로"
		dialog total_vs + " z를 주시면 됩니다."
		dialog "여기 있습니다."
		dropgold total_vs
		getitem Vending_Search_Scroll input
		close
	break
	case 2
		dialog "[카탈로그 마도사]"
		dialog "필요 없으시면 안 되는데..."
		dialog "처음부터 다시 설명을 드릴까요?"
		dialog "이 다음엔 뭘 해야 할 지 모르는데..."
		dialog "이제 어쩌죠?"
		Emotion "" 19
		close
	break
	case 3
		dialog "[카탈로그 마도사]"
		dialog "본업은 마법사예요."
		dialog "상인 길드에 판매를 맡길 예정이었는데"
		dialog "자꾸 이걸 빗자루에 부록으로"
		dialog "끼워팔기를 하려고 해서"
		dialog "직접 팔러 나오게 됐어요."
		wait
		dialog "[카탈로그 마도사]"
		dialog "여긴 모험가들이 많이"
		dialog "드나드는 곳이니까"
		dialog "곧 불티나게 팔리겠죠?"
		dialog "그런 의미에서 몇 개만 더"
		dialog "구입을...좀...!"
		close
	break
	endchoose
return