package study.ch01;

public class variableEx03 {

	public static void main(String[] args) {
		final int MAX_NUM;				//	상수 선언
		MAX_NUM = 6;
		System.out.println(MAX_NUM);
		
		/*
		MAX_NUM = 134;		//	error
		System.out.println(MAX_NUM);
		 */
		
		final int MIN_NUM = 3;			//	선언과 동시에 초기화
		System.out.println(MIN_NUM);	//	3
	}
}