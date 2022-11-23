package study.ch10;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//hashCode 재정의
	@Override
	public int hashCode() {
		return Objects.hash(age, name);		// name과 age 값이 같으면 동일한 hashCode 리턴
	}

	//equals 재정의
	@Override
	public boolean equals(Object obj) {		// name과 age 값이 같으면 true 리턴
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age==age);
		} else {
			return false;
		}
	}
}