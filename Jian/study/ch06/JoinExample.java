package study.ch06;
//다른 스레드의 종료를 기다림(2/2)
public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~1000 합 : " + sumThread.getSum());
	}
}