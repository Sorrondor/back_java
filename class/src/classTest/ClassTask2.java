package classTest;

class Market {
	String pName;
	int pPrice;
	int pCount;
	
	public Market() {
		// TODO Auto-generated constructor stub
	}

	public Market(String pName, int pPrice, int pCount) {
		super();
		this.pName = pName;
		this.pPrice = pPrice;
		this.pCount = pCount;
	}
	public void sell(Customer cus) 
	{
		System.out.printf("<<물품을 구매합니다>>\n");
		System.out.printf("%s님이 구매할 물품 이름:%s\n", cus.cName, pName);
		System.out.printf("%s님이 구매할 물품 재고:%d개\n", cus.cName, pCount);
		System.out.printf("%s님의 구매할 물품 가격:%d원\n", cus.cName, pPrice);
		System.out.printf("%s님의 할인율:%d프로\n", cus.cName, cus.cDiscount);
		System.out.printf("%s님의 현재 잔고:%d원\n", cus.cName, cus.cMoney);
		System.out.printf("%s님이 구매하고 남은 물품 재고 수:%d개\n", cus.cName, pCount-1);
		System.out.printf("%s님의 할인받은 금액:%d원\n", cus.cName, pPrice*cus.cDiscount/100);
		System.out.printf("%s님이 남은 잔고:%d원\n", cus.cName,
				cus.cMoney-pPrice*cus.cDiscount/100);
		System.out.println("");
	};
	
//	상품명, 상품가격, 상품재고
//	판매(sell)
//	힌트 : 판매를 할 때, 매개변수로 어떤 것을 받아야 각각 유저마다의 할인율을 판매에 적용시킬 수 있을까?
}
class Customer {
	String cName;
	String cphone;
	int cMoney;
	int cDiscount;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String cName, String cphone, int cMoney, int cDiscount) {
		super();
		this.cName = cName;
		this.cphone = cphone;
		this.cMoney = cMoney;
		this.cDiscount = cDiscount;
	}
//	이름, 폰, 돈, 할인율
}
public class ClassTask2 {
	public static void main(String[] args) {
//		마켓, 소비자를 객체화시키고,
//		소비자에게 마켓의 물건을 판매
//		마켓의 상품 재고와, 소비자의 남은 금액을 출력
		Customer cus1 = new Customer("홍길동", "010-1122-3434", 10000, 20);
		Customer cus2 = new Customer("고길동", "010-3344-5566", 30000, 30);
		Customer cus3 = new Customer("유길동", "010-7788-9090", 40000, 40);
		Market mk1 = new Market("메로나", 1000, 10);
		
		mk1.sell(cus1);
		mk1.sell(cus2);
	}
}
