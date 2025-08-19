package operaterTest;
import java.util.Scanner;

public class OperTask2 {
	public static void main(String[] args) {
//		3개의 입력값 중 중간값 찾기
//		17 25 35
//		10 3 8
//		sc.next();
//		sc.nextint();
//		입력예시 : 10 3 8
//		출력예시 : 중값값 8
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, max, mid, min = 0;
		
		System.out.println("정수 3개를 입력하세요\n예시) 17 35 34");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
		
		max = num1;
		max = max>num2 ? max : num2;
		max = max>num1 ? max : num1;
		
		min = num1;
		min = min<num1 ? min : num2;
		min = min<num1 ? min : num1;
		
		mid = num1!=max ? (num1!=min ? num1 : 0) : 0; 
		mid = num2!=max ? (num1!=min ? num1 : 0) : 0; 
		mid = num3!=max ? (num1!=min ? num1 : 0) : 0; 
		
		System.out.printf("중간값 : %d", mid);
	}
}
