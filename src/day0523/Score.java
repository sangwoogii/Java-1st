package day0523;

public class Score {

	// 성적 입력 받아 합계와 평균 구하기
	
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float avg;
	
	public void stu_sum() {
		sum = kor + eng + math;
	}
	
	void stu_avg() {
		avg = (float)sum / 3; // 평균은 float이기 때문에 둘 중 하나를 형변환 
	}
	
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
}
