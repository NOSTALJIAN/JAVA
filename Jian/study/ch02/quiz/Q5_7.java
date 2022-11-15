package study.ch02.quiz;

public class Q5_7 {

	public static void main(String[] args) {

		//	주어진 배열 항목에서 최대값을 출력하는 코드를 작성하세요
		//	for문
		
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
}