package study_221109.ch01;

public class variableEx01 {
	
	public static void main (String[] args) {
		//	변수 선언
		int num1;
		
		//	초기화
		num1 = 17;
		System.out.println(num1);	//	17
		
		//	선언과 동시에 초기화
		int num2 = 94;
		System.out.println(num2);	//	94
		
		//	중복선언 -> error
//		int num1 = 05;
		
		int num3, num4=171;			//	num4만 초기화되고 num3은 선언만 됨
		num3 = 60;
		System.out.println(num3);	//	60
		System.out.println(num4);	//	171
	}
}
