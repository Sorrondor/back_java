package inputTest;

import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
//		사용자에게 정수를 2개 받고.
//		두 수를 더해서 출력하기.
		Scanner sc = new Scanner(System.in);
		int num1, num2, ans = 0;
		String str1, str2 = null;
		
		System.out.println("정수 2개를 입력하세요.");
		str1 = sc.next();
		str2 = sc.next();
		
		num1 = Integer.parseInt(str1);
		num2 = Integer.parseInt(str2);
		ans = num1 + num2;
		System.out.printf("%d와 %d의 합은 %d입니다.", num1, num2, ans);
	}
}
