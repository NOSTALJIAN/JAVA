package study_221109.ch06;

public class User2Thread extends Thread {
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread");								//	스레드 이름 변경
	}
	
	public void setCalculator(Calculator calculator) {		//	외부에서 공유 객체인
		this.calculator = calculator;						//	Calculator를 받아
	}														//	필드에 저장

	@Override
	public void run() {
		calculator.setMemory2(50);							//	동기화 블록을 가진 메소드 호출
	}
}