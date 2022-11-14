package together.ch06;

public class Ex01_Method {

	public static void main(String[] args) {
		int min = getMin(3, 4, 5);
		System.out.println(min);
		System.out.println(getMin(10, 20, 5));
		System.out.println(getMin(100, 83, 145));
	}
	static int getMin(int a, int b, int c) {
		int min = (a < b) ? a : b;
		min = (min > c) ? c: min;
//		if (min > c)				//	윗줄처럼 줄여서 쓸 수 있음
//			min = c;
		return min;
	}
}