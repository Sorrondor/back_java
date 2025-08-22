package methodTest;
//문자열을 입력받고 원하는 문자의 개수를 구해주는 메서드

import java.util.Scanner;

public class MethodTest6 {
//	메서드를 정의한다.
//	문자열과 문자형을 입력받는다.
//	문자열에 있는 문자형의 개수를 저장할 변수를 선언한다.
//	반복문을 통해 문자열을 순회하며 문자형의 개수를 찾고, 변수에 저장한다.
//	저장한 변수를 출력한다.
	
//	스캐너와 메소드의 클래스를 정의한다.
//	문자열과 문자형을 입력받는다.
//	메소드를 호출한다.
	void method1(String str1, char ch1) {
		int num1 = 0;
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) == ch1) {
				num1++;
			}
		}
		System.out.printf("-> 문자열에서 원하는 문자의 개수는 %d개 입니다.", num1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest6 mt = new MethodTest6();
		String str1 = "", str2 = "";
		char ch1 = ' ';
		
		
		System.out.print("문자열을 입력하세요:");
		str1 = sc.next();
		System.out.print("문자열에서 찾길 원하는 문자를 입력하세요:");
		str2 = sc.next();
		ch1 = str2.charAt(0);
		mt.method1(str1, ch1);
		
		
		
		
	}
}
