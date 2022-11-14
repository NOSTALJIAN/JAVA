package study_221109.ch05.sec08;

public class Boxx<T> {
	public T content;
	
	//Box의 내용물이 같은지 비교
	public boolean compare(Boxx<T> other) {
		boolean result = content.equals(other.content);		//	Object의 equals() 메소드로 content 필드값 비교
		return result;
	}
}