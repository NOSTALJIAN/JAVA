package study.ch07.revise;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//선택 번호
		int[] SelectNumber = new int[6];
		Random random = new Random(3);
		System.out.print("선택 번호 : ");
		for (int i = 0; i < 6; i++) {
			SelectNumber[i] = random.nextInt(45) + 1;
			System.out.print(SelectNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 번호
		int[] winningNumber = new int[6];
		random = new Random(5);
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		//당첨 여부
		Arrays.sort(SelectNumber);		//	비교 전 배열을 정렬 시킴
		Arrays.sort(winningNumber);		//	비교 전 배열을 정렬 시킴
		boolean result = Arrays.equals(SelectNumber, winningNumber);		//	배열 항목 비교
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨");
		} else {
			System.out.println("당첨 안됨");
		}
	}
}