package study.ch02;

public class ArrayCopyExample {

	public static void main(String[] args) {

		//	길이가 3인 배열
		String[] oldStrArray = {"Seo", "Ji", "An"};
		
		//	길이가 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		
		//	배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
//		System.arraycopy(원본 배열, 시작 인덱스, 붙여넣을 새 배열, 시작 인덱스, 복사할 항목 수);
		
		//	배열 항목 출력
		for (int i = 0; i < newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}