package ch04;

import java.util.Scanner;

public class Ex13_While {

	public static void main(String[] args) {

		//	입력값
		//	정수를 입력
		//	합이 100보다 작을 때 까지 입력을 받음
		
		Scanner scan = new Scanner(System.in);			//	입력 받기 위한 절차
		int sum = 0;
		while (sum < 100) {
			System.out.print("정수 입력");
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);
		
		//	의도적으로 무한 루프를 만들고 탈출 조건을 루프 안에서 만들어 줌
		sum = 0;
		while (true) {
			System.out.print("정수 입력");
			int num = scan.nextInt();
			sum += num;
			if (sum >= 100)
				break;
		}
		System.out.println(sum);
		scan.close();
	}

}
