package classTest;

import java.util.Scanner;

//1. 2개의 값을 전달하면 최솟값과 최댓값을 구해주는 메서드
//2. 클래스로 리턴
//3. 메인 메서드에서 메서드 사용

class  CalcMinMax{
	int num1;
	int num2;
	int max;
	int min;
	
	public CalcMinMax() {;}
	public CalcMinMax(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	void method1(int num1, int num2) {
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		System.out.printf("두 수 중에서 최대값은 %d, 최소값은 %d입니다.", max, min);
	}
}
public class ClassTask3 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		CalcMinMax cmm = new CalcMinMax();
		
		System.out.println("정수 2개를 입력하세요:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		cmm.method1(num1,num2);
	}
}
