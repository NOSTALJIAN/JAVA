package study_221109.ch01;

public class operationEx06 {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
			boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
			System.out.println(value);		//	false
			System.out.println(num1);		//	20
			System.out.println(i);			//	2
			
			value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
			System.out.println(value);		//	true
			System.out.println(num1);		//	30
			System.out.println(i);			//	2
	}
}