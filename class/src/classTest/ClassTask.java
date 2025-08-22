package classTest;

//동물(ClassTask)
//이름(name), 나이(age), 먹이(feed)
//추상화
//기본 생성자, 초기화 생성자
//토끼, 강아지, 고양이 객체(객체화)
public class ClassTask {
	String name;
	String feed;
	int age;
	
	public ClassTask() {;}
	public ClassTask(String name, String feed, int age) {
	  this.name = feed;
      this.name = name;
      this.age = age;
   }
	
	public static void main(String[] args) {
		ClassTask ct1 = new ClassTask("토끼", "잡식", 3);
	}
	
}
