package test04;
/*
 * ��¥ : 2020/05/18
 * �̸� : ��¹�
 * ���� : �������� ��������
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
		System.out.println("�й� : "+studentId);
		System.out.println("���� : "+major);
		System.out.println("�г�: "+grade);
	}
}
