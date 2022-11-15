package study.ch06;
//wait()과 notify()를 이용한 스레드 제어
public class WaitNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();		//	공유 작업 객체 생성
		
		ThreadA threadA = new ThreadA(workObject);		//	//
		ThreadB threadB = new ThreadB(workObject);		//	//
		
		threadA.start();								//	//
		threadB.start();								//	//	작업 스레드 생성 및 실행
	}
}