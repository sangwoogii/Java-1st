package day0523;

public class TvMain2 {

	public static void main(String[] args) {
		
		// int [] score = new int [5]; 와 같은 방법으로 생성
		
		Tv [] tvArr1 = new Tv[3];
		
		
		// 객체배열 초기화 방법 1번, 보통 많이 사용함
		tvArr1[0] = new Tv();
		tvArr1[1] = new Tv();
		tvArr1[2] = new Tv();
		
		
		// 객체배열 초기화 방법 2번
//		Tv [] tvArr2 = {new Tv(), new Tv(), new Tv()};
		
		
		// 객체배열 초기화 방법 3번, 다루어야 할 객체의 수가 많다면 3번 사용
		Tv[] tvArr3 = new Tv[100];
		
		for (int i=0; i<tvArr3.length; i++) {
			tvArr3[i] = new Tv();
		}
	}

}
