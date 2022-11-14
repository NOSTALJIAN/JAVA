package study_221109.ch06;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrinttThread();			//	강제 타입 변환
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		thread.interrupt();							//	interrupt() 메소드 호출
	}
}