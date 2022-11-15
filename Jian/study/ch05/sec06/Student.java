package study.ch05.sec06;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}
/*
	@Override									//	Object의 hashCode() 메소드를 재정의해서 학생 번호와 이름 해시코드를 합한
	public int hashCode() {						//	새로운 해시코드를 리턴하도록 함
		int hashCode = no + name.hashCode();	//	(번호와 이름이 같으면 동일한 해시코드가 생성됨)
		return hashCode;
	}
*/
	@Override									//	Object의 equals() 메소드를 재정의해서 Student 객체인지를 확인하고
	public boolean equals(Object obj) {			//	학생 번호와 이름이 같으면 true를 리턴하도록 함
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
}