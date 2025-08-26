package castingTest2;

class Elf extends Character{
	String item= "석궁";
	
	@Override
	void hunted() {
		super.hunted();
		System.out.printf("[%s]을 획득했습니다.\n", item);
	}
	void line() {
		System.out.print("엘프:흐규흐규!!\n");
	}
}