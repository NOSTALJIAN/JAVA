package study_221109.ch02.quiz;

public class Q03_forFor {

	public static void main(String[] args) {
		
		//	중첩 for문을 이용해서 4x+5y=60의 모든 해를 구하고
		//	(x, y) 형태로 출력
		
		//	x, y는 10 이하의 자연수
		
		for (int x = 1; x <=10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}