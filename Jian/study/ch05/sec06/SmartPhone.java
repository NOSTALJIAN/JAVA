package study_221109.ch05.sec06;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}

	@Override							//	Object의 toString() 메소드를 재정의해서
	public String toString() {			//	제조사와 운영체제가 결합된 문자열을
		return company + ", " + os;		//	리턴하도록 함
	}
}