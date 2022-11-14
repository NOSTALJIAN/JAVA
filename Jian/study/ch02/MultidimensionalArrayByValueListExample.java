package study_221109.ch02;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {

		//	2차원 배열 생성
		int[][] score = {
				{80, 90, 98},
				{77, 89}
		};
		
		//	배열의 길이
		System.out.println("1차원 배열의 길이(반의 수) : " + score.length);
		System.out.println("2차원 배열의 길이(첫 번째 반의 학생 수) : " + score[0].length);
		System.out.println("2차원 배열의 길이(두 번째 반의 학생 수) : " + score[1].length);
		
		//	첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("score[0][2] : " + score[0][2]);
		
		//	두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("score[1][1] : " + score[1][1]);
		
		//	첫 번째 반의 평균 점수 구하기
		int class1Sum = 0;
		for (int i = 0; i < score[0].length; i++) {
			class1Sum += score[0][i];
		}
		double class1Avg = (double)class1Sum/score[0].length;
		System.out.println("첫 번째 반의 평균 점수 : " + class1Avg);
		
		//	두 번째 반의 평균 점수 구하기
		int class2Sum = 0;
		for (int i = 0; i < score[1].length; i++) {
			class2Sum += score[1][i];
		}
		double class2Avg = (double)class2Sum/score[1].length;
		System.out.println("두 번째 반의 평균 점수 : " + class2Avg);
		
		//	전체 학생의 평균 점수 구하기
		int totalSum = 0;
		int totalStudent = 0;
		for (int i = 0; i < score.length; i++) {			//	반의 수만큼 반복
			totalStudent += score[i].length;				//	반의 학생 수 합산
			for (int k = 0; k < score[i].length; k++) {		//	해당 반의 학생 수만큼 반복
				totalSum += score[i][k];					//	학생 점수 합산
			}
		}
		double totalAvg = (double)totalSum/totalStudent;
		System.out.println("전체 학생의 평균 점수 : " + totalAvg);
	}
}