package src.ch02;

public class Ex01_Var {
	public static void main(String[] args) {
		int score = 90;		// 변수 선언할 때 초기값을 부여
		int result = score * 2;
		
		/* Literal */
		int intLiteral = 30;		// integer
		int octal = 036;			// 8진수
		int hexa = 0x1E;
		System.out.println(intLiteral);		//integer
		System.out.println(octal);			//8진수 (octal)
		System.out.println(hexa);			//16진수 (hexadecimal)
		System.out.printf("%d, %d, %d%n", intLiteral, octal, hexa);
		
		double doubbleLiteral = 3.14159;	// floating point(실수)
		char charLiteral = 'a';		// single quote(문자, 글자 1개)
		String strLiteral = "A quick brown fox";	// 문자열
		boolean boolLiteral = true;		// true, flase
		/* 변수(l-value) = 변수(r-value) */
		/* '=' ; 할당 */
		
		if (result > 100) {
			int score1 = 30;
			System.out.println(score);
		}
//		System.out.println(score1);		// score1 변수는 if block 밖에서는 사용 불가
		
	}

}
