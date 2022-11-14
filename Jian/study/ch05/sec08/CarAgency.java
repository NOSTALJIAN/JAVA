package study_221109.ch05.sec08;

public class CarAgency implements Rentable<Caar> {		//	타입 파라미터 P를 Caar로 대체
	@Override
	public Caar rent() {		//
		return new Caar();		//	리턴 타입이 반드시 Caar여야 함
	}							//
}