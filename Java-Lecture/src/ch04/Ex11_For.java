package ch04;

import java.util.Scanner;

public class Ex11_For {

	public static void main(String[] args) {

		//	for		 : 대부분 사용(90%), 반복 횟수를 아는 경우
		//	while	 : 반복 횟수를 정할 수가 없는 경우
		//	do-while : 실전에서 거의 사용하지 않음
		
		
		//							반복할 때 마다 변경되는 
		// for (int i = 1; i <= 100; i++) {
		//		초기값
		//	}				이 조건이 참인 동안 반복
		
		// for (int i = 0; i < 100; i++) {		//	배열(Array)
		//
		//	}
		
		
		//	1에서 1000까지 합
		int sum = 0;
		for (int i=1; i<=1000; i++)
			sum += i;
		System.out.println(sum);
		
		//	1에서 10까지 곱 (factorial)
		int product = 1;
		for (int i=1; i<=10; i++)
			product *= i;
		System.out.println(product);
		
		//	사용자가 입력한 문자열을 5회 받아서 하나의 문자열로 만들기
		Scanner scan = new Scanner(System.in);		// import scanner 누르기
		String line = "";
		for (int i=0; i<5; i++) {		//	5회 반복
			System.out.println("입력하세요.");
			String inputString = scan.nextLine();
			line += inputString;
		}
		System.out.println(line);
		scan.close();
		
		
	}

}
