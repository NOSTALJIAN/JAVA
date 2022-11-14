package ch06;

public class Ex22_GetterSetter {
	private int number;
	private boolean success;
	private boolean acceqtable;
	private String name;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {			// number는 100이상 1000미만
		if (number >= 100 && number <1000) {
			this.number = number;
			success = true;
			return;
		}
		success = false;
	}
	public boolean isSuccess() {				//	number가 수정되면 true 아니면 false를 리턴
		return success;
	}
	public void setSuccess(boolean success) {	//	boolean인 경우에는 is로 시작
		this.success = success;
	}
	public boolean isAcceqtable() {
		return acceqtable;
	}
	public void setAcceqtable(boolean acceqtable) {
		this.acceqtable = acceqtable;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Ex21_GetterSetter [number=" + number + ", success=" + success + ", acceqtable=" + acceqtable + ", name="
				+ name + "]";
	}
}
