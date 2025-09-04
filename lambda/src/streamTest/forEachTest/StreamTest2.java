package streamTest.forEachTest;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
//		0~10까지 추가
		ArrayList<Integer> data1 = new ArrayList<Integer>();		
		IntStream.rangeClosed(0, 10).forEach(n -> {data1.add(n);});
//		data1의 0~5까지 삭제
		IntStream.rangeClosed(0, 5).forEach(n -> {data1.remove(Integer.valueOf(n));});		
//		System.out.println(data1);
		
//		10~0까지 추가
		ArrayList<Integer> data2 = new ArrayList<Integer>();
		IntStream.rangeClosed(0, 10).forEach(n -> {data2.add(10-n);});
//		System.out.println(data2);
		
//		"ABCDEFGHIJK" 추가
		ArrayList<String> data3 = new ArrayList<String>();
		"ABCDEFGHIJK".chars().forEach((n) -> {data3.add(String.valueOf((char)n));});
//		System.out.println(data3);
//		data3.forEach(System.out::print);
		
//	    "aBcDeFgHiJk"을 datas4에 소문자만 각각 한 글자씩 추가 후 출력하기
	    ArrayList<String> data4 = new ArrayList<String>();
	    "aBcDeFgHiJk".chars().forEach((n) -> {
	    	if(n>=97 && n<=122) {
	    		data4.add(String.valueOf((char)n));	    		
	    	}
	    });
//		data4.forEach(System.out::print);
	    
//	    "aBcDeFgHiJk"를 모두 대문자로 변경하여 추가 후 출력하기
	    ArrayList<String> data5 = new ArrayList<String>();
	    "aBcDeFgHiJk".chars().forEach((n) -> {
	    	if(n>=97 && n<=122) {
	    		data5.add(String.valueOf((char)(n-32)));	    		
	    	}else {
	    		data5.add(String.valueOf((char)n));	    			    		
	    	}
	    });
		data5.forEach(System.out::print);
	}
}
