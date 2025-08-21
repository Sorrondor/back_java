package arrayTest;
import java.util.Scanner;

public class ArrayTest2 {
	public static void main(String[] args) {
//      1. 사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
//      입력 예)안녕hI!!
////      출력 예)안녕Hi!!
//		Scanner sc = new Scanner(System.in);
//		String str1 = "";
//		char[] character1 = null;
//		
//		System.out.println("입력 예)안녕hI!!");
//		str1 = sc.next();
//		character1 = new char[str1.length()];
//		for(int i=0; i<str1.length(); i++) {
//			character1[i] = str1.charAt(i);
//			if((int)character1[i] >= 65 && (int)character1[i] <= 91) {
//				character1[i] += 32;
//			}else if((int)character1[i] >= 97 && (int)character1[i] <= 123) {
//				character1[i] = (char) (character1[i] - 32);
//			}
//			System.out.print(character1[i]);
//		}
//      
//      2. 정수를 한글로 변경
//      입력 예) 1024
//      출력 예) 일공이사
//      출력 예)안녕Hi!!
		Scanner sc = new Scanner(System.in);
		String input2 = null, message2 = "정수를 입력하세요.\nex)1024",
		            result2 = "", hangle = "공일이삼사오육칠팔구";
		      System.out.println(message2);
		      input2 = sc.nextLine();
		      
		      for(int i = 0; i < input2.length(); i++) {
		         result2 += hangle.charAt(input2.charAt(i) - 48);
		      }
		      System.out.println(result2);
	}
}
