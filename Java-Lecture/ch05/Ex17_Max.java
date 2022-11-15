package ch05;

import java.util.Arrays;
/**
 * 배열에서 최대값 찾기
 */
import java.util.Random;

public class Ex17_Max {

	public static void main(String[] args) {

		//	length가 30인 정수형 배열 score에
		//	100보다 작은 임의의 정수값을 입력하고
		//	이 배열에서 가장 큰 수를 찾으세요
		
		int[] score = new int[30];
		Random ran = new Random();
		for (int i = 0; i < score.length; i++) 
			score[i] = ran.nextInt(100);		//	100 전까지의 정수를 읽어온다
		System.out.println(Arrays.toString(score));
			
		int max = 0;							//	int max = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max)
				max = score[i]; 
		}
		System.out.println(max);
		
		int min = 100;							//	int min = score[0];
		for (int i = 0; i < score.length; i++) {
			if (score[i] < min)
				min = score[i];
		}
		System.out.println(min);
	}

}
