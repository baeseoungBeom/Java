package P382;

import P381.MyInterface;

public class MyClassB implements MyInterface{
	@Override
	public void method1() {
		System.out.println("MyClassB-method1() ����");
	}
	
	@Override
	public void method2() {
		System.out.println("MyClassB-method2() ����");
	}
}
