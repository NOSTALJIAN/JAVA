package study_221109.ch02;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {

		String[] strArray = new String[3];
		strArray[0] = "Jian";
		strArray[1] = "Jian";
		strArray[2] = new String("Jian");
		
		System.out.println(strArray[0] == strArray[1]);			//	 true : 같은 객체 참조
		System.out.println(strArray[0] == strArray[2]);			//	false : 다른 객체 참조
		System.out.println(strArray[0].equals(strArray[2]));	//	 true : 문자열이 동일
	}
}