package study.ch03;


public class perfectNum {

	public static void main(String[] args) {
		for (int i = 2; i < 10_000; i++) {
			if (isPerfectNumber(i))
				System.out.println(i);
			}
		}
	
	static boolean isPerfectNumber(int num) {
		int sumOfDivisors = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) 			//	i는 num의 약수
				sumOfDivisors += i;
		}
			return num == sumOfDivisors;
	}
}