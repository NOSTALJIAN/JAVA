package study.ch03;

public class Carr {
	//	필드 선언
	String company = "테슬라";
	String model;
	String color;
	int maxSpeed;
	
	//	생성자 선언
	Carr() {}											//	1 생성자
	Carr(String model) {								//	2 생성자
		this.model = model;
	}
	Carr(String model, String color) {					//	3 생성자
		this.model = model;
		this.color = color;
	}
	Carr(String model, String color, int maxSpeed) {	//	4 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}