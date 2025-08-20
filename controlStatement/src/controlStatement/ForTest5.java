package controlStatement;
import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		//1. ACEG...Z 출력!
//		String input = "ABCDEFGHIGKLMNOPQRSTUVWXWZ";
//		for(int i=0; i<input.length(); i++) {
//			System.out.print(i%2==0 ? (char)(65+i) : "");
//		}
		//2. 1 ~ N까지의 합 출력!
//		Scanner sc = new Scanner(System.in);
//		int input = 0, ans =0;
//		System.out.println("자연수를 입력하세요 :");
//		input = sc.nextInt();
//		for(int i=0; i<input; i++) {
//			ans += i+1;
//		}
//		System.out.printf("1부터 %d까지의 합 : %d", input, ans);
		//3. 0123401234 출력!
//		int count = 0;
//		for(int i=0; i<10; i++) {
//			if(i>4) {
//				count = i-5;
//			}
//			System.out.print(count);
//			count++;
//		}
		
		
		//4. 입력예시) a1b22c357
		//abbbbbbbbbbbbbbccccccccccccccccccccccccccccccccc
		//사용자가 입력한 횟수가 얼마가 있을지 모르고, 
		//입력한 횟수만큼 반복해주는 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		String input = "";
		System.out.println("입력예시) a1b22c357");
		input = sc.next();
		System.out.println(input);
	}
}
