package study_221109.ch04.sec04;

public class Television implements RemoteControl{
	//필드
	private int volume;

	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	//turnOff() 추상 메소드 오버라이딩
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	//setVolume() 추상 메소드 오버라이딩
	@Override
	public void setVolume(int volume) {				//	인터페이스 상수 필드를 이용해서 volume 필드의 값을 제한
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + volume);
	}
//	
//	//필드
//		private int memoryVolume;		//	추가 필드 선언
//		
//		//디폴트 메소드 재정의
//		@Override
//		public void setMute(boolean mute) {
//			if(mute) {
//				this.memoryVolume = this.volume;
//				System.out.println("무음 처리합니다.");
//				setVolume(RemoteControl.MIN_VOLUME);
//			} else {
//				System.out.println("무음 해제합니다.");
//				setVolume(this.memoryVolume);			//	mute가 false일 경우, 원래 볼륨으로 복원하는 코드
//			}
//		}
}
