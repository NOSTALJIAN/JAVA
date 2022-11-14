package study_221109.ch04;

public class SmartPhoneeeExample {

	public static void main(String[] args) {
		//SmartPhoneee 객체 생성
		SmartPhoneee myPhone = new SmartPhoneee ("아이폰", "스페이스그레이");
		
		//Phoneee으로부터 상속 받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	}
}