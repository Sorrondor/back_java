package streamTask2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask3 {
	public static void main(String[] args) {
//		IntStream으로 시작
//		10, 30, 50, 70, 90만 ArrayList, List에 추가하기
		ArrayList<Integer> ans1 = IntStream	//IntStream
				.range(0, 5) // IntStream
				.map(n -> 10 + n*20) // IntStream
				.mapToObj(Integer::valueOf) // Stream<Integer>
				.collect(Collectors.toCollection(ArrayList::new)); // ArrayList<Integer>
		System.out.println(ans1);

		List<Integer> ans2 = IntStream // IntStream
				.range(0, 5) // IntStream
				.map(n -> 10 + n*20) // IntStream
				.mapToObj(Integer::valueOf) // Stream<Integer>
				.collect(Collectors.toList()); // List<Integer>
		System.out.println(ans2);
	}
}
