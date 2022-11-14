package study_221109.ch02.quiz;

public class Q02_while {

	public static void main(String[] args) {

		//	while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때
		//	나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고
		//	눈의 합이 5이면 실행을 멈추는 코드를 작성
		
		//	눈의 합이 5가 되는 경우 -> (1,4) (4,1) (2,3) (3,2)
		
		//	방법 1
//		while (true) {
//			int num1 = (int)(Math.random() * 6) + 1;
//			int num2 = (int)(Math.random() * 6) + 1;
//			System.out.println("(" + num1 + ", " + num2 + ")");
//			if ((num1 + num2) == 5) {
//				break;
//			}
//		}
		
		//	방법 2
		int num1 = 0;
		int num2 = 0;
		
		while (num1 + num2 != 5) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
		}
	}
}