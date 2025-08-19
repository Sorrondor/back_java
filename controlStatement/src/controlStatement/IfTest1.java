package controlStatement;
import java.util.Scanner;

public class IfTest1 {
	public static void main(String[] args) {
//		  두 수의 크기 비교
//	      입력예시) 10 20
//	      출력예시) 큰 값: 20, 작은 값: 10
//	      if문으로
		Scanner sc = new Scanner(System.in);
		String message1 = "두 정수를 입력하세요\n예시)10 4",
			   message2 = "큰 값: %d, 작은 값: %d",
		       message3 = "두 수의 값이 %d로 같습니다";
		int num1 = 0, num2 = 0;
		
		System.out.println(message1);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.printf(message3, num1);
		}else if(num1 > num2){
			System.out.printf(message2, num1, num2);
		}else{
			System.out.printf(message2, num2, num1);
		}
		
		
	}
}
