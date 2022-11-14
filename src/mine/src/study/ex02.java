package mine.src.study;

public class ex02 {

/*	메인메소드	-> 클래스를 하나 만들면, 제일 우선으로 메인 메소드를 입력해줘야한다.
		
		- 프로그램을 실행했을 떄, 
		  자바에서 가장 먼저 읽어들여서 그 안의 명령을 모두 작동한 뒤,
		  프로그램을 종료하는 공간
		  
		- 프로그램을 작동시키려면 무조건 있어야 하는 공간
		
		
		변수값 출력하기
			System.out의 println() 메소드를 이용
			println() 괄호 안에 리터럴(Literal / 상수 : 변하지 않는 고정적인 값)을 넣으면 리터럴 그대로 출력되고,
			변수를 넣으면 변수 내 저장된 값이 출력됨
			
			- println() : 괄호 안에 내용을 출력하고 행 변경
			- print() : 괄호 안의 내용을 출력 (행 변경 X)
			- printf("형식문자열", 값1, 값2) : 형식 문자열 형식대로 내용을 출력

			printf("형식문자열", 값1, 값2, ...) : %[argument_index$][flags][width][.precision]conversion
				- 형식문자열에서 %와 변환문자는 필수로 작성, 나머지는 생략 가능
				- flags는 빈자를 채우는 방법 (생략이면 왼쪽이 공백, -는 오른쪽이 공백으로 채워짐)
			
				- %d = 정수
				- %f = 실수
				- %c = 문자 (' ')
				- %s = 문자열 (" ")
 */
	
	public static void main(String[] args) {
		
			System.out.printf("%5d\n", 123);
			System.out.printf("%-5d\n", 123);
			System.out.printf(".2f\n", 12.1234);
			System.out.printf("7.2%\n", 12.1234);
			//	서식지정자 안에 "%숫자d"로 작성하면 출력시 해당 위치에 숫자값 만큼의 공간확보를 하고 값을 출력
			//	실수값을 출력할 때 서식지정자 안에 "%.숫자f"로 작성하면 해당 숫자까지의 소수점 자리를 출력
	}

}
