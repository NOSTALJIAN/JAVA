package study_221109.ch04;

public class SmartPhoneeExample {

	public static void main(String[] args) {
		//SmartPhonee 객체 생성
		SmartPhonee myPhone = new SmartPhonee("아이폰14", "스페이스그레이");
		
		//Phonee으로부터 상속 받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
	}
}