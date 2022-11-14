package study_221109.ch02;

public class ReplaceExample {

	public static void main(String[] args) {

		String oldStr = "서울시 용산구";
		
		//	oldStr,replace("기존", "새로운") -> 기존의 문자열은 그대로 두고 대체한 새로운 문자열을 출력
		String newStr = oldStr.replace("용산", "강남");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}