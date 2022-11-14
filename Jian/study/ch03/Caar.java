package study_221109.ch03;

public class Caar {
	//	필드 선언
	String model;
	int speed;
	
	//	생성자 선언
	Caar(String model) {
		this.model = model;			//	매개변수를 필드에 대입
	}
	
	//	메소드 선언
	void setSpeed(int speed) {
		this.speed = speed;			//	매개변수를 필드에 대입
	}
	
	void run () {
		this.setSpeed(100);
		System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
		//	이 위에 this.model & this.speed & this.setSpeed 의 this는 생략 가능
	}
}