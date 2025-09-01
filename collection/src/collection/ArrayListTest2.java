package collection;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
//		실습
//		추가(삽입)
//		50뒤에 500을 삽입
//		수정
//		90을 9로 수정
//		삭제
//		80을 삭제
		
		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		datas.add(10);
		datas.add(20);
		datas.add(30);
		datas.add(40);
		datas.add(50);
		
		datas.add(500);
		datas.set(90, 9);
		datas.remove(80);
		
		System.out.println(datas.size());
		System.out.println(datas);
		
		try {
			datas.get(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ArrayList2 예외 발생");
			System.out.println("인덱스 범위 다시 작성할 것");
		} catch (Exception e) {
			e.printStackTrace();
		}

	
	}
}
