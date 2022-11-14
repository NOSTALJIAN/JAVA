package study_221109.ch05.sec09;

public class Box<T> {
	//필드
	private T t;
	
	//Getter 메소드
	public T get() {
		return t;
	}
	
	//Setter 메소드
	public void set(T t) {
		this.t = t;
	}
}