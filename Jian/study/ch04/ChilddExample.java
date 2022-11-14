package study_221109.ch04;

public class ChilddExample {

	public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		Parentt parent = new Childd();
		
		//Parentt 타입으로 필드와 메소드 사용
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/*
		parent.filed2 = "data2";	//	불가능
		parent.method3();			//	불가능
		 */
		
		//강제 타입 변환
		Childd child = (Childd) parent;
		
		//Childd 타입으로 필드와 메소드 사용
		child.field2 = "data2";		//	가능
		child.method3();			//	가능
	}
}