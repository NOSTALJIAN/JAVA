package study_221109.ch03;

public class PhoneExample {

	public static void main(String[] args) {
		//	Phone 객체 생성
		Phone phone = new Phone();
		
		//	Phone 객체의 필드값 읽기
		System.out.println("제작회사 : " + phone.company);
		System.out.println("모델명 : " + phone.model);
		System.out.println("색깔 : " + phone.color);
		System.out.println("최고가격 : " + phone.maxPrice);
		System.out.println("현재가격 : " + phone.price);
		
		//	Car 객체의 필드값 변경
		phone.price = 170;
		System.out.println("수정된 현재 가격 : " + phone.price);
	}
}