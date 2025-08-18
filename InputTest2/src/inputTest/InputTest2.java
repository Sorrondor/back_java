package inputTest;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
//      3개의 정수를 한 번에 입력 받은 후
//      세 정수의 곱셈을 출력
//      sc.next()만 사용
		Scanner sc = new Scanner(System.in);
		String str1, str2, str3, print = null;
		int num1, num2, num3, ans = 0;
		
		System.out.println("정수 세 개를 입력 \nEx)3 5 10");
		str1 = sc.next();
		str2 = sc.next();
		str3 = sc.next();
		
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		num3 = Integer.parseInt(str3);
		
		ans = num1 * num2 * num3;
		print = "세 수의 곱은 %d입니다.";
		
		System.out.printf(print, ans);
	}
}
