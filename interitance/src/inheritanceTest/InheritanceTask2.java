package inheritanceTest;
//PersonTask
//이름, 나이, 주소, 핸드폰
//각 메서드 출력
//work 일을 한다
//sleep 잠을 잔다
//eat 세 끼를 먹는다
//
class PersonTask {
	String name;
	String address;
	String phone;
	int age;

	public PersonTask() {;}
	public PersonTask(String name, String address, String phone, int age) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
	}
	void work() {
		System.out.println("일을 한다");
	}
	void sleep() {
		System.out.println("잠을 잔다");
	}
	void eat() {
		System.out.println("세 끼를 먹는다");
	}
}
//StudentTask
//인스타아이디
//각 메서드 출력
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다
//
class StudentTask extends PersonTask {
	String instargramID;
	
	public StudentTask() {;}
	public StudentTask(String instargramID) {
		super();
		this.instargramID = instargramID;
	}
	@Override
	void work() {
		System.out.println("아르바이트를 한다");
	}
	@Override
	void sleep() {
		System.out.println("수업시간에 잠을 잔다");
	}
	@Override
	void eat() {
	System.out.println("아침을 거른다");
	}
}
//EmployeeTask
//비상금
//각 메서드 출력
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다
//
class EmployeeTask extends PersonTask {
	int Emoney;
	
	@Override
	void work() {
		System.out.println("하루 종일 일을 한다");
	}
	@Override
	void sleep() {
		System.out.println("잠을 설친다");
	}
	@Override
	void eat() {
		System.out.println("야식을 먹는다");
	}
}
//InhertanceTask에서
//사람, 학생, 직장인 객체화 후 각 메서드 출력하기
public class InheritanceTask2 {
	public static void main(String[] args) {
		PersonTask pt = new PersonTask();
		StudentTask st = new StudentTask();
		EmployeeTask et = new EmployeeTask();
		
		pt.work();
		pt.sleep();
		pt.eat();
		System.out.println("--------");
		
		st.work();
		st.sleep();
		st.eat();
		System.out.println("--------");
		
		et.work();
		et.sleep();
		et.eat();
		System.out.println("--------");
	}
}
