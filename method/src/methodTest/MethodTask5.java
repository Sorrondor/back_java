package methodTest;
import java.util.Scanner;

public class MethodTask5 {
//1. 1~n까지의 합을 구해서 결과를 반환해주는 메서드
//2. 어떤 값을 전달하면 홀수인지, 짝수인지, 문자열인지 확인한 결과를 반환해주는 메서드
//3. 문자열을 입력하면 모두 대문자로 바꿔서 출력해주는 메서드
//4. 어떤 문자열을 전달하면 반대로 출력해주는 메서드
//입력 예시) abcdef
//출력 예시) fedcba
//
//5. 1~4까지 메서드 사용
	int method1(int n) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += (i+1);
		}
		return sum; 
	}
	String method2(String str1) {
		int qus = str1.charAt(0);
		if((qus == 49) || (qus == 51) || (qus == 53) || (qus == 55) || (qus == 57)) {
			return "홀수";
		}else if((qus == 48) ||  (qus == 50) || (qus == 52) || (qus == 54) || (qus == 56)) {
			return "짝수";
		}else {
			return "문자열";
		}
		
		
	}
	void method3(String str2) {
		System.out.print("-> 출력값은 ");
		for(int i=0; i<str2.length(); i++) {
			int a = 0;
			if((int)str2.charAt(i)>=97 && (int)str2.charAt(i)<=123) {
				a= (int)str2.charAt(i) - 32;				
			}
			System.out.print((char)a);
		}
		System.out.println("입니다.\n");
	}
	void method4(String str2) {
		System.out.print("-> 출력값은 ");
		for(int i=0; i<str2.length(); i++) {
			char a = ' ';
			a= str2.charAt(str2.length()- (i+1));				
			System.out.print(a);
		}
		System.out.println("입니다.");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTask5 mt = new MethodTask5();
		String str0 = "", str1 = "", str2 = "";
		int num1 = 0;
		
		System.out.print("1. 정수를 입력하세요:");
		num1 = sc.nextInt();
		System.out.printf("-> 반환값은 %d입니다.\n\n", mt.method1(num1));
		
		System.out.print("2. 글자 하나를 입력하세요:");
		str0 = sc.next();
		System.out.printf("-> 반환값은 %s입니다.\n\n", mt.method2(str0));
		
		System.out.print("3. 문자열을 입력하세요:");
		str1 = sc.next();
		mt.method3(str1);
		
		System.out.print("4. 문자열을 입력하세요:");
		str2 = sc.next();
		mt.method4(str2);
	}
}
