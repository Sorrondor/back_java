package collection.arrayList;

import java.util.ArrayList;

public class ArrayListTask2 {

	public static void main(String[] args) {
//		a~z까지 문자열로 ArrayList로 추가하기
		ArrayList<String> datas = new ArrayList<String>();
		
		for(int i=65; i<91; i++) {
			datas.add(String.valueOf((char)(i+32)));
		}
		System.out.println(datas);
	}
}
