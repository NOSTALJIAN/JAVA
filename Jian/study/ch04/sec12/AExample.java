package study_221109.ch04.sec12;

public class AExample {

	public static void main(String[] args) {
		//A 객체 생성
		A a = new A();
		
		//B 객체 생성
		A.B b = a.new B();
	}
}