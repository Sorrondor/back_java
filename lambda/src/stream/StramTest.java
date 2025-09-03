package stream;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StramTest {
	public static void main(String[] args) {
//		0~9
		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream
//		.range(시작, 끝):마지막을 포함하지 않는다.
//		.rangClosed(시작, 끝):마지막을 포함한다.
		IntStream.rangeClosed(0, 10).forEach((n) -> {
			datas.add(n);
		});
		datas.stream().filter(n -> n%2!=0).forEach(System.out::print);
		
//		.stream():컬렉션을 Stream 객체로 변경
//		.chars():문자열을 Stream 객체로 변경
		"ABCD".chars().forEach((c) -> {
			System.out.print((char)c);
		});
		
		
		
		
		
		
////		1~5까지 스트림 문법으로 출력하기
//		IntStream.range(0, 5).forEach((n) -> {
//			datas.add(n);
//		});
//		System.out.println(datas);
//		
////		참조형 문법
////		.(소속::메서드명)
//		IntStream.rangeClosed(1, 5).forEach(System.out::println);

//		datas 짝수만 출력하기
//		IntStream.rangeClosed(0, 10).forEach((n) -> {
//			datas.add(n);
//		});
//		System.out.println(datas);
	}
}
