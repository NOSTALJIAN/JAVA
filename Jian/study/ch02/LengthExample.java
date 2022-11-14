package study_221109.ch02;

public class LengthExample {

	public static void main(String[] args) {
	
		String ssn = "9405172874917";
		
		//	ssn.length() -> ssn String 객체의 문자의 개수를 알 수 있음
		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자릿수가 다릅니다.");
		}
	}
}