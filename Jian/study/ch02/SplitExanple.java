package study_221109.ch02;

public class SplitExanple {

	public static void main(String[] args) {

		String board = "서지안,29,서울 거주,Fashion Design을 전공했습니다.";
		
		//	문자열 분리
		String[] tokens = board.split(",");
		
		//	인덱스별로 읽기
		System.out.println("이름 : " + tokens[0]);
		System.out.println("나이 : " + tokens[1]);
		System.out.println("지역 : " + tokens[2]);
		System.out.println("전공 : " + tokens[3]);
		System.out.println();
		
		//	for문을 이용하여 읽기
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}
}