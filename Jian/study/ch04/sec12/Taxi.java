package study_221109.ch04.sec12;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	//추가 메소드
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}