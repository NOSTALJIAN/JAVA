package study_221109.ch01;

public class dataTypeEx02 {

	public static void main(String[] args) {
		//	character 문자
		char c1 = 'A';
		System.out.println(c1);		//	A
		
		char c2 = '한';
		System.out.println(c2);		//	한
		
		/*
		char c3 = '한국';
		System.out.println(c3);		//	error
		 */
		
		//	문자 -> 코드
		//	ASCII(아스키2) 코드 : 영문 / 숫자
		//	유니코드 : 다국어
		char c4 = 99;
		System.out.println(c4);		//	c
		
		char c5 = '\uc480';
		System.out.println(c5);		//	쒀
	}
}