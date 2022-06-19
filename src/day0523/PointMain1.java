package day0523;

public class PointMain1 {

	public static void main(String[] args) {
		
		Point [] arr = new Point  [5];
		
		for (int i=0; i<5; i++) {
			arr[i] = new Point();
			arr[i].x = i + 1;
			arr[i].y = i * 2;
		}
		
		for (int i=0; i<5; i++) {
			System.out.print("arr[" + i + "].x = " + arr[i].x);
			System.out.println(" , arr[" + i + "].y = " + arr[i].y);
		}

	}

}
