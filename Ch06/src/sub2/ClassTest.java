package sub2;

/*
 * ��¥ : 2020/05/07
 * �̸� : ��¹�
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */



public class ClassTest {
	public static void main(String[] args) {

		
		
		//�������� ��ü����(instance,object(��ü))
		Account kb = new Account("��������", "121-12-1234", "������", 10000);
		//����Ÿ��(�ּҰ��� �������ִ�) Account, String
		//���������� ��ü��
		//kb�� �ּҰ��� ������ �ְ� new Account��� �޸��ּҸ� ����Ų��.
		//�׷��� kb�ڿ� ��ü�ʱ�ȭ�� ���� .�����δ� 
		//.�� �����Լ�
		// �Ա�, ����ϱ�, ��ȸ�ϱ�
		kb.deposit(10000);
		kb.withdraw(5000); 
		kb.info();
		
		// �������� ��ü����
		Account sh = new Account("��������","121-11-1234","������",30000);
		
		//�Ա�, ���, �ܾ���ȸ�ϱ�
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
	}
}
