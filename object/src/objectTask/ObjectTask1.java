package objectTask;

import java.util.Objects;
import equalsTest.Student;

//상품 클래스를 만들고
//toString, hashCode, Equals를 재정의하고
//같은 상품인지 비교하기
//상품 예시
//이름(name) : 파인애플
//가격(price) : 20000
//재고(stock) : 15
//원산지(mou) : 필리핀


public class ObjectTask1 {
	
	public static void main(String[] args) {
		Product pd = new Product("파인애플", 20000, 12, "필리핀");
		
		if(pd.equals(new Product("파인애플", 20000, 12, "필리핀"))) {
			System.out.println("동일 상품");
		}else {
			System.out.println("다른 상품");
		}
	}
	
	
	
}
