package study_221109.ch06;

public class InterruptExamplee {
	public static void main(String[] args) {
		Thread thread = new PrintThreadd();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {}
		
		thread.interrupt();
	}
}