package day0523;

public class TvMain1 {

	public static void main(String[] args) {
		
		// 클래스를 다루기 위해서는 반드시 Main이 필요함 (public static void main(String[] args) 이거처럼)
		// 그래서 Main을 포함한 새로운 클래스를 만든다
		
		Tv t; // 객체를 참조하는 참조 변수 선언
		t = new Tv(); // new라는 키워드를 사용해 Tv라는 설계도를 복제
		// Tv t = new Tv(); 와 같음
		
		t.channel = 7;
		t.volume = 10;
		
		System.out.println("Tv의 채널은 " + t.channel + "이고 볼륨은 " + t.volume + "입니다.");
		
		t.channelDown();
		
		System.out.println("Tv의 채널은 " + t.channel + "이고 볼륨은 " + t.volume + "입니다.");
		
		
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		
		
		Tv t1;
		t1 = new Tv();
		
		Tv t2;
		t2 = new Tv();
		
		System.out.println("t1의 channel : " + t1.channel + ", t1의 volume : " + t1.volume);
		System.out.println("t2의 channel : " + t2.channel + ", t2의 volume : " + t2.volume);
		
		t1.channel = 7;
		t1.volume = 20;
		System.out.println();
		
		System.out.println("t1의 channel : " + t1.channel + ", t1의 volume : " + t1.volume);
		System.out.println("t2의 channel : " + t2.channel + ", t2의 volume : " + t2.volume);
		
		t2 = t1;
		System.out.println();
		
		System.out.println("t1의 channel : " + t1.channel + ", t1의 volume : " + t1.volume);
		System.out.println("t2의 channel : " + t2.channel + ", t2의 volume : " + t2.volume);
		
		
		
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		
		
		
		
		Tv t3;
		t3 = new Tv();
		
		Tv t4;
		t4 = new Tv();
		
		t4 = t3;
		t3.channel = 9;
		
		System.out.println("t3의 channel : " + t3.channel);
		System.out.println("t4의 channel : " + t4.channel);
	}

}
