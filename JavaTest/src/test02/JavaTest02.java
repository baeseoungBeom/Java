package test02;

import java.util.Scanner;

public class JavaTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("input 값 입력 : ");
		
		input = sc.nextInt();  //next __? 질문
		int result = (1 + 2) * input;
		
		System.out.println("(1 + 2) x input = "+result);
		
		String name;
		System.out.print("name 값 입력 : ");
		
		name = sc.next();
		String hello = "안녕! "+name+"님 반갑습니다.";
		
		System.out.println(hello);
		
		
		
	}
}
