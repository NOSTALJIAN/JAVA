package study.ch02;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {

		//	배열 변수 선언과 배열 생성
		int[] arr1 = new int[3];		//	배열 길이가 3인 arr1 배열 생성
		//	배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println();
		//	배열 항목의 값 변경
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//	배열 항목의 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr1[" + i + "] : " + arr1[i] + ", ");
		}
		System.out.println("\n");
		
		//	배열 변수 선언과 배열 생성
		double[] arr2 = new double[3];
		//	배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println();
		//	배열 항복의 값 변경
		arr2[0] = 1.1;
		arr2[1] = 2.2;
		arr2[2] = 3.3;
		//	배열 항복의 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("arr2[" + i + "] : " + arr2[i] + ", ");
		}
		System.out.println("\n");
		
		//	배열 변수 선언과 배열 생성
		String[] str1 = new String[3];
		//	배열 항목의 초기값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("str1[" + i + "] : " + str1[i] + ", ");
		}
		System.out.println();
		//	배열 항목의 값 변경
		str1[0] = "월";
		str1[1] = "화";
		str1[2] = "수";
		//	배열 항목의 변경 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.print("str1[" + i + "] : " + str1[i] + ", ");
		}
		System.out.println("\n");
	}
}