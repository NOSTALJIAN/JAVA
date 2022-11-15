package study.ch04.sec14;

public class Button {
	//정적 중첩 인터페이스
	//정적 멤버 인터페이스
	public static interface ClickListener {
		//추상 메소드
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();		//	Button이 클릭되었을 때 실행하는 메소드 선언
	}
}