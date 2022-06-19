package day0523;

public class 진법변환 {

	public static void main(String[] args) {
		
		// 10진수를 2진수로 변환하는 코드
		// ex) 10진수 10을 2진수로 변환

		
		int arr[] = new int[8]; // 결과를 저장하기 위한 배열 / 8칸까지 값을 저장
		int num = 10; // 10진수 10의 값
		int i = 0;
		
		while (i<8) {
			arr[i] = num % 2; // num 즉 10을 2로 나눈 나머지가 arr의 i번째 값으로 저장
			i++; // 나누고 나면 i가 1씩 증가
			num /= 2; // num = num / 2 , i가 1씩 증가하고 나면 위에서 num을 2로 나눈 나머지의 값이 num이 되는데
					  // 그 num의 값을 다시 2로 나눔 -> 이걸 반복			
		}
		
		for (i=7; i>=0; i--) { // 2진수는 밑에서(거꾸로) 부터 올라가야하기 때문에 i는 7번 (7번인덱스) 부터 시작
			System.out.print(arr[i]);
		}
	}

}
