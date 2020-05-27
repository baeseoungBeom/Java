package test02;
/*
 * 날짜 : 2020/05/18
 * 이름 : 배승범
 * 내용 : 클래스 생성자 연습문제
 */
public class King {
	private String name;
	private int year;
	
	public King(int year) {
		this("정조");
		this.year = year;
	}
	
	public King(String name) {
		this.name = name;
	}
	
	public King(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("name : "+name);
		System.out.println("year : "+year);
	}
}








