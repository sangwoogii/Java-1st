package day0523;

public class TvMain4 {

	public static void main(String[] args) {
		
		Tv myTv = new Tv(); // new라는 키워드를 이용하여 만들어내는 과정 -> 인스턴스
							// mytv는 객체
		
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.print();
		
		
		System.out.println();
		
		
		Tv yourTv = new Tv();
		
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.print();

	}

}
