package study_221109.ch04;

public sealed class Personn permits Employee, Manager {
	//필드
	public String name;
	
	//메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}