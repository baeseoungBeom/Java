package sub3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
 * ��¥ : 2020/05/21
 * �̸� : ��¹�
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p1032 
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
