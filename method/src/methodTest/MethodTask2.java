package methodTest;
import java.util.Scanner;

//1. 이름을 10번 출력해주는 메서드
//2. 1번 메서드 사용
public class MethodTask2 {
	void method1(String name) {
		for(int i=0; i<10; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask2 mt = new MethodTask2();
		String name = "";
		
		System.out.println("이름을 입력하세요 :");
		name = sc.next();
		mt.method1(name);
	}
}
