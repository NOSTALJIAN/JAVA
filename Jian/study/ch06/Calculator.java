package study.ch06;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory1(int memory) {										//	동기화 메소드
		this.memory = memory;				//	메모리 값 저장								//
		try {																				//
			Thread.sleep(2000);				//	2초간 일시 정지								//
		} catch(InterruptedException e) {}													//
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);			//	//	this.memory -> 메모리 값 읽기
	}
	
	public void setMemory2(int memory) {	//	메모리 값 저장								//	동기화 블록
		synchronized(this) {																//
			this.memory = memory;															//
			try {																			//
				Thread.sleep(2000);			//	2초간 일시 정지								//
			} catch(InterruptedException e) {}												//
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);		//	//	this.memory -> 메모리 값 읽기
		}
	}
}