package sub2;

/*
 * ��¥ : 2020/05/07
 * �̸� : ��¹�
 * ���� : �ڹ� Ŭ���� �ǽ��ϱ�
 */



public class ClassTest {
	public static void main(String[] args) {

		
		
		//�������� ��ü����
		Account kb = new Account("��������", "121-12-1234", "������", 10000);
		//����Ÿ��(�ּҰ��� �������ִ�) Account, String
		//���������� ��ü��
		//kb�� �ּҰ��� ������ �ְ� new Account��� �޸��ּҸ� ����Ų��.
		//�׷��� kb�ڿ� ��ü�ʱ�ȭ�� ���� .�����δ� 
		//.�� �����Լ�
		
		
		// ��ü �ʱ�ȭ
		kb.bank = "kb����";
		kb.id = "121-11-1234";
		kb.name = "������";
		kb.money = 10000;
		
		// �Ա�, ����ϱ�, ��ȸ�ϱ�
		kb.deposit(10000);
		kb.withdraw(5000); 
		kb.info();
		
		// �������� ��ü����
		Account sh = new Account("��������","121-11-1234","������",30000);
		
		// ��ü �ʱ�ȭ
		sh.bank = "��������";
		sh.id = "121-11-1234";
		sh.name = "������";
		sh.money = 30000;
		
		//�Ա�, ���, �ܾ���ȸ�ϱ�
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
	}
}
