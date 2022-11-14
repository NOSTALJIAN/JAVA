package study_221109.ch02.quiz;

public class Q01_for {

	public static void main(String[] args) {

		//	for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총 합을 구하시오
		//	3의 배수를 구하기 -> i % 3 == 0, why? 3으로 나누었을 때 나머지가 0이면 3의 배수
		int sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {		//	% n == 0 ->	n의 배수를 구하는 식
				sum += i;
			}
		}
		System.out.println("3의 배수의 합 :" + sum);
	}
}