package sub1;
import sub1.Outer.Inner;

/*
 *	��¥ : 2020/05/14
 *	�̸� : ��¹�
 *  ���� : ��øŬ���� �ǽ��ϱ� ���� 
 */

public class InnerTest {
	public static void main(String[] args) {
		
		Outer out = new Outer(10);
		out.info();
		
		Inner inner = out.new Inner(20); //Outer�� ���� ȣ���ϰ� Inner�� ȣ���ҷ��� out.�� ������Ѵ�
		inner.info();
	}
}
