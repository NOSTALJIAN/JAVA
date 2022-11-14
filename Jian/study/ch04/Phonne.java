package study_221109.ch04;

public class Phonne {
	//필드 선언
	String owner;
	
	//생성자 선언
	Phonne(String owner) {
		this.owner = owner;
	}
	
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}