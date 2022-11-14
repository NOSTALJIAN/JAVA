package study_221109.ch02;

public class SubStringExample {

	public static void main(String[] args) {

		String ssn = "940517-2987874";
		
		//	ssn.substring() -> 특정 위치의 문자열을 가져오고 싶을 때 사용
		String firstNum = ssn.substring(0, 6);		//	ssn의 0부터 6까지의 인덱스를 가져옴
		System.out.println(firstNum);				//	940517
		
		String secondNum = ssn.substring(7);		//	ssn의 7부터 시작하는 인덱스를 가져옴
		System.out.println(secondNum);				//	2987874
	}
}