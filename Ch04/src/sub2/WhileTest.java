package sub2;

/*
 * ��¥ : 2020/05/04
 * �̸� : ��¹�
 * ���� : �ݺ��� While �ǽ��ϱ�
 */

public class WhileTest {
	
	
	public static void main(String[] args) {
		
	//1���� 10������ ��	
	int i = 0;
	int k = 1;

	
	while(k<=10) {
		i += k;
		k++;
	}
	System.out.println("1����  10���� �� : "+i);
		
	//do ~ while
	
	int eSum = 0;
	int g = 1;
	
	
	
	do {
		if(g % 2 == 0) {
			eSum += g;
		}
		g++;	
	}
	while(g <= 10); //�ѹ��� �����ϰ� ���ǿ����� ���������� �����Ѵ�.
	
	System.out.println("1���� 10���� ¦���� : "+eSum);
	
	//break
	
	int num = 0;
	
	while(true) {
		
		num++; 
		
		if(num%5 == 0 && num%7 == 0) {
			break; //�ݺ��� Ż��
		}		
	}
	
	System.out.println("5�� 7�� �ּҰ���� : "+num);

	//continue
	int total = 0;
	
	for(int s=1; s<=10; s++ ) {
		
		if(s % 2 == 1) {
			continue; //���ǹ� ���϶� �����ϰ� �������̵�
		}
		
		total += s; //���ǹ� �����϶� ����
		
	}
	
	System.out.println("1���� 10���� ¦���� : "+total);
	
	
	
	
	float n = 3.14f;
	
	}

}


