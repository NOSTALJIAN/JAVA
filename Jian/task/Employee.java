package task;

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
	Employee(int id, String name, String position, LocalDate joinDate) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.joinDate = joinDate;
	}

	//toString() 메소드
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", joinDate=" + joinDate
				+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
				+ "]";
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

	//Getter & Setter
	public int getId() { return id; }
	public void setId(int id) {	this.id = id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getPosition() { return position; }
	public void setPosition(String position) { this.position = position; }

	public LocalDate getJoinDate() { return joinDate; }
	public void setJoinDate(LocalDate joinDate) { this.joinDate = joinDate; }
}