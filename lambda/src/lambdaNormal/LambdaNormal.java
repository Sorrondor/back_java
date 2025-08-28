package lambdaNormal;
import java.util.Scanner;

//11 17 15 24 10
//5개 숫자를 무작위로 전달해서 두 수를 더한 결과를 무조건 짝수로 만들어주는 메서드
public class LambdaNormal {
	public static void main(String[] args) {
		NormalInter ni = (int[] arr1) -> {
			int num1=0, num2=0, ans=0;
			
			for(int i=0; i<arr1.length; i++) {
				if(arr1[i]%2 == 0) {
					num1 = arr1[i];
					for(int j=0; j<arr1.length; j++) {
						if((i != j) && arr1[j]%2 == 0) {
							num2 = arr1[i];
						}
					}
				}
			}
			ans = num1 + num2;
				
			System.out.printf("짝수가 되는 두 정수의 합:%d", ans);
		};
		
		Scanner sc = new Scanner(System.in);
		int num1 =0, num2 =0, num3 =0, num4 =0, num5 =0;
		System.out.println("정수 5개를 입력하세요 \n예시)5 78 3 2 3");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();
	
		int[] arr = {num1, num2, num3, num4, num5};
		ni.getRandomEven(arr);
	}
}
