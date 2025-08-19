package operaterTest;
import java.util.Scanner;
//      사용자가 입력한 값이 정수인지 실수인지 확인하여 결과를 출력하시오.
//      단 next() 사용
//      입력 결과) 1.1
//      출력 결과) 실수
public class OperTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String str1, ans = "";		
		double num1 = 0.0;
		
		System.out.println("숫자를 입력하세요");
		str1 = sc.next();
		num1 = Double.parseDouble(str1);
		ans = num1%1 == 0 ? "정수" : "실수";
		
		System.out.printf("%.1f는 %s입니다.", num1, ans);
	}
}
