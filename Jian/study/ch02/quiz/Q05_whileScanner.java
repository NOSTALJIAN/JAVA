package study_221109.ch02.quiz;

import java.util.Scanner;

public class Q05_whileScanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//	Scanner 사용 시, String 타입 -> nextLine() / int 타입 -> nextInt() 사용

		int balance = 0;				//	잔고를 balance로 설정(int형)
		
		boolean close = true;		//	while문의 조건식을 위해 변수 성립
		
		while (close) {				//	반복문 시작
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.println("선택> ");
			
		//	여기까지가 문제에 나온 내용
			
			int num = scan.nextInt();
			int money = 0;
			
			switch (num) {
				case 1 :
					System.out.println("예금액> ");
					money = scan.nextInt();
					balance += money;
					break;
				case 2 :
					System.out.println("출금액> ");
					money = scan.nextInt();
					balance -= money;
					break;
				case 3 :
					System.out.println("잔고> " + balance);
					break;
				case 4 :
					close = false;		//	while 조건문을 벗어나게 하기 위함
//					break; 				//	반복문 종료
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
		scan.close();
	}
}