package app;

import pack1.A;			//	my_module_a 에서 가져옴
//import pack2.B;			//	my_module_a 에서 가져옴
import pack3.C;			//	my_module_b 에서 가져옴

public class Main {
	public static void main(String[] args) {
		//my_module_a 패키지에 포함된 A 클래스 이용
		A a = new A();
		a.method();
		
//		//my_module_a 패키지에 포함된 B 클래스 이용
//		B b = new B();
//		b.method();
		
		//my_module_b 패키지에 포함된 C 클래스 이용
		C c = new C();
		c.method();
		
		C result = a.getC();
		result.method();
	}
}