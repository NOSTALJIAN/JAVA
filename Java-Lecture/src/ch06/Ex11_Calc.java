package src.ch06;

public class Ex11_Calc {
	public static void main(String[] args) {
		Calc calc = new Calc(1.2, 3.4);
		double res = calc.add();
		System.out.println(res);
		
		System.out.println(new Calc(2.5, 4.6).add());
		System.out.println(new Calc(2.5, 4.6).sub());
		System.out.println(new Calc(2.5, 4.6).mul());
		System.out.println(new Calc(2.5, 4.6).div());
	}
}

//	class	->	현실 세계를 모델화			CAR
//			-	속성(field, attribute)		제조사, 모델명, 배기량, 색상 
//			-	동작(method)				전진한다, 후진한다, 회전한다, 멈춘다 등
//											하늘을 난다(X) -> 불가능이니 틀림

class Calc { 										//	default 생략되어있음
	double x;
	double y;
	Calc(double x, double y) {
		this.x = x;
		this.y = y;
	}
//	Calc(double a, double b) {						//	생성자
//		x = a;
//		y = b;
//	}
	double add() {									//	method
		return this.x + this.y;
//		return x + y;
	}
	double sub() {
		return this.x - this.y;
	}
	double mul() {
		return this.x * this.y;
	}
	double div() {
		return this.x / this.y;
	}
}