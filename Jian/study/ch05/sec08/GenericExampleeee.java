package study_221109.ch05.sec08;

public class GenericExampleeee {
	public static void main(String[] args) {
		Boxx box1 = new Boxx();
		box1.content = "100";
		
		Boxx box2 = new Boxx();
		box2.content = "100";
		
		Boxx box3 = new Boxx();
		box3.content = 100;
		
		boolean result1 = box1.compare(box2);		//	Box의 내용물 비교
		System.out.println("result1 : " + result1);	//
		
		boolean result2 = box2.compare(box3);		//	Box의 내용물 비교
		System.out.println("result2 : " + result2);	//
	}
}