package castingTest2;

//캐릭터 클래스
//사냥 메서드

//오크 클래스 - 도끼
//콜록콜록!
//요정 클래스 - 팬던트
//흐규흐규
//휴먼 클래스 - 골드
//해치웠나..!
class Character {
	void hunted() {
		System.out.print("아이템을 획득했습니다.\n");
	}
	void killEnemy(Enemy em) {
		em.scream();
	}
	
}
public class CastingTask2 {
	public static void main(String[] args) {
//		업캐스팅
		Character ch = new Character();
		Character uOak1 = new Oak();
		Character uElf1 = new Elf();
		Character uHuman1 = new Human();
		Enemy em = new Enemy();
		
		uOak1.hunted();
		uElf1.hunted();
		uHuman1.hunted();
		
		System.out.print("-------------\n");
//		다운캐스팅
		
		Oak dOak1 = (Oak)uOak1;
		Elf dElf1 = (Elf)uElf1;
		Human dHuman1 = (Human)uHuman1;
		
		ch.killEnemy(em);
		dOak1.line();
		ch.killEnemy(em);
		dElf1.line();
		ch.killEnemy(em);
		dHuman1.line();
	}
}