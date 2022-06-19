package day0523;

public class StudentMain {

	public static void main(String[] args) {

		Student s; // Student를 다루기 위한 s라는 참조변수 생성
		s = new Student(); // Student라는 클래스를 복제 / new는 복제를 의미

		s.name = "김그린";
		s.age = 22;
		s.addr = "울산시 중구 성남동";
		
		s.studentInfo();
		
		
		System.out.println("");
		System.out.println("----------------------");
		System.out.println("");
		
		
		Student s2;
		// 다른 내용을 입력하고 싶기 때문에 참조변수를 하나 생성 참조변수의 이름이 같으면 안됨
		s2 = new Student(); // new라는 키워드를 입력하여 Student를 복제
		
		s2.name = "박자바";
		s2.age = 40;
		s2.addr = "부산시 연제구 연산동";
		
		s2.studentInfo();
	}

}
