package collectionTest.hashMapList2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("id", "garlemy");
		userMap.put("password", "dream1207*");
		userMap.put("name", "김정수");
		userMap.put("age", 26);
		userMap.put("isRich", true);
		
		System.out.println(userMap);
		System.out.println(userMap.get("id"));
		System.out.println(userMap.entrySet());
		
		Iterator<Entry<String, Object>> userMapIter = userMap.entrySet().iterator();
		while(userMapIter.hasNext()) {
			Entry<String, Object> entry = userMapIter.next();
//			System.out.println(entry.getValue());
			System.out.println(entry.getKey());
		}
	}
}
