package sub1;

/*
 * ��¥ : 2020/05/06
 * �̸� : ��¹�
 * ���� : 
 */

public class MethodTypeTest {

	    //�ڹ� ���α׷� ���� �޼���
		public static void main(String[] args) {
				
			// �޼��� ȣ��(����)
			double r1 =type1(1.1);
			System.out.println("r1 : "+r1);
			
			type2(true); //���ϰ��̾�� ������ �ȸ����ȴ�.
			
			
			boolean r2 = type3();
			System.out.println("r2 : "+r2);
			
			type4();
			
			
		} //main end
		
		// type1 : �Ű����� O, ���ϰ� O
		public static double type1(double a) {
				
			double result = a + 3.14;
			return result;
		}//double ����Ÿ��
		// type2 : �Ű����� O, ���ϰ� X
		public static void type2(boolean isOk) {
			
			if(isOk) {
				System.out.println("�� �Դϴ�.");
			}else {
				System.out.println("���� �Դϴ�.");
			}
		} //void�� ���ϰ��� ����
		
		// type3 : �Ű����� X, ���ϰ� O
		public static boolean type3() {
			
			int num1 = 1, num2 = 2;
			
			if(num1 > num2) {
				return true;
			}else {
				return false;
			}
		}
		
		
		// type4 : �Ű����� X, ���ϰ� X
		public static void type4() {
			double y = type1(0.1);
			
			System.out.println("type1(0.1) : "+type1(0.1));
		}
		
		public static void gugudan(int s) {
			for(int i = 2; i<=9; i++) {
				System.out.println(i+"��");
				for(int j = 1; j<=9; j++) {
					System.out.println(i+"x"+j+"= "+i*j);
				}
			}
		}		
}






 
