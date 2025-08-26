package castingTest2;

class Human extends Character{
	String item= "골드";

	@Override
	void hunted() {
		super.hunted();
		System.out.printf("[%s]을 획득했습니다.\n", item);
	}
	void line() {
		System.out.print("인간:해치웠나!!\n");
	}
}