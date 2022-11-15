package study.ch05.sec06;

public class ToStringExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		String strobj = myPhone.toString();		//	toString() 메소드 호출
		System.out.println(strobj);
		
		System.out.println(myPhone);			//	매개값이 객체가 되면 객체의 toString() 메소드를 호출해서 리턴값을 출력
	}
}