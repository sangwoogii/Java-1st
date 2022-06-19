package day0523;

public class Phone {

	String name;
	String spec;
	int cost;
	
	public void phoneSpec() {
//		System.out.println(name + "은 " + spec + "으로 " + cost + "원 입니다.");
		System.out.printf("새로나온 %s은 %s으로 %,d원입니다.\n", name, spec, cost);
		
	}
}
