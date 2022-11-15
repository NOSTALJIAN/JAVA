package study.ch04;

public class SmartPhonee extends Phonee{
	//자식 생성자 선언
	public SmartPhonee(String model, String color) {
		super();				//생략 가능, 컴파일 시 자동 추가됨
		this.model = model;
		this.color = color;
		System.out.println("SmartPhonee(String model, String Color) 생성자 실행됨");
	}
}