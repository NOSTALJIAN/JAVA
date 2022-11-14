package src.ch04;

import java.util.Random;
//import java.util.Scanner;

public class Ex05_FizzBuzz {

	public static void main(String[] args) {

		//	양의 정수 (1 ~ 100)
		//	3의 배수 -> Fizz
		//	5의 배수 -> Buzz
		//	3과 5의 배수 -> FizzBuzz
		//	둘 다 아니면 -> 숫자
		
		//	임의의 정수값을 생성
		Random ran = new Random();				// 객체 생성
		int number = ran.nextInt(100) + 1;		// 1 ~ 100 까지 임의의 정수값 생성

//		//	Scanner 은 입력값을 받을 수 있다.
//		System.out.print("1에서 100까지의 정수를 입력하세요.");
//		Scanner scan = new Scanner(System.in);	// 객체 생성
//		int num = scan.nextInt();
//		number = num;

		
		if (number % 3 == 0 && number % 5 == 0)
		System.out.println("FizzBuzz");
		else if (number % 5 == 0)
		System.out.println("Buzz");
		else if (number % 3 == 0)
		System.out.println("Fizz");
		else
		System.out.println(number);
		
		
		
		
	}

}
