package study_221109.ch02;

public class EmptyStringExamplle {

	public static void main(String[] args) {

		String food = "";
		
		//	String 변수에 빈 문자열("") 대입 가능 -> 빈 문자열도 String 객체로 생성 됨
		if (food.equals("")) {System.out.println("food 변수가 참조하는 String 객체는 빈 문자열이다.");}
	}
}