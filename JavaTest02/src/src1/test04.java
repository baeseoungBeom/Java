package src1;

/*
 * 날짜 : 2020/05/07
 * 이름 : 배승범
 * 내용 : 배열 선택 정렬하기
 */



public class test04 {
	public static void main(String[] args) {
		int arr[] = {4, 2, 1, 5, 3};
		
			for(int i = 0; i < 4; i++) {
				for(int j = i+1; j<5; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
					}
				}
			}
			// 정렬된 배열 출력하기
			for (int i = 0; i < 5; i++) {
				System.out.println(arr[i]+", ");
		}
	}
}

