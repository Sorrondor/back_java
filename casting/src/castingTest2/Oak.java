package castingTest2;

class Oak extends Character{
	String item= "도끼";
	
	@Override
	void hunted() {
		super.hunted();
		System.out.printf("[%s]을 획득했습니다.\n", item);
	}
	void line() {
		System.out.print("오크:콜록콜록!!\n");
	}
}