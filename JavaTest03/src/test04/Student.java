package test04;
/*
 * 날짜 : 2020/05/18
 * 이름 : 배승범
 * 내용 : 정적변수 연습문제
 */
public class Student {
	public static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("============");
		System.out.println("학번 : "+studentId);
		System.out.println("전공 : "+major);
		System.out.println("학년: "+grade);
	}
}
