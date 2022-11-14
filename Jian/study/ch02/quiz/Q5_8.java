package study_221109.ch02.quiz;

public class Q5_8 {

	public static void main(String[] args) {

		//	주어진 배열 항목의 전체 합과 평균을 구하는 코드를 작성하라
		//	중첩 for문 이용
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;		//	항목 수 누적해서 저장 -> 총 인덱스 수
		for (int i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				sum += array[i][k];
				count++;
			}
		}
		avg = (double) sum/count;
		
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}