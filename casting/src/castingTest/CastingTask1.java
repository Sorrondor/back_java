package castingTest;

//poketmon
//Pikachu
//Kobugi
//Eve
//Kiratina
class Pikachu {
	String name;
	int age;
	String hobby;
	
	public Pikachu() {;}
	public Pikachu(String name, int age, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void eat() { 
		
	}
	void play() {
		
	}
	void sleep() {
		
	}
}
public class CastingTask1 {
	public static void main(String[] args) {
		new Pikachu().play();
	}
}
