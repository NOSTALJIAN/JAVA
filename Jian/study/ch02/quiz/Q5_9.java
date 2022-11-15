package study.ch02.quiz;

import java.util.Scanner;

public class Q5_9 {

	public static void main(String[] args) {

		//	학생들의 점수를 분석한는 프로그램을 만들고자 한다.
		//	키보드로부터 학생 수와 각 학생들의 점수를 입력받아라.
		//	while문과 Scanner의 nextLine() 메소드를 이용
		//	최고 점수 및 평균 점수를 출력하는 코드를 만들어라.
		
		try (Scanner scan = new Scanner(System.in)) {
			boolean run = true;		//	while문 반복을 위해
			int studentNum = 0;		//	학생수
			int[] scores = null;	//	점수 배열

			while (run) {
				System.out.println("------------------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("------------------------------------------------------");
				System.out.print("선택> ");
			
				int selectNo = scan.nextInt();
				
				if (selectNo == 1) {
					System.out.print("학생수> ");
					studentNum = scan.nextInt();
					scores = new int[studentNum];	//	배열이 아직 안만들어졌기 때문에 new int[]사용
				} else if (selectNo == 2) {
					for (int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]> ");
						scores[i] = scan.nextInt();
					}
				} else if (selectNo == 3) {
					for (int i = 0; i < scores.length; i++) {
						System.out.println("scores[" + i + "] : " + scores[i]);
					}
				} else if (selectNo == 4) {
					int max = 0;
					int sum = 0;
					double avg = 0.0;
					for (int i = 0; i < scores.length; i++) {
						max = (max < scores[i])? scores[i] : max;
						sum += scores[i];
					}
					avg = (double) sum/studentNum;
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
				} else if (selectNo == 5) {
					run = false;
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}