package src1;

/*
 * ��¥ : 2020/05/07
 * �̸� : ��¹�
 * ���� : �迭 ���� ����ϱ�
 */


public class test01 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'};
		int row, col;
		
		for(row = 1; row < 10; row++) {
			
			for(col = 0; col <= row; col++) {
				System.out.print(str[col]);
			}
			
			System.out.println("\n");
		}
	}
	
}