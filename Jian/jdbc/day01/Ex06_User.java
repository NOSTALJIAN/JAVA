package jdbc.day01;

import lombok.Data;

@Data	//Constructor, Getter, Setter, hashCode(), equals(), toString() 자동 생성
public class Ex06_User {
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
}