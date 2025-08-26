package castingTest4;


public class Market extends Product{
//	private 변수 선언
	private String name;
	
//	초기화 블록
	{
		name = "이마트";
	}

//	생성자
	public Market() {;}
	public Market(String name) {
		this.name = name;
	}


//	getter, setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	

//	메서드
	public void sellPtoMem(MarketMember cus) {
		 int discount = 0;
		 discount = (int)(super.getPrice()/0.3);

		 System.out.printf("%s 회원님의 기존 잔고:%d원\n", cus.getName(), cus.getMoney());
		 cus.setMoney(cus.getMoney()+(super.getPrice()-discount));
		 System.out.printf("%s 회원님의 남은 잔고:%d원\n", cus.getName(), cus.getMoney());
		 System.out.printf("%"
		 		+ "s 회원님이 할인받은 금액:%d원\n\n", cus.getName(), discount);
	}
	public void sellPtoNMem(MarketNonMember cus) {
		int discount = 0;
		discount = (int)(super.getPrice()/0.05);
		
		System.out.printf("%s 비회원님의 기존 잔고:%d원\n", cus.getName(), cus.getMoney());
		cus.setMoney(cus.getMoney()+(super.getPrice()-discount));
		System.out.printf("%s 비회원님의 남은 잔고:%d원\n", cus.getName(), cus.getMoney());
		System.out.printf("%s 비회원님이 할인받은 금액:%d원\n", cus.getName(), discount);
		cus.setPoint(cus.getPoint()+1);
		System.out.printf("*%s 비회원님의 쿠폰 수:%d개*\n\n", cus.getName(), cus.getPoint());
		
	}
}
