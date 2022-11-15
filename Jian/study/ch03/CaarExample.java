package study.ch03;

public class CaarExample {

	public static void main(String[] args) {
		Caar myCar = new Caar("포르쉐");
		Caar yourCar = new Caar("페라리");
		
		myCar.run();
		yourCar.run();
	}
}