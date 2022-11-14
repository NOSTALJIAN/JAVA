package ch04;

public class Ex02_LeapYear {

	public static void main(String[] args) {

		//	4의 배수면 윤년
		//	100의 배수면 평년
		//	400의 배수면 윤년
		//	1996, 2000, 1900, 2022
		
		int year = 1996;
		if (year % 400 == 0 || year % 4 == 0)
			System.out.println(year + "년은 윤년입니다.");
		else if (year % 100 != 0)
			System.out.println(year + "년은 평년입니다.");
		
		int year1 = 2000;
		if (year1 % 400 == 0 || year1 % 4 == 0)
			System.out.println(year1 + "년은 윤년입니다.");
		else if (year1 % 100 != 0)
			System.out.println(year1 + "년은 평년입니다.");
		
		int year2 = 1900;
		if (year2 % 400 == 0 || year2 % 4 == 0)
			System.out.println(year2 + "년은 윤년입니다.");
		else if (year % 100 != 0)
			System.out.println(year2 + "년은 평년입니다.");
		
		int year3 = 2022;
		if (year3 % 400 == 0 || year3 % 4 == 0)
			System.out.println(year3 + "년은 윤년입니다.");
		else if (year % 100 != 0)
			System.out.println(year3 + "년은 평년입니다.");
		
		
		
	}

}
