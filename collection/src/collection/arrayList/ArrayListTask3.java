package collection.arrayList;

import java.util.ArrayList;

public class ArrayListTask3 {
	public static void main(String[] args) {
		ArrayList<Product> pd = new ArrayList<Product>();
		
		pd.add(new Product("메로나", 500, 10));
		pd.add(new Product("돼지바", 500, 10));
		pd.add(new Product("빠삐코", 500, 10));
		pd.add(new Product("요맘때", 500, 10));
		
//		System.out.println(pd);
		
//		1. 재고가 100개 이상인 상품만 출력
	
//		2. 빠삐코 가격 100000으로 변경
//		pd.get(3).setPrice(100000);
//		System.out.print(pd.get(3));
		
//		Product foundProduct = null;
//		for(Product product : pd) {
//			if(product.getName() == "메로나") {
//				foundProduct = product;
//			}
//		}
//		foundProduct.setPrice(100000);
//		pd.set(pd.indexOf(foundProduct), foundProduct);
//		System.out.println(pd);
		
//		상품 재고가 100개 이하인 상품을 삭제
//		for(int i=0; i<pd.size(); i++) {
//			if(pd.get(i).getStock() < 100) {
//				pd.remove(i);
//			}
//		}	
//		for(Product product : pd) {
//			if(product.getStock() < 100) {
//				pd.remove(pd.indexOf(product));
//			}
//		}	
//		System.out.println(pd);
		
//		4. 상품 이름이 마우스인 상품 삭제
		for(int i=0; i<pd.size(); i++) {
			if(pd.get(i).getName() == "메로나") {
				pd.remove(i);
			}
		}
//		for(Product product: pd) {
//			if(product.getName().equals("메로나")) {
//				pd.remove(product);
//			}
//		}
		System.out.println(pd);
	}
}
