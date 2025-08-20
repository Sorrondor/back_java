package arrayTest;

public class ArrayTest1 {
	public static void main(String[] args) {
	      int[] arData = new int[100]; // 저장공간 = 저장공간
	      int result = 0; // 저장공간 = 값
	      for(int i = 0; i < arData.length/*값*/; i++) {
	         arData[i] = i + 1; // 저장공간 = 값
	      }
	      
	      for(int i = 0; i < arData.length/*값*/; i++) {
	         if(i % 2 != 0) {
	            result += i; // 저장공간 += 값
	         }
	      }
	}
}// 저장공간 : 6개, 값 : 4개
