package study_221109.ch04;

public class SmartPhoneee extends Phoneee {
	//자식 생성자 선언
	public SmartPhoneee(String model, String color) {
		super(model, color);		//	반드시 작성해야 함
		System.out.println("SmartPhoneee(String model, String color) 생성자 실행됨");
	}
}