package sub1;
/*
 * 날짜 : 2020/05/14
 * 이름 : 배승범
 * 내용 : 예외처리 실습하기 교재 p422
 */
public class ExceptionTest {
	              
	public static void main(String[] args) {
		//클래스 - 하나의 메인파일(실행파일)을 만들고 나머지 다른 클래스는 이용하기위해쓴다.		
		//예외처리는 중간에 문제가발생해도 정상적으로 종료시키게 만들어준다.
		int num1 = 1;
		int num2 = 0;
		int r1 = 0, r2 = 0, r3 = 0, r4 = 0;
		
		try {
			// 에러가 발생할 가능성이 있는 코드로직
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2; //참조범위는 try 안에서만 가능
			
		}catch (Exception e) {
			// 에러가 발생했을때 처리할 로직
			e.printStackTrace(); //출력
		}
		
	                                                                                                                                                                                                                                                                                                                                                                                                                               	System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r1);
		System.out.println("r3 : "+r2);
		System.out.println("r4 : "+r3);
		System.out.println("r4 : "+r4);
		
		
		
		System.out.println("프로그램 종료 .....");
		
		
	}
}
