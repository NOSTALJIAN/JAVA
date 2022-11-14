package ch08;

/*
 * 다중 인터페이스 구현 클래스
 */
public class Ex03_SmartTV implements Ex01_RemoteControllable, Ex03_Searchable {
	private int volume;
	
	public void search(String url) {
		System.out.println(url + "을/를 검색합니다.");
	}
	public void turnOn() {
		System.out.println("Smart TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Smart TV를 끕니다.");
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
