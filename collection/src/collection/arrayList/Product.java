package collection.arrayList;

import java.util.ArrayList;
import java.util.Objects;

public class Product {
//	이름, 가격, 재고
//	1. private 필드
//	2. 기본 생성자
//	3. 초기화 생성자
//	4. getter, setter
//	5. toString 재정의
//	6. hash/equals 재정의
	
	private String name;
	private int price;
	private int stock;
	
	public Product() {;}
	public Product(String name, int price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
//	getter, setter
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
	}
	
}
