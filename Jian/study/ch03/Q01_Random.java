package study_221109.ch03;

import java.util.Random;

public class Q01_Random {

	public static void main(String[] args) {
/*
		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져
		다음과 같은 규칙에 따라 상금을 받는 게임이다.
		
		주사위의 눈은 Random 값을 이용
		
		1. 같은 눈이 3개가 나오면 10,000원 + (같은 눈) x 100원의 상금을 받게 된다.
		2. 같은 눈이 2개만 나오는 경우, 1,000원 + (같은 눈) x 100원의 상금을 받게 된다.
		3. 모두 다른 눈이 나오는 경우, (가장 큰 눈) x 100원의 상금을 받게 된다.
 */
		//	주사위 세 개의 눈
		Random random = new Random();
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		int num3 = random.nextInt(6) + 1;
		int prize = getPrize(num1, num2, num3);
		System.out.println("주사위 눈 : " + num1 + ", " + num2 + ", " + num3);
		System.out.printf("상금 : %,d%n", prize);
	}
	
	private static int getPrize (int num1, int num2, int num3) {
		if (num1 == num2 && num2 == num3) {
			return 10_000 + num1 * 1_000;
		}
		if (num1 == num2 || num2 == num3 || num1 == num3) {
			if (num1 == num2) {
				return 1_000 + num1 * 100;
			}
			if (num2 == num3) {
				return 1_000 + num2 * 100;
			}if (num1 == num3) {
				return 1_000 + num1 * 100;
			}
		}
		return 0;
	}
}