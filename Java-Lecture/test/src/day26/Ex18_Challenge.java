package day26;

import java.util.Arrays;

/*
 * 도전 과제
 * 
 * 두개의 양의 정수를 커맨드 아규먼트로 입력받아서
 * 공약수를 찾아서 배열에 넣어보세요
 */
public class Ex18_Challenge {

	public static void main(String[] args) {

		//	Step 1. 두개의 양의 정수를 아규먼트로 입력받아 각각 num1, num2 변수에 넣기
		//	Step 2. 두수중 작은 수만큼 for-loop을 돌면서 num1, num2로 나누어지는지 확인
		//	Step 3. 찾은 수를 배열로 만들기
		
		for (int m = 0; m < args.length; m++) {
			System.out.println(args[m]);
		}
		
		int num1 = Integer.parseInt(args[0]);
		for (int i = 1; i < num1; i++)
			if (num1 % i == 0)
				System.out.println(i);
		int[] num1Array = new int[] {1, 2, 3, 4, 6, 8, 12};
		System.out.println(Arrays.toString(num1Array));
		
		
		int num2 = Integer.parseInt(args[1]);
		for (int k = 1; k < num2; k++)
			if (num2 % k == 0)
				System.out.println(k);
		int[] num2Array = new int[] {1, 2, 4, 13, 26};
		System.out.println(Arrays.toString(num2Array));
//		System.out.printf(null, args)
		
		
		//			1) 배열을 작은 수 만큼의 크기로 만든다.
		//			2) Step 2에서 걸러진 공약수를 배열에 넣기
		//			3) 공약수의 갯수만큼 새로운 배열에 넣기
		
	}

}
