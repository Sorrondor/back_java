package controlStatement;
import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
//		계절을 맞추는 프로그램
//		겨울 12 1 2
//		봄 3 4 5
//		여름 6 7 8
//		가을 9 10 11
//		
//		입력) 10
//		출력) 10월은 가을입니다
		Scanner sc = new Scanner(System.in);
		String str1 = "";


		
		System.out.println("1~12의 자연수를 입력하세요");
		str1 = sc.next();
		switch(str1) {
		case "12", "1", "2":
			System.out.printf("%s월은 겨울입니다.", str1);
			break;
		case "3", "4", "5":
			System.out.printf("%s월은 봄입니다.", str1);
			break;
		case "6", "7", "8":
			System.out.printf("%s월은 여름입니다.", str1);
			break;
		case "9", "10", "11":
			System.out.printf("%s월은 가을입니다.", str1);
			break;
		default:
			System.out.println("1부터 12사이의 자연수를 입력하세요.");		
		}
	}
}
