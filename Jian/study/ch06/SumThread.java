package study.ch06;
//다른 스레드의 종료를 기다림(1/2)
public class SumThread extends Thread {
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 1000; i++) {
			sum += i;
		}
	}
}