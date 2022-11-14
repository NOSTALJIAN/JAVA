package study;

public class ex01_1 {

	public static void main(String[] args) {
		
		int result = 10 + 20;
		System.out.println(result);
		
		int x = 1;
		int y = 2;
		int result2 = x + y;
		System.out.println(result2);
		
		int age;
		double value;
		//	첫번째 글자는 문자이거나, '$', '_' 여야 하고, 숫자로 시작 불가
		//		가능 	-> price, $price, _companyName
		//		불가능	-> 1v, @speed, $#value
		//	영어 대소문자가 구분된다.
		//		-> firstname과 firstName은 다른 변수
		//	첫문자는 영어 소문자로 시작하되, 다른 단어가 붙을 경우 첫자를 대문자로 한다.
		//		-> maxSpeed, firstName, carBodyColor
		//	문자 수(길이)의 제한은 없다.
		//	자바 예약어는 사용할 수 없다.
		age = 28;
		value = 60;
		System.out.println(age + value);
		
		int score;		//	변수 선언
		score = 90;		//	값 저장
//		int score = 90;		//	초기값은 선언과 동시에 줄 수 있음
		
		int value2 = 30;
		int result3 = value2 + 10;
		
		System.out.println(score + result3);
		
	}

}
