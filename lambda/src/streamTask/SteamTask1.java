package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SteamTask1 {
//  요구사항
//  모두 stream문법으로 사용한다.
//	for문, while문, if문 불가
	public static void main(String[] args) {
		
//  1. 1~10까지 ArrayList에 담고 출력
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 10).forEach((n) -> ar1.add(n));
		ar1.forEach(System.out::print);
		System.out.println();
		
//  2. ABCDEF를 각각 문자별로 출력
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
		ar2.forEach(System.out::print);
		System.out.println();
		
//  3. 1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> ar3 = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter((n) -> n%2==1).forEach((n) -> ar3.add(n));
		ar3.forEach((n) -> System.out.print(n + ","));
		System.out.println();
		
//  4. A~F까지 중 D를 제외하고 ArrayList에 담고 출력
		ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
		ar2.stream().filter((n) -> n != "D").forEach(System.out::print);
		System.out.println();
		
//  5. 5개의 문자열을 모두 소문자로 변경 후 출력
//  "Black", "WHITE", "reD", "yeLLow", "PInk"
		ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PInk"));
		ar5.stream().map((n) -> n.toLowerCase().forEach((n) -> System.out.print(n + ","));
		System.out.println();
		
//  6. "Apple", "banana", "Melon", "orange" 중 앞글자가 대문자인 문자열만 출력
		ArrayList<String> ar6 = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon", "orange"));
		ar6.stream().filter((n) -> n.charAt(0)>=65 && n.charAt(0)<=91).forEach((n) -> System.out.print(n + ","));
		System.out.println();
		
//  7. 한글을 정수로 변경 "공칠이삼" -> 0723
		ArrayList<String> ar7 = new ArrayList<String>(Arrays.asList("공", "칠", "이", "삼"));
		ar7.stream().map((n) -> "0").forEach(System.out::print);
		System.out.println();
		
//  8. 정수를 한글로 변경 0723 -> "공칠이삼"
		ArrayList<String> ar8 = new ArrayList<String>(Arrays.asList("0", "7", "2", "3"));
		ar8.stream().map((n) -> "공").forEach(System.out::print);
		System.out.println();
		
		
	}
}
