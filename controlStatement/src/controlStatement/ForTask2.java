package controlStatement;

public class ForTask2 {
	public static void main(String[] args) {
//		10~1까지 출력
//		for(int i=0; i<10; i++) {
//			System.out.println(10 - i);
//		}
//		
//		for(int i=0; i<5; i++) {
//			System.out.println(i + "번째 홍길동");
//		}
//		
//		"abcd"를 이용해서 97 98 99 100을 출력하기
//		int c = "abcd".charAt(0);
//		for(int i=0; i<4; i++) {
//			if(i==2) { continue; }
//			System.out.println(c + i);				
//		}
//		1~~30까지 짝수를 출력
//		for(int i=0; i<=30; i++) {
//			if((i+1)%2 == 0) {
//				System.out.println(i+1);				
//			}
//		}
//		1~30까지 짝수의 개수 출력
//		int count = 0;
//		for(int i=0; i<=30; i++) {
//			if((i+1)%2 == 0) {
//				count++;
//			}
//		}
//		System.out.println(count);				
//		1~30까지 짝수의 총합 구하기
//		int count = 0;
//		for(int i=0; i<=30; i++) {
//			if((i+1)%2 == 0) {
//				count += (i+1);
//			}
//		}
//		System.out.println(count);	
//		1~30까지 짝수 중 7번째 숫자를 출력하기
//		int count = 0;
//		for(int i=0; i<=30; i++) {
//			if((i+1)%2 == 0) {
//				count++;
//				if(count == 7) {
//					S
//					break;ystem.out.println(i+1);	
//				}
//			}
//		}
//		1~30까지 짝수 중 첫 번째 짝수와 마지막 짝수만 더해서 출력하기
		int count = 0, minNum = 100, maxNum =0;
		for(int i=0; i<=30; i++) {
			int value = i+1;
			
			if(value%2 == 0) {
				if(value<minNum) {
					minNum = value;
				}
				if(value>maxNum) {
					maxNum = value;
				}
			}
		}
		System.out.printf("minNum : %d, maxNum : %d", minNum, maxNum);
	
	}
}
