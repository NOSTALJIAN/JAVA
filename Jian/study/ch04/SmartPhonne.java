package study_221109.ch04;

public class SmartPhonne extends Phonne {
	//생성자 선언
	SmartPhonne(String owner) {
		//Phonne 생성자 호출
		super(owner);
	}
	
	//메소드 선언
	void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}