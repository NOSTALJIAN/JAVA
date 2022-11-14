package study_221109.ch02;

public class IndexOfContainsExample {

	public static void main(String[] args) {

		String subject = "아이폰 14pro";
		
		//	indexOf() -> 특정 문자열의 위치를 찾고자 할 때 사용
		//	주어진 문자열 포함되어 있지 않으면 -1을 리턴
		int location = subject.indexOf("14pro");			//	indexOf -> 주어진 문자열이 시작되는 인덱스를 리턴
		System.out.println(location);
		String subString = subject.substring(location);		//	location의 문자열을 subString 값으로 가져오기
		System.out.println(subString);
		
		location = subject.indexOf("아이폰");
		if (location != -1) {							//	"아이폰"이 문자열에 포함될 때
			System.out.println("애플 핸드폰이군요.");
		} else {
			System.out.println("애플 핸드폰이 아니군요.");
		}
		
		//	contains() -> 주어진 문자열이 단순히 포함되어 있는지를 조사
		//	포함되어 있으면 true, 그렇지 않으면 false를 리턴
		boolean result = subject.contains("14");
		if (result) {
			System.out.println("애플 최신 핸드폰이군요.");
		} else {
			System.out.println("애플 최신 핸드폰이 아니군요.");
		}
	}
}