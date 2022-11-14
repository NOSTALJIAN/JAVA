package mine.src.test;

public class ex03 {

	public static void main(String[] args) {

		//	1. 논리형
		boolean a = true;
		boolean b = false;
		
		//	2. 문자형 ' ' / 문자열형
		//	char에는 문자 하나만 저장된다. -> ' ? '
		char c = 'a';
		
		//	문자열을 선언하는 방법 -> 기본데이터 자료형이 아닌 '참조 자료형' 사용!
		String d = "abc";
		
		//	3. 정수 -> int형이 대표!
		byte e1 = 0;
		short e2 = 2;
		int e3 = 45;
		long e4 = 10000;
		
		//	4. 실수 -> double형이 대표!
		float f = 3.1f;
		double g = 4.1;		// 4.0
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(e1 + e2 + e3 + e4);
		
		
	}

}
