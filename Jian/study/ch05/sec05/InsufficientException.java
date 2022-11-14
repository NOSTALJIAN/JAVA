package study_221109.ch05.sec05;

public class InsufficientException extends Exception {		//	일반 예외로 선언
	public InsufficientException() {						//	두 개의 생성자 선언 (1)
	}
	
	public InsufficientException(String message) {			//	두 개의 생성자 선언 (2)
		super(message);
	}
}