package src.ch09;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		
		//	인스턴스(instance member class) 객체
		A.B b = a.new B();
		b.fielld1 = 5;
		b.method1();
		
		//	정적(static member class) 객체 생성
		A.C c = new A.C();
		c.field1 = 7;
		c.field2 = 9;
		c.method1();
		c.method2();
		//	static은 기울여짐
		
		//	local class 객체 생성을 위한 메소드 호출
		a.method();
	}

}
