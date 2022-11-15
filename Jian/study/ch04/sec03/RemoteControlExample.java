package study.ch04.sec03;

public class RemoteControlExample {

	public static void main(String[] args) {
//		System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
//		System.out.println("리모콘 최저 볼륨 : " + RemoteControl.MIN_VOLUME);
		
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}