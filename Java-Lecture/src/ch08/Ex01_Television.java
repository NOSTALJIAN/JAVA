package src.ch08;

public class Ex01_Television implements Ex01_RemoteControllable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	public void setVolume(int volume) {
		if (volume > Ex01_Television.MAX_VOLUME)
			this.volume = Ex01_RemoteControllable.MAX_VOLUME;
		else if (volume < Ex01_RemoteControllable.MIN_VOLUME)
			this.volume = Ex01_RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
