package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ��¥ : 2020/05/21
 * �̸� : ��¹�
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
 */


public class FileInputTest {
	public static void main(String[] args) throws Exception {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		FileInputStream fis = new FileInputStream(file);
		int value = 0;
		
		while(true) {
			
			value = fis.read();
		
			if(value == -1) {
				// �� �̻� ���� �����Ͱ� ���� ���
				break;
			}
			
			char c = (char) value;
			System.out.print(c);
		}
		
		// �Է½�Ʈ�� ����
		fis.close();
		
		System.out.println("\n���α׷� ����...");
	
	}
}
