package study.ch02;

public class ArrayCreateByVaueListExample_02 {

	public static void main(String[] args) {

		//	배열 변수 선언
		int[] score;
		
		//	배열 변수에 배열을 대입
		score = new int[] {97, 88, 69};
		
		//	배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += score[i];
		}
		System.out.println("총합 : " + sum1);
		
		//	배열을 매개값으로 주고, printItem() 메소드 호출
		printItem(new int[] {97, 88, 69});
	}
	//	printItem() 메소드 선언
	public static void printItem(int[] score) {
		//	매개변수가 참조하는 배열의 항목을 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("score[" + i + "] : " + score[i]);
		}
	}
}