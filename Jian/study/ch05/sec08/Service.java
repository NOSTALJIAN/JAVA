package study_221109.ch05.sec08;

public class Service {
	@PrintAnnotation							//	PrintAnnotation 적용
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")						//	PrintAnnotation 적용
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20)		//	PrintAnnotation 적용
	public void method3() {
		System.out.println("실행 내용3");
	}
}