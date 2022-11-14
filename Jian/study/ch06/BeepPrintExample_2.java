package study_221109.ch06;

import java.awt.Toolkit;
//	Thread 클래스로 직접 생성
public class BeepPrintExample_2 {
	public static void main(String[] args) {	//	메인 스레드
		Thread thread = new Thread(new Runnable() {						//	작업 스레드 생성
			@Override													//
			public void run() {											//
				Toolkit toolkit = Toolkit.getDefaultToolkit();			//	//	작업 스레드가 실행하는 코드
				for (int i = 0; i < 5; i++) {							//	//
					toolkit.beep();										//	//
					try {Thread.sleep(500);} catch(Exception e) {}		//	//
				}														//	//
			}															//
		});																//
												//	메인 스레드 시작
		thread.start();													//	작업 스레드 실행
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}