package streamTest.mapTest;

import java.util.ArrayList;
import java.util.Arrays;

public class MapTest1 {
	
	public String addRoot(String url) {
		return "/app" + url;
	}
	
//	아래 4개의 URL을 List에 담은 후 모든 경로 앞에 /app을 붙여서 출력하기
//	/news, /game, /brand, /rank
	public static void main(String[] args) {
		MapTest1 mt = new MapTest1();
		
		ArrayList<String> data1 
		= new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		
		data1.stream().map(mt::addRoot).forEach(System.out::println);
		
	}
}
