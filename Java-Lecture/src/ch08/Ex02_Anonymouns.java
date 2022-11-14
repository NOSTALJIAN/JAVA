package src.ch08;

public class Ex02_Anonymouns {
	public static void main(String[] args) {
		Ex01_RemoteControllable rc = new Ex01_RemoteControllable() {
			public void turnOn() {
				System.out.println("익명구현객체 turnOn()");
			}
			public void turnOff() {
				System.out.println("익명구현객체 turnOff()");
			}
			public void setVolume(int volume) {		//	default 메소드
				System.out.println("익명구현객체 setVolume(" + volume + ")");
			}
		};
		rc.turnOn();
		rc.setVolume(3);
		rc.setMute(true);
		rc.turnOff();
	}
}