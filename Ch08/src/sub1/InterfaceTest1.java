package sub1;
/*
 * ��¥ : 2020/05/13
 * �̸� : �質��
 * ���� : �������̽� �ǽ��ϱ�
 */
public class InterfaceTest1 {
	public static void main(String[] args) {
		// lg �������� Ÿ���� RemoteControl�� �������ָ� RemoteLG�� �������ִ� �� ���� �����ϴ�.
		// ���� ���� : RemoteControl
		// �������̽� ���� : Ŭ���� ������ ǥ�� ���̵� ����
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chDown();
		lg.soundUp();
		
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chUp();
		samsung.soundUp();
	}
}