package sub2;
/*
 * 날짜 : 2020/05/19
 * 이름 : 배승범
 * 내용 : 쓰레드 활용 실습하기 교재 p576
 */
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException{
		
		
		//생성자
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start(); //1000번을 기다리지않고 다음함수 호출하고 마지막에 합류한다 run으로 했을때는 1000,1001 이런식으로 물려받아서 3000이된다.
		ct2.start();
		ct3.start();
		
		// 메인쓰레드에서 파생된 서브스레드의 작업이 완료된 후 다시 메인쓰레드로 합류되는것을 실행한다.
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("결과 : "+count.getNum());
		
	}
}
