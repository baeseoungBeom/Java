package sub1;
/*
 * ��¥ : 2020/05/14
 * �̸� : ��¹�
 * ���� : ����ó�� �ǽ��ϱ� ���� p422
 */
public class ExceptionTest {
	              
	public static void main(String[] args) {
		//Ŭ���� - �ϳ��� ��������(��������)�� ����� ������ �ٸ� Ŭ������ �̿��ϱ����ؾ���.		
		//����ó���� �߰��� �������߻��ص� ���������� �����Ű�� ������ش�.
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		
		try {
			// ������ �߻��� ���ɼ��� �ִ� �ڵ����
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2; //���������� try �ȿ����� ����
			
		}catch (Exception e) {
			// ������ �߻������� ó���� ����
			e.printStackTrace(); //���
		}
		
	                                                                                                                                                                                                                                                                                                                                                                                                                               	System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r1);
		System.out.println("r3 : "+r2);
		System.out.println("r4 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		
		System.out.println("���α׷� ���� .....");
		
		
	}
}
