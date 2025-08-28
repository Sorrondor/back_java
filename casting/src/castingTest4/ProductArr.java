package castingTest4;

public class ProductArr {
//	변수 선언
	private Product[] pArr = new Product[5];

//	getter, setter
	public Product[] getpArr() {
		return pArr;
	}

	public void setpArr(Product[] pArr) {
		this.pArr = pArr;
	}
//	생성자
	public ProductArr() {;}
	public ProductArr(Product[] pArr) {
		this.pArr = pArr;
	}
//	메서드
	public void enrollP(Product pd) {
		for(int i=0; i<pArr.length; i++) {
			if(pArr[i] == null) {
				pArr[i] = pd;
				break;
			}
		}
	}
	
	

}
