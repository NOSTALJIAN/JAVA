package study.ch04.sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc 변수에 Television 객체를 대입
		rc = new Television();		//	변수에 구현 객체 Television 대입
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입 (교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
}