package collectionTest.hashMapList2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//HashMap 자료구조 변경 실습
//"street": "Victor Plains",
//"suite": "Suite 879",
//"city": "Wisokyburgh",
//"zipcode": "90566-7771",
//"lat": "-43.9509",
//"lng": "-34.4618"

public class HashMapTask1 {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<String, Object>();
		userMap.put("street", "Victor Plains");
		userMap.put("suite", "Suite 879");
		userMap.put("city", "Wisokyburgh");
		userMap.put("zipcode", "90566-7771");
		userMap.put("lat", "-43.9509");
		userMap.put("lng", "-34.4618");
//		System.out.println(userMap);
		System.out.println(userMap.values());
		System.out.println(new ArrayList(userMap.values()));
		
		Set<Entry<String, Object>> userSet = userMap.entrySet();
//		System.out.println(userSet);
		Iterator<Entry<String, Object>> userIter = userSet.iterator();
//		System.out.println(userIter);
		
		
		while(userIter.hasNext()) {
			Entry<String, Object> userEntry = userIter.next();
//			System.out.println("Entry["+userEntry.getKey()+":"+userEntry.getValue()+"]");
		}
		
//		키 밸류를 갖는 형태인 맵을 셋으로 바꾸기 위해 .entrySet 메서드를 사용한다.
//		셋을 순서대로 참조하기 위해 .iterator()메서드를 사용한다.
//		순서대로 정렬된 이터레이터의 엔트리에 접근하기 위해 .next() 메서드를 사용한다.
//		엔트리의 키와 밸류에 접근하기 위해 .getKey()와 .getValue()를 사용한다.
		
	}
}
