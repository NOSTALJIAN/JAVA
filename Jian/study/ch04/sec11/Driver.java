package study_221109.ch04.sec11;

public class Driver {
	void drive (Vehicle vehicle) {		//	구현 객체가 대입될 수 있도록 매개변수를 인터페이스 타입으로 선언
		vehicle.run();					//	인터페이스 메소드 호출
	}
}