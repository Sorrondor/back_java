package classTest;
//필드
//회사의 돈(돈)
//이름(name), 나이(age), 수익(income)
//회사원들이 벌어온 수익을 모두 회사의 돈(돈)에 합치고,
//회사의 돈 출력
public class Employee {
	private static int incomeS;
	private String name;
	private int age;
	private int income;

	public Employee() {;}
	public Employee(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
	}
	
	public static void main(String[] args) {
		Employee em1 = new Employee("홍길동", 17, 1000);
		Employee em2 = new Employee("김길동", 17, 2000);
		Employee em3 = new Employee("이길동", 17, 3000);
		Employee em4 = new Employee("최길동", 17, 4000);
		
		Employee.incomeS = em1.income + em2.income + em3.income + em4.income;
		System.out.printf("회사의 총 수익은 %d입니다.", incomeS);
	}
}
