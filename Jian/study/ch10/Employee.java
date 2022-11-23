package study.ch10;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

	//사번, 이름, 직급, 입사일
	private int id;
	private String name;
	private String position;
	private LocalDate joinDate;
	
	//기본 생성자
	Employee () {}

	//모든 종업원 정보를 매개변수로 갖는 생성자
	public Employee(int id, String name, String position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}
	
	//toString() 메소드
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate + "]";
	}

	//hashCode() 메소드
	@Override
	public int hashCode() {
		return Objects.hash(id, joinDate, name, position);
	}

	//equals() 메소드
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(joinDate, other.joinDate) && Objects.equals(name, other.name)
				&& Objects.equals(position, other.position);
	}
}