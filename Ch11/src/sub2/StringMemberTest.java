package sub2;
/*
 * 날짜 : 2020/05/18
 * 이름 : 배승범
 * 내용 : String 멤버 실습하기 교재 p496
 */
public class StringMemberTest {
	public static void main(String[] args) {
		
		String str = "Hello Korea";
		
		// length - 문자열의 길이(문자갯수)
		System.out.println("str 문자열 길이 : "+str.length());
		//띄어쓰기 포함.
		
		// charAt
		System.out.println("str 6번째 문자 : "+str.charAt(6));
		//몇번째 문자
		
		// substring
		System.out.println("str의 0번에서 5번까지 문자열 : "+str.substring(0,5));
		System.out.println("str의 6번에서 마지막까지 문자열 : "+str.substring(6));
		//제외하고 나머지출력(문자열자르기)
		
		// indexOf, lastIndexOf
		int idx1 = str.indexOf("e");
		int idx2 = str.lastIndexOf("e");
		System.out.println("문자열 str에서 앞에서부터 문자 e의 인덱스값 : "+idx1);
		//첫번째에서 찾는것
		System.out.println("문자열 str에서 뒤에서부터 문자 e의 인덱스값 : "+idx2);
		//마지막에서 찾는것
		
		// replace - 문자열 교체
		String newStr = str.replace("Korea", "Busan");
		System.out.println("newStr : "+newStr);
		
		// valueOf - 일반타입 변수를 문자열로 변환
		int     var1 = 1;
		double  var2 = 2.13;
		boolean var3 = true;
		
		//s1 = 1
		//s2 = 2.13
		//s3 = true
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
	
		
	}
	
}
