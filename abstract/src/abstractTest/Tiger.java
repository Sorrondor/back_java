package abstractTest;

public class Tiger extends PetAdapter{
	@Override
	public void bark() {
		System.out.println("짖어");
	}
	@Override
	public void sleep() {		
		System.out.println("잠들어");
	}
	@Override
	public void sit() {
		System.out.println("앉아");
	}
}
