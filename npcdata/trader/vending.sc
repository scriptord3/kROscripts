npc "moc_para01" "īŻ�α� ������#catal01" 4_M_BIBI 22 16 5 0 0
OnClick:
	dialog "[īŻ�α� ������]"
	dialog "����...���� ������ȸ����"
	dialog "���� ����, �ƴ� �����ϴ�!"
	dialog "�Ż�ǰ, ^007777���� īŻ�α� �ǹ�^000000!"
	wait
	dialog "�չٴڿ� �� ���� ��"
	dialog "������ �а� �ִ�."
	dialog "����� ������ ���� ��������"
	dialog "���� �� ����."
	wait
	dialog "[īŻ�α� ������]"
	dialog "�������� ������ �Ȱ�,"
	dialog "������ �ŷ� �Ǵ���"
	dialog "�� ���� �� �� �ִ�"
	dialog "�� ���� �ֹ�����"
	dialog "��� ��� �ƽ��ϴ�!"
	dialog "�� ���� �������� ���� ��� ���ٴ�"
	wait
	dialog "[īŻ�α� ������]"
	dialog "^007777���� īŻ�α� �ǹ�^000000��"
	dialog "1�Ŵ� ���� 200z!"
	dialog "�� ���� �ִ� 50 �ű��� ���� �����մϴ�!"
	wait
	choose menu "^007777���� īŻ�α� �ǹ�^000000 ����" "�ʿ� ����!" "�������� �� ���̴µ�?" 
	case 1
		dialog "[īŻ�α� ������]"
		dialog "����...50�� ���� �帱���?"
		dialog "�󸶳�... �ʿ��ϼ���?"
		wait
		dlgwrite
		if v[MONEY] < xxx
			dialog "[īŻ�α� ������]"
			dialog "�����Ͻ÷��� īŻ�α״� �� 10�ŷ�"
			dialog "2000 z�� �ּž� �ϴµ�,"
			dialog "���� �ƹ����� �����ϳ׿�."
			dialog "��� �Ű��Ͻø�"
			dialog "���� ������� �ٵ�..."
			close
		end
		dialog "[īŻ�α� ������]"
		dialog "�����Ͻ÷��� īŻ�α״� �� 1�ŷ�"
		dialog "200 z�� �ֽø� �˴ϴ�."
		dialog "���� �ֽ��ϴ�."
		dropgold 200
		getitem Vending_Search_Scroll 1
		close
	break
	case 2
		dialog "[īŻ�α� ������]"
		dialog "�ʿ� �����ø� �� �Ǵµ�..."
		dialog "ó������ �ٽ� ������ �帱���?"
		dialog "�� ������ �� �ؾ� �� �� �𸣴µ�..."
		dialog "���� ��¼��?"
		Emotion "" 19
		close
	break
	case 3
		dialog "[īŻ�α� ������]"
		dialog "������ �����翹��."
		dialog "���� ��忡 �ǸŸ� �ñ� �����̾��µ�"
		dialog "�ڲ� �̰� ���ڷ翡 �η�����"
		dialog "�����ȱ⸦ �Ϸ��� �ؼ�"
		dialog "���� �ȷ� ������ �ƾ��."
		wait
		dialog "[īŻ�α� ������]"
		dialog "���� ���谡���� ����"
		dialog "�峪��� ���̴ϱ�"
		dialog "�� ��Ƽ���� �ȸ�����?"
		dialog "�׷� �ǹ̿��� �� ���� ��"
		dialog "������...��...!"
		close
	break
	endchoose
return