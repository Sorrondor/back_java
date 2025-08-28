package marker;

public class MarkerTest {

//	어떤 동물이 어떤 분류인지 알려주는 메서드
//	1. 초식동물이라면 초식동물
//	2. 육식동물이라면 육식동물
//	3. 아니라면 잡식동물
	public void checkKinds(Animal am) {
		if(am instanceof HerviboreMarker) {
			System.out.println("초식동물입니다.");
		}else if(am instanceof CarnivoreMarker){
			System.out.println("육식동물입니다.");			
		}else {
			System.out.println("잡식동물입니다.");						
		}
	}
//	메서드 완성 후 각 동물들을 객체화 시킨 후 메서드 확인 출력
	public static void main(String[] args) {
		MarkerTest mt = new MarkerTest();
		Animal dg = new Dog();
		Animal cw = new Cow();
		Animal ct = new Cat();
		
		mt.checkKinds(dg);
		mt.checkKinds(cw);
		mt.checkKinds(ct);
	}
}
