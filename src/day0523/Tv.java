package day0523;

public class Tv {

	// Tv라는 설계도를 만들기 위한 속성 선언
	String color;
	boolean power; // 전원에 해당하는 것 -> 켜고 끄고 밖에 없기 때문에 boolean형
	int channel;
	int volume;
	
	
	// 메서드 선언
	public void power() { //  출력할게 없으면 void 사용   void란 ? 
		power = !power;
	}
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
	
	void print() { // 지금은 public을 쓰나 안쓰나 크게 상관 x
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	} // TvMain4
	
	void setChannel(int ch) { // 매개변수 1개 선언했을 때
		channel = ch;
	} // TvMain5
}
