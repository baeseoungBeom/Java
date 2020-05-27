package sub2;

/*
 * 날짜 : 2020/05/07
 * 이름 : 배승범
 * 제목 : 자바 클래스 실습하기
 */



public class ClassTest {
	public static void main(String[] args) {

		
		
		//국민은행 객체생성
		Account kb = new Account("국민은행", "121-12-1234", "김춘추", 10000);
		//참조타입(주소값을 가지고있다) Account, String
		//참조변수는 객체다
		//kb가 주소값을 가지고 있고 new Account라는 메모리주소를 가르킨다.
		//그래서 kb뒤에 객체초기화와 같이 .을붙인다 
		//.은 참조함수
		
		
		// 객체 초기화
		kb.bank = "kb은행";
		kb.id = "121-11-1234";
		kb.name = "김유신";
		kb.money = 10000;
		
		// 입금, 출금하기, 조회하기
		kb.deposit(10000);
		kb.withdraw(5000); 
		kb.info();
		
		// 신한은행 객체생성
		Account sh = new Account("신한은행","121-11-1234","김유신",30000);
		
		// 객체 초기화
		sh.bank = "신한은행";
		sh.id = "121-11-1234";
		sh.name = "김유신";
		sh.money = 30000;
		
		//입금, 출금, 잔액조회하기
		sh.deposit(10000);
		sh.withdraw(8000);
		sh.info();
		
	}
}
