package randomTest;

import java.util.Arrays;
import java.util.Random;

// *로또 번호를 추첨하는 기능
// 1. 반복되는 코드를 반복문으로
// 2. 메서드로 생성
// 3. 6개를 배열로 리턴
// 4. 메인 메서드에서 사용

public class RandomTest {
	int[] method1() {
		Random random = new Random();
		int[] arr1 = new int[6];
		
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = random.nextInt(45)+1;
		}
		
		return arr1;
	}

   public static void main(String[] args) {
      Random random = new Random();
      RandomTest rt = new RandomTest();
      int[] print = rt.method1();
      for(int i=0; i<print.length; i++) {
    	  System.out.print(print[i] + " ");    	  
      }
   }
}
