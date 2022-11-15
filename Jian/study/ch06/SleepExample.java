package study.ch06;

import java.awt.Toolkit;
//	주어진 시간 동안 일시 정지
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {					//	10번
			toolkit.beep();
			try {
				Thread.sleep(3000);						//	3초 주기
			} catch(InterruptedException e) {
			}
		}
	}
}