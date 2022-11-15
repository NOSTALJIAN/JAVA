package ch18_io.object;

import java.io.Serializable;

public class Product implements Serializable {
	/*
	 * serialVersionUID 값은 프로그램 작성자가 버전 관리해야 함
	 */
	private static final long serialVersionUID = -5286503029395111423L;
	private String name;
	private int price;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Member [id=" + name + ", name=" + price + "]";
	}
}