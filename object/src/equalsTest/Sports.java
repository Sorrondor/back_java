package equalsTest;

public class Sports {
	private String type;
	private int total;
	
//	생성자
	public Sports() {;}
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}
	
//	getter, setter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
	public static void main(String[] args) {
		Sports sports = new Sports();
		sports.getTotal();
		sports.getType();
		System.out.println(sports);
	}
	
}
