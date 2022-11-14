package study_221109.ch02;

public class EqualsExample {

	public static void main(String[] args) {

		String strVar1 = "서지안";
		String strVar2 = "서지안";
		
		if (strVar1 == strVar2) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		//	equals()
		//	String 객체의 내부 문자열만을 비교할 때 사용
		if (strVar1.equals(strVar2)) {System.out.println("문자열이 같음");}
		
		String strVar3 = new String("서지안");
		String strVar4 = new String("서지안");
		
		if (strVar3 == strVar4) {
			System.out.println("참조가 같음");
		} else {
			System.out.println("참조가 다름");
		}
		
		if (strVar3.equals(strVar4)) {System.out.println("문자열이 같음");}
	}
}