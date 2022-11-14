package study_221109.ch05.sec06;

public class HashCodeExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "서지안");
		Student s2 = new Student(1, "서지안");
		
		if (s1.hashCode() == s2.hashCode()) {				//	해시코드가 동일한지 검사
			if (s1.equals(s2)) {							//	데이터가 동일한지 검사
				System.out.println("동등 객체입니다.");
			} else {
				System.out.println("데이터가 다르므로 동등 객체가 아닙니다.");
			}
		} else {
			System.out.println("해시코드가 다르므로 동등 객체가 아닙니다.");
		}
	}
}