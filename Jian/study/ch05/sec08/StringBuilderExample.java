package study.ch05.sec08;

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
				.append("DEF")				//	문자열을 끝에 추가함
				.insert(0, "ABC")			//	문자열을 지정 위치에 추가
				.delete(3, 4)				//	문자열 일부를 삭제함
				.toString();				//	완성된 문자열을 리턴함
		System.out.println(data);
	}
}