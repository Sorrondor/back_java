package castingTest4;

public class Product {
//	private 변수 선언
	private String name;
	private int price;
	private int count;
	private String[] nameEx;
//	초기화 블록
	{
		name = "제품";
		price = 1000;
		count = 0;
		nameEx = new String[5];
	}
	
//	getter, setter
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount(int i) {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String[] getNameEx() {
		return nameEx;
	}
	public void setNameEx(String[] nameEx) {
		this.nameEx = nameEx;
	}
	
	//	생성자
	public Product() {;}
	public String getName() {
		return name;
	}
	public Product(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
		
	}	
}
