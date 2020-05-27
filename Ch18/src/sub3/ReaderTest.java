package sub3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
 * 날짜 : 2020/05/21
 * 이름 : 배승범
 * 내용 : 문자 입출력 스트림 실습하기 교재 p1032 
 */

public class ReaderTest {
	public static void main(String[] args) throws Exception{
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		FileReader fr = new FileReader(file);

		
		
		int value = 0;
		
		while(true) {
			value = fr.read();
			if(value == -1) {
				break;
			}
			
			char c = (char) value;
			System.out.print(c);
		}
		
		
	}
}
