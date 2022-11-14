package together.ch03;

/**
 * 연산자 (Operator)
 */
public class Ex01_Operator {

	public static void main(String[] args) {

		//	증강연산자
		int a = 3;
		int b = a++;
		System.out.printf("a = %d, b = %d", a, b);
			//	printf -> 출력을 위한 함수, 줄바꿈이 필요
			//	%d -> 
			//	\n -> 뉴 라인, 줄을 바꿔라 (%n으로 써도 됨)
		
		int c = ++a;
		System.out.printf("a = %d, c = %d", a, c);
	}

}
