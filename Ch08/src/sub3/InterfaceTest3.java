package sub3;
/*
 * ��¥ : 2020/05/13
 * �̸� : ��¹�
 * ���� : �������̽� �ǽ��ϱ�
 */
public class InterfaceTest3 {
	public static void main(String[] args) {
		// �������̽� ���� : ��ü���� ���յ��� ���ߴ� ����
		Bulb bulb = new Bulb();
		Soket soket = new Cable(bulb);
		
		soket.switchOn();
		soket.switchOff();
		
	}
}
