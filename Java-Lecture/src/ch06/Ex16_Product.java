package src.ch06;

/*	
1) 인스턴스 필드
	- 한 줄에 출력할 요소의 숫자(elementPerLine)
	
2) 인스턴스 메소드
	- double getAvg(int[])
	- int getMin(int[])
	- void printArray(int[])
	- int getMax(int[])
	- int getSumOfSquare(int[])
	
3) 생성자
	- 인스턴스 필드를 초기화하는 생성자
	
==>	이것을 이용하는 코드를 작성하세요
*/
public class Ex16_Product {
	private int id;
	private String name;
	private int price;
	private String category;
	
	public Ex16_Product() {}
	public Ex16_Product(int id, String name, int price, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Ex16_Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
}
