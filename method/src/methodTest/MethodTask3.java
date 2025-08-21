package methodTest;
import java.util.Scanner;

public class MethodTask3 {
//	1~n까지 출력해주는 함수
	void method1(int n) {
		for(int i=0; i<n; i++) {
			System.out.print(i+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask3 mt = new MethodTask3();
		int n = 0;
		
		System.out.println("정수를 입력하세요 : ");
		n = sc.nextInt();
		mt.method1(n);
	}
}
