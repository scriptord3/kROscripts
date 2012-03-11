// warps
warp "iz_int01" "#to_izlude01" 96 54 1 1
OnTouch:
	//moveto "izlude" X Y
return

warp "izlude" "#to_ac01" 125 257 1 1
OnTouch:
	moveto "iz_ac01" 99 29
return

warp "izlude" "#to_ac02" 130 257 1 1
OnTouch:
	moveto "iz_ac01" 99 29
return

warp "iz_ac01" "#to_ac01" 100 24 1 1
OnTouch:
	moveto "izlude" 127 253
return

warp "iz_ac01" "#to_ac2f01" 78 25 1 1
OnTouch:
	moveto "iz_ac02" 104 27
return

warp "iz_ac01" "#to_ac2f02" 122 25 1 1
OnTouch:
	moveto "iz_ac02" 104 27
return

warp "iz_ac02" "#to_ac1f01" 94 27 1 1
OnTouch:
	moveto "iz_ac01" 78 28
return

warp "iz_ac02" "#to_ac1f02" 113 27 1 1
OnTouch:
	moveto "iz_ac01" 122 28
return