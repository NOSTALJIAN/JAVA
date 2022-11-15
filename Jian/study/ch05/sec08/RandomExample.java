package study.ch05.sec08;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		//선택번호
		int[] selecNumber = new int[6];		//	선택번호 6개가 저장될 배열 생성
		Random random = new Random(3);		//	선택번호를 얻기 위한 Random 객체 생성
		System.out.print("선택번호 : ");
		for(int i = 0; i < 6; i++) {					//
			selecNumber[i] = random.nextInt(45) + 1;	//
			System.out.print(selecNumber[i] + " ");		//	선택번호 6개를 얻어 배열에 저장
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber = new int[6];		//	당첨번호 6개가 저장될 배열 생성
		random = new Random(5);					//	당첨번호를 얻기 위한 Random 객체 생성
		System.out.print("당첨번호 : ");
		for(int i = 0; i < 6; i++) {						//
			winningNumber[i] = random.nextInt(45) + 1;		//
			System.out.print(winningNumber[i] + " ");		//	당첨번호 6개를 얻어 배열에 저장
		}
		System.out.println();
		
		//당첨여부
		Arrays.sort(selecNumber);		//
		Arrays.sort(winningNumber);		//	비교하기 전에 배열 항목을 정렬시킴
		boolean result = Arrays.equals(selecNumber, winningNumber);		//	배열 항목 비교하기
		System.out.print("당첨여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		} else {
			System.out.println("당첨되지 않았습니다.");
		}
		/*
		선택번호 6개를 얻기 위해 Random 객체의 종자값으로 3을 주었고,
		당첨번호 6개를 얻기 위해 Random 객체의 종자값으로 5를 주었다.
		
		서로 다른 종자값을 주었기 때문에 선택번호와 당첨번호는 다르게 나온다.
		만약 종자값을 동일하게 주면 동일한 난수를 얻기 때문에 선택번호와 당첨번호는 같게 나온다.
		 */
	}
}