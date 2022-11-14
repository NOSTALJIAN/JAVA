package study_221109.ch05.sec04;

public class ThrowsExample1 {
	public static void main(String[] args) {
		try {
			findClass();						//	호출한 곳에서 예외 처리
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}