package sub2;
/*
 * ��¥ : 2020/05/19
 * �̸� : ��¹�
 * ���� : ������ Ȱ�� �ǽ��ϱ� ���� p576
 */
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException{
		
		
		//������
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start(); //1000���� ��ٸ����ʰ� �����Լ� ȣ���ϰ� �������� �շ��Ѵ� run���� �������� 1000,1001 �̷������� �����޾Ƽ� 3000�̵ȴ�.
		ct2.start();
		ct3.start();
		
		// ���ξ����忡�� �Ļ��� ���꽺������ �۾��� �Ϸ�� �� �ٽ� ���ξ������ �շ��Ǵ°��� �����Ѵ�.
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("��� : "+count.getNum());
		
	}
}
