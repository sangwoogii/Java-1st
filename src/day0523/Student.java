package day0523;

public class Student { // public : 접근제한자
	
	// 1. 필드(속성) 선언
	// (학생이라는 클래스에 대한 속성 선언), 값을 가질 수 있는 것들이 속성이라고 생각하면 됨
	String name;
	int age;
	String addr;
	

	// 메서드(기능) 선언
	// 메서드는 어떠한 동작을 설정하는 것 / 소문자로 선언
	public void studentInfo() { // 메서드 선언 방법
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
		System.out.println("학생 주소 : " + addr);
	}
}
