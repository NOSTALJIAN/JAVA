package study.ch02;

public class ArrayCreateByVaueListExample_01 {

	public static void main(String[] args) {

		//	배열 변수 선언과 배열 생성
		String[] apple = {"아이폰", "맥북", "아이패드", "에어팟"};
		
		//	배열의 항목값 읽기
		System.out.println("apple[0] : " + apple[0]);
		System.out.println("apple[1] : " + apple[1]);
		System.out.println("apple[2] : " + apple[2]);
		System.out.println("apple[3] : " + apple[3]);
		
		//	인덱스 1번 항복의 값 변경
		apple[1] = "MacBook";
		System.out.println("apple[1] : " + apple[1]);
		System.out.println();
		
		//	배열 변수 선언과 배열 생성
		int[] scores = {170, 167, 175};
		
		//	총합과 평균 구하기
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double)sum/3;
		System.out.println("평균 : " + avg);
	}
}