package day0523;

public class BoxTest {

	public static void main(String[] args) {
		
		Box b;
		b = new Box();
		
		b.garo = 20;
		b.sero = 20;
		b.nope = 30;
		
		b.boxInfo();
		
		System.out.println();
		System.out.println("상자의 가로, 세로, 높이값은 " + b.garo + ", " + b.sero + ", " + b.nope + "입니다.");
		
		
		// BoxTest.java 즉, 하나의 파일에는 하나의 클래스가 있는 것이 원칙

	}

}
