package study_221109.ch04.sec08;

public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}