package castingTest4;

public class MarketNonMember {
//	private 변수 선언
	private String name;
	private String phone;
	private int money;
	private int point;
	private int coupon;
	
//	초기화 블록
	{
		name = "제품";
		phone = "010-0000-0000";
		money = 30000;
		point = 0;
		coupon = 0;
	}

//	getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getCoupon() {
		return coupon;
	}
	public void setCoupon(int coupon) {
		this.coupon = coupon;
	}
	
// 생성자
	public MarketNonMember() {;}
	public MarketNonMember(String name, String phone, int money, int point, int coupon) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
		this.coupon = coupon;
	}
}
