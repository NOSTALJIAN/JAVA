package src.ch02;

public class Ex03_TypeConversion {

	public static void main(String[] args) {
		byte b = 30;
		short c = 300;
		int i = b;		// 작은 수 --> 큰 수 로 변환할 때는 자동으로 변환됨
		i = c;			// Promotion
		
		short s = (short)i;		// 큰 수 --> 작은 수 로 변환할 때는 강제(명시)적으로 변환 (Casting)
		
		long l = i;			// int --> long
		float f = l;		// long --> float
		double d = f;		// float --> double
		
		if (s >= -128 && s <= 127) {
			byte bb = (byte)s;
		}
		byte bb = (byte)s;	// 실행할 때 에러 발생
		
		System.out.println(s);
		System.out.println(bb);

		i = b + s;
		d = f + l;
		String str = "str" + d;
		// byte -> short -> int -> long -> float -> double -> String
		
		
	}

}
