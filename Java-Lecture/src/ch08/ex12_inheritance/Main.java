package src.ch08.ex12_inheritance;

public class Main {

	public static void main(String[] args) {
		InterfaceC ic = new Ex12_ImplementsClass();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		Misc misc = new Misc();
		misc.methodA();
		misc.methodB();
		misc.methodC();
		misc.methodParent();
		
		ic = misc;
		ic.methodA();
		ic.methodB();
		ic.methodC();
//		ic.methodParent(); 	//	error
	}

}
