package study_221109.ch06;

import java.awt.Toolkit;
//	Thread 자식 클래스로 생성
public class BeepPrintExample_3 {
	public static void main(String[] args) {	//	메인 스레드			//	작업 스레드 생성
		Thread thread = new Thread() {									//
			@Override													//
			public void run() {											//	//	작업 스레드가 실행하는 코드
				Toolkit toolkit = Toolkit.getDefaultToolkit();			//	//
				for (int i = 0; i < 5; i++) {							//	//
					toolkit.beep();										//	//
					try {Thread.sleep(500);} catch(Exception e) {}		//	//
				}														//	//
			}															//
		};																//
												//	메인 스레드 실행
		thread.start();													//	작업 스레드 실행
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	}
}