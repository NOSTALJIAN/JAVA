package study_221109.ch01;

public class operatorEx01 {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 20;
		int sum1 = i1 + i2;
		System.out.println(sum1);		//	30
		
		short s1 = 10;
		short s2 = 20;
		//short sum2 = s1 + s2; 		//	형변환 에러
		//	산술연산자 : 항(int값 이상)이어야 함
		
		//int sum2 = s1 = s2;			//	int타입으로 선언 -> error
		short sum2 = (short)(s1 + s2);	//	강제 형 변환
		System.out.println(sum2);		//	30
		System.out.println(s1 + s2);	//	30, 자동 형 변환
	}
}