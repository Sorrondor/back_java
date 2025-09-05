package streamTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//		1) ArrayList에 있는 모든 값을 더한 후 출력 (10, 20, 30, 40, 50, 60)
		Integer ans = 0;
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60));
		for(Integer n: ar1) {
			ans += n;
		}
		System.out.println(ans);
		
		
	}
}
