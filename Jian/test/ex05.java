package mine.src.test;

public class ex05 {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		//	num1과 num2 더하기, 빼기, 곱하기, 나누기의 결과 출력
		
		int sum = num1+num2;
		int minus = num1-num2;
		int mul = num1*num2;
		double div = (double)num1/num2;
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 결과 : " + div);
		
		//	나누기 결과를 가져올 때 실수 타입인 double을 사용함
		//	why? 정수로 딱 나눠지는 결과값이 없을 수도 있기 때문에 double을 사용함
		//	float 와 double 의 차이점은 float는 7자리, double은 15~16자리까지 표현할 수 있음
		
		//int형 변수에 456값을 넣고 생성
		int num3 = 111;
		
		//	결과창에 400(백의자리를 제외하고 나머지를 버리는) 결과를 출력
		//	ex) 111을 넣으면 100이 출력
		
		int result = num3/100*100;
		
		System.out.println("결과 확인 : " + result);
		
		//	num3은 111, 어떻게 해야 100의 자리만 남길지??
		//	111을 100으로 나누면 나눈 몫은 1. 여기에 100을 곱하면 100이 나오니 100의 자리만 남게 됨
		
		//	int형 변수 num4에 777을 넣고 생성
		int num4 = 777;
		
		//	결과에는 771 출력되게 만들기
		//	소숫점은 제외되는거 꼭 기억하기 !
		//	777을 10으로 나눈 정수는 77, 여기에 10을 곱하면 770, 770에 +1을 하면 771
		int result2 = num4/10*10 + 1;
		
		//	ex) num4 = 235;를 넣을때는 결과가 231로 출력됨
		System.out.println("결과 : " + result2);
	}

}
