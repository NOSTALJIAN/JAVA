package study.ch01;

public class dataTypeEx06 {

	public static void main(String[] args) {
		//	byte, short, integer, long
		int i2 = 0b1010;	//	2진수로 나타낸 10
		int i8 = 030;		//	8진수로 나타낸 24
		int i16 = 0xA4;		//	16진수로 나타낸 164
		
		System.out.println(i2);			//	10
		System.out.println(i8);			//	24
		System.out.println(i16);		//	164
		
		int i = 1_000_000;
		System.out.println(i);			//	1000000
	}
}