package sub2;

/*
 * 날짜 : 2020/05/04
 * 이름 : 배승범
 * 내용 : 반복문 While 실습하기
 */

public class WhileTest {
	
	
	public static void main(String[] args) {
		
	//1부터 10까지의 합	
	int i = 0;
	int k = 1;

	
	while(k<=10) {
		i += k;
		k++;
	}
	System.out.println("1부터  10까지 합 : "+i);
		
	//do ~ while
	
	int eSum = 0;
	int g = 1;
	
	
	
	do {
		if(g % 2 == 0) {
			eSum += g;
		}
		g++;	
	}
	while(g <= 10); //한번은 실행하고 조건에따라 할지안할지 결정한다.
	
	System.out.println("1부터 10까지 짝수합 : "+eSum);
	
	//break
	
	int num = 0;
	
	while(true) {
		
		num++; 
		
		if(num%5 == 0 && num%7 == 0) {
			break; //반복문 탈출
		}		
	}
	
	System.out.println("5와 7의 최소공배수 : "+num);

	//continue
	int total = 0;
	
	for(int s=1; s<=10; s++ ) {
		
		if(s % 2 == 1) {
			continue; //조건문 참일때 실행하고 상위로이동
		}
		
		total += s; //조건문 거짓일때 실행
		
	}
	
	System.out.println("1부터 10까지 짝수합 : "+total);
	
	
	
	
	float n = 3.14f;
	
	}

}


