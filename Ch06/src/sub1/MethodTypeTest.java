package sub1;

/*
 * 날짜 : 2020/05/06
 * 이름 : 배승범
 * 제목 : 
 */

public class MethodTypeTest {

	    //자바 프로그램 시작 메서드
		public static void main(String[] args) {
				
			// 메서드 호출(실행)
			double r1 =type1(1.1);
			System.out.println("r1 : "+r1);
			
			type2(true); //리턴값이없어서 변수를 안만들어도된다.
			
			
			boolean r2 = type3();
			System.out.println("r2 : "+r2);
			
			type4();
			
			
		} //main end
		
		// type1 : 매개변수 O, 리턴값 O
		public static double type1(double a) {
				
			double result = a + 3.14;
			return result;
		}//double 리턴타입
		// type2 : 매개변수 O, 리턴값 X
		public static void type2(boolean isOk) {
			
			if(isOk) {
				System.out.println("참 입니다.");
			}else {
				System.out.println("거짓 입니다.");
			}
		} //void는 리턴값이 없다
		
		// type3 : 매개변수 X, 리턴값 O
		public static boolean type3() {
			
			int num1 = 1, num2 = 2;
			
			if(num1 > num2) {
				return true;
			}else {
				return false;
			}
		}
		
		
		// type4 : 매개변수 X, 리턴값 X
		public static void type4() {
			double y = type1(0.1);
			
			System.out.println("type1(0.1) : "+type1(0.1));
		}
		
		public static void gugudan(int s) {
			for(int i = 2; i<=9; i++) {
				System.out.println(i+"단");
				for(int j = 1; j<=9; j++) {
					System.out.println(i+"x"+j+"= "+i*j);
				}
			}
		}		
}






 
