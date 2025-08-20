package arrayTest;
import java.util.Scanner;

public class ArrayTask1 {
	public static void main(String[] args) {
//      브론즈
//		int[] arr1 = new int[5];
//		int index = 0;
//
//		for (int i=10; i>=1; i--) {
//		    if (i%2 == 0) {
//		        arr1[index] = i;
//		        index++;
//		    }
//		}
//
//		for (int i=0; i<arr1.length; i++) {
//		    System.out.print(arr1[i]);
//		}

//      1~10까지 배열에 담고 출력
//		int[] arr2 = new int[10];
//		
//		for(int i=0; i<10; i++) {
//			arr2[i] = i+1;
//			System.out.println(arr2[i]);
//		}
//      1~100까지 배열에 담은 후 홀수만 출력
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arr3 = new int[100];
//		int ans1 = 0;
//		for(int i=0; i<100; i++) {
//			arr3[i] = i;
//			if(arr3[i]%2 == 0) {
//				ans1 += arr3[i];
//			}
//		}
//		System.out.print(ans1);
		
//      A~F까지 배열에 담고 출력
//		char[] arr4 = new char[6];
//		for(int i=0; i<6; i++) {
//			arr4[i] = (char)(65 + i);
//			System.out.print(arr4[i]);
//		}
//      A~F까지 중 C제외하고 배열에 담은 후 출력
//		char[] arr4 = new char[6];
//		for(int i=0; i<6; i++) {
//			if(i == 2) { continue; }
//			arr4[i] = (char)(65 + i);
//			System.out.print(arr4[i]);
//		}
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		Scanner sc = new Scanner(System.in);
//		int[] arr5 = new int[5];
//		int max = 0, min = 100;
//		System.out.println("정수 5개를 입력하세요");
//		for(int i=0; i<5; i++) {
//			arr5[i] = sc.nextInt();
//			
//			max = max < arr5[i] ? arr5[i] : max;
//			min = min > arr5[i] ? arr5[i] : min;			
//		}
//		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		double avg =0;
		System.out.println("배열의 크기를 입력하세요 : ");
		num1 = sc.nextInt();
		int[] arr6 = new int[num1];
		
		System.out.println("입력한 숫자만큼 정수를 입력하세요");
		for(int i=0; i<num1; i++) {
			arr6[i] = sc.nextInt();
			avg += arr6[i];
		}
		avg = (double)(avg / num1);
		System.out.printf("입력한 정수의 평균은 %.2f입니다.", avg);
	}
}
