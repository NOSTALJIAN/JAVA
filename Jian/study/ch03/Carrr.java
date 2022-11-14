package study_221109.ch03;

public class Carrr {
	//	필드 선언
	String company = "포르쉐";
	String model;
	String color;
	int maxSpeed;
	
	Carrr(String model) {								//	1 생성자
		this(model, "검정색", 250);
	}
	
	Carrr(String model, String color) {					//	2 생성자
		this(model, color, 250);
	}
	
	Carrr(String model, String color, int maxSpeed) {	//	3 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}