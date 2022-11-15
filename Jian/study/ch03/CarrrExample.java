package study.ch03;

public class CarrrExample {

	public static void main(String[] args) {
		Carrr car1 = new Carrr("파나메라");							//	1 생성자 호출
		System.out.println("car1.company  : " + car1.company);
		System.out.println("car1.model    : " + car1.model);
		System.out.println();
		
		Carrr car2 = new Carrr("박스터", "노란색");					//	2 생성자 호출
		System.out.println("car2.company  : " + car2.company);
		System.out.println("car2.model    : " + car2.model);
		System.out.println("car2.color    : " + car2.color);
		System.out.println();

		Carrr car3 = new Carrr("타이칸", "파란색", 250);			//	3 생성자 호출
		System.out.println("car3.company  : " + car3.company);
		System.out.println("car3.model    : " + car3.model);
		System.out.println("car3.color    : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
		System.out.println();
	}
}