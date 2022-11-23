package study.ch09;
/*
 * 향상된 for 문
 * 간편하고 가독성이 좋음
 */
public class abtFor {
	public static void main(String[] args) {
		//기존 for 문
		//초기화, 조건, 증감 부분
		int array[] = {1,2,3,4,5};
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		System.out.println();
		
		//for each / 향상된 for 문
		/* 
		 * for each 문법
		 * for(자료형 변수명 : 배열명) {
		 * //TODO
		 * }
		 */
		int array2[] = {1,2,3,4,5};
		
		for(int num : array2) {
			System.out.print(num);
		}
	}
}