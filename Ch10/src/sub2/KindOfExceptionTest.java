package sub2;

/*
 * 날짜 : 2020/05/14
 * 이름 : 배승범
 * 내용 : 다양한 예외처리 실습하기 교재 p433
 */


public class KindOfExceptionTest {
	public static void main(String[] args) {
		
		//배열의 크기에서 벗어난 인덱스값 참조 에러
		int arr[] = new int[3];
		for(int i = 0; i<=3; i++) {
		try {
			arr[i] = (i + 1);	
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 값이 없습니다.");
			}
		}
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		//NullPoint 에러
		Tiger tiger = null;
		
		
		
		try {
			tiger.move();
			tiger.hunt();
		}catch(NullPointerException e) {
			System.out.println("Tiger 객체가 생성되지 않았습니다");
		}
		
		// 캐스팅 에러

		try {
			Animal a1 = new Eagle(); //업캐스팅(다형성)
			Animal a2 = new Shark(); //업캐스팅(다형성)
			
			
			Shark shark = (Shark) a1; // 다운캐스팅
			shark.move();
		}catch(ClassCastException e) {
			System.out.println("캐스팅 연산이 잘못되었습니다");
		} //후검증 역할 try ~ catch
		
		
		
		
		
		System.out.println("프로그램 종료...");
	}
}
