package study.ch05.sec08;

public class GenericExampleee {
	public static void main(String[] args) {
		HomeAgency homeagency = new HomeAgency();
		Home home = homeagency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		Caar car = carAgency.rent();
		car.run();
	}
}