package study_221109.ch01;

public class typeCastingEx01 {

	public static void main(String[] args) {
		
		//	자동 형 변환
		short s1 = 10;
		int i1 = s1;
		System.out.println(i1);		//	10
		
		float f1 = 10.0f;
		double d1 = f1;
		System.out.println(d1);		//	10.0
		
		char c1 = 'C';
		int i2 = c1;
		System.out.println(i2);		//	67
		
		//	강제 형 변환
		int i3 = 20;
		//	short s2 = i3;
		short s2 = (short)i3;
		System.out.println(s2);		//	20
		
		char c2 = 'S';
		int i4 = c2;
		char c3 = (char)i4;
		System.out.println(c3);		//	S
	}
}