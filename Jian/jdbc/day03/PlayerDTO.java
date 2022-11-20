package jdbc.day03;

import java.time.LocalDate;

import lombok.Data;

public class PlayerDTO {
	private int backNo;
	private String name;
	private Position position;
	private LocalDate birthDay;
	private int height;
	private int isDeleted;
	
	// 이거 왜 두번 쓰는지 모르겠음...
	public PlayerDTO(int backNo, String name, String position, String birthDay, int height, int isDeleted) {
		super();
		this.backNo = backNo;
		this.name = name;
		this.position = Position.valueOf(position);
		this.birthDay = LocalDate.parse(birthDay);
		this.height = height;
		this.isDeleted = isDeleted;
	}
	PlayerDTO(int backNo, String name, Position position, LocalDate birthDay, int height, int isDeleted) {
		this.backNo = backNo;
		this.name = name;
		this.position = position;
		this.birthDay = birthDay;
		this.height = height;
		this.isDeleted = isDeleted;
	}
	
	@Override
	public String toString() {
		return "PlayerDTO [backNo=" + backNo + ", name=" + name + ", position=" + position + ", birthDay=" + birthDay
				+ ", height=" + height + ", isDeleted=" + isDeleted + "]";
	}
	public int getBackNo() {
		return backNo;
	}
	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public LocalDate getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

}