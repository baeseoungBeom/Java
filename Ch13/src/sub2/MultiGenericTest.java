package sub2;

import sub1.Apple;
import sub1.Banana;
import sub1.FruitBox;

/*
 * ��¥ : 2020/05/20
 * �̸� : ��¹�
 * ���� : ���׸� Ŭ���� �ǽ��ϱ� ���� p654
 */
public class MultiGenericTest {
	public static void main(String[] args) {
		TV tv = new TV();
		SmartPhone phone = new SmartPhone();
		
		System.out.println("tv : "+tv);
		System.out.println("phone : "+phone);
		
		Product<TV, Integer> p1 = new Product<>(tv, 100);
		Product<SmartPhone, String> p2 = new Product<>(phone, "Galaxy s20");
		
		p1.show();
		p2.show();
	}
}
