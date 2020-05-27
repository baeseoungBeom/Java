package sub1;
import sub1.Outer.Inner;

/*
 *	날짜 : 2020/05/14
 *	이름 : 배승범
 *  내용 : 중첩클래스 실습하기 교재 
 */

public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		Inner inner = out.new Inner(20); //Outer를 먼저 호출하고 Inner를 호출할려면 out.을 써줘야한다
		inner.info();
	}
}
