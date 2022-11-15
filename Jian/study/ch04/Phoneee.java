package study.ch04;

public class Phoneee {
	//필드 선언
	public String model;
	public String color;
	
	//매개변수를 갖는 생성자 선언
	public Phoneee(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("Phoneee(String model, String color) 생성자 실행");
	}
}