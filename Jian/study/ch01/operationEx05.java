package study_221109.ch01;

public class operationEx05 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		boolean flag = (num1 > 0) && (num2 > 0);	//	and 개념
		System.out.println(flag);					//	true
		
		flag = (num1 < 0) && (num2 > 0);			//	and 개념
		System.out.println(flag);					//	false
		
		flag = (num1 < 0) || (num2 > 0);			//	or 개념
		System.out.println(flag);					//	true
	}
}