package mine.src.day26;

import java.util.Scanner;

public class studyNew {

	public static void main(String[] args) {
/*		Scanner로 입력받기
		
		scan.next();		->	공백 이전까지 입력된 문자열을 읽음
		scan.nextInt();		->	공백 이전까지 입력된 숫자(정수)를 읽음
		scan.nextLine();	->	enter키 이전까지 라인 전체(공백 포함)의 데이터를 읽음
*/
		Scanner scan = new Scanner(System.in);	//	입력해서 사용
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		//	정수 : nestInt
		//	공백전까지 정수를 읽어온다.
		System.out.println(a);
		
		System.out.print("실수를 입력하세요 : ");
		double b = scan.nextDouble();
		//	실수 : nextFloat()	//	nextDouble()
		//	공백전까지 실수를 읽어온다.
		System.out.println(b);
		
		scan.nextLine();
		System.out.print("문자열을 입력하세요 : ");
		String str2 = scan.nextLine();
		//	문자열 : nextLine()
		//	라인전체(공백포함)의 데이터를 읽어온다.
		//	주의 :	next()나 nextInt() 등을 쓰고 nextLine()을 쓸 경우
		//			남아있는 엔터를 처리하기 때문에 그 남아있는 엔터를 처리해줘야한다.
		System.out.println(str2);
		
		scan.close();
		//	입력&출력 사용시에는 연결의 맺고 끊음을 확실히 해줘야함.
		
		
		
/*		연산자
		
		1. 부호 연산자 (+, -)
			- 정수나 실수를 나타낼 때 사용
				ex)	+100, -100
				
		2. 증감 연산자 (++, --)
			- 피연산자의 값이 1씩 증가 또는 감소
				ex)	i++ : i에 1을 더해준다.
					++i 로 써도 같은 의미
					
					
*/
	}

}
