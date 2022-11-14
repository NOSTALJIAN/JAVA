package study_221109.ch06;
//wait()과 notify()를 이용한 스레드 제어
public class WorkObject {
	public synchronized void methodA() {								//	동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methhodA 작업 실행");
		notify();														//	다른 스레드를 실행 대기 상태로 만듬
		try {
			wait();														//	자신의 스레든는 일시 정지 상태로 만듬
		} catch(InterruptedException e) {}
	}
	
	public synchronized void methodB() {								//	동기화 메소드
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + " : methodB 작업 실행");
		notify();														//	다른 스레드를 실행 대기 상태로 만듬
		try {
			wait();														//	자신의 스레드는 일시 정지 상태로 만듬
		} catch(InterruptedException e) {}
	}
}