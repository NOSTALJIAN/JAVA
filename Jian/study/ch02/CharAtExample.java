package study_221109.ch02;

public class CharAtExample {

	public static void main(String[] args) {

		String ssn = "9405172874917";
		
		//	ssn.charAt() -> ssn의 ()번째 인덱스의 문자를 가져옴
		char sex = ssn.charAt(6);
		switch (sex) {
			case '1' :
			case '3' :
				System.out.println("남자입니다.");
				break;
			case '2' :
			case '4' :
				System.out.println("여자입니다.");
				break;
		}
	}
}