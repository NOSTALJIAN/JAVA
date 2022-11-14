package study_221109.ch04;

public class PhonneExample {

	public static void main(String[] args) {
		//Phonne phone = new Phonne();	-> X
		
		SmartPhonne smartPhone = new SmartPhonne("서지안");
		
		smartPhone.turnOn();			//	Phonne 의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();			//	Phonne 의 메소드
	}
}