package study.ch01;

public class operationEx02 {

	public static void main(String[] args) {
		int i1 = 1_000_000;
		int i2 = 2_000_000;
		
		//	오버플로우 overflow
		int product1 = i1 * i2;
		System.out.println(product1);		//	-1454759936
		
		long product2 = (long)i1 * i2;
		System.out.println(product2);		//	2000000000000
	}
}