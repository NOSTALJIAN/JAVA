package ch08;

/*
 * 다음은 Soundable 인터페이스 입니다.
 * 
 * sound() 추상 메소드는 객체의 소리를 리턴합니다.
 * 
 * SoundableExample 클래스에서 printSound() 메소드는
 * Soundable인터페이스 타입의 매개 변수를 가지고 있습니다.
 * 
 * main() 메소드에서 printSound()를 호출할 때 Cat과 Dog 객체를 주고 실행하면
 * 각각 "야옹", "멍멍"이 출력되도록 클래스를 작성하세요.
 */

public interface Q03_Soundable {
	String sound();
}