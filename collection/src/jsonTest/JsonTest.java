package jsonTest;

import java.util.HashMap;

import org.json.JSONObject;

public class JsonTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("street", "Victor Plains");
		userMap.put("suite", "Suite 879");
		userMap.put("city", "Wisokyburgh");
		userMap.put("zipcode", "90566-7771");
		userMap.put("lat", "-43.9509");
		userMap.put("lng", "-34.4618");
		
		JSONObject usersJSON = new JSONObject(userMap);
		System.out.println(usersJSON);
		
//		반복문을 돈다
//		생성자를 이용해서 JSONObject 객체화(User 클래스)
//		JSONArray에 하나씩 put
		
//		for(int i=0; i<userMap.size(); i++) {
//			usersJSON.put("d", new JSONObject(userMap.get(i))); ??
//		}
//		System.out.println(usersJSON);
		
//		userMap.forEach(null);
		
//		users.stream().map((data) -> new JSONObject(data).forEach(json)) ???
		
	}
}
