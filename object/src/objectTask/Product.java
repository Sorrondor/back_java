package objectTask;

import java.util.Objects;

public class Product {
	private String name;
	private int price;
	private int stock;
	private String mou;

//	생성자
	public Product() {
	}
	public Product(String name, int price, int stock, String mou) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.mou = mou;
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
	public String getMou() {
		return mou;
	}
	public void setMou(String mou) {
		this.mou = mou;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
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
		return Objects.equals(name, other.getName());
	}
}
