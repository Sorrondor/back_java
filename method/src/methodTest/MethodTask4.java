package methodTest;
import java.util.Scanner;

public class MethodTask4 {
	
//사용자에게 이름과 반복횟수를 받아서 반복횟수만큼 이름을 출력해주는 메서드
//1번 메소드 사용
	void method1(String name, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask4 mt = new MethodTask4();
		String name = "";
		int n = 0;
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		System.out.println("반복횟수를 입력하세요");
		n = sc.nextInt();
		mt.method1(name, n);
		
				
	}
}
