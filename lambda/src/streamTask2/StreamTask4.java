package streamTask2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//홍길동, 축구_농구_야구, 나는 축구왕!
//이순신, 개발_당구_축구, 나는 개발자 좋아!
//장보고, 피아노, 피아노만 한 우물!
//김철수, 스포츠댄스_개발, 취미로 춤을 춘다 ~
//김영희, 골프_야구, 운동 선수는 나의 꿈
//흰둥이, 개발_축구_농구, 개발도 운동도 다 잘해요!
public class StreamTask4 {
	public int isContains(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='_') {
				count++;
			}		
		}
		return count;
	}
	public static void main(String[] args) {
		StreamTask4 st4 = new StreamTask4();
		ArrayList<Member> members = new ArrayList<Member>();
		
		Member member1 = new Member("홍길동", "축구_농구_야구", "나는 축구왕");
		Member member2 = new Member("이순신", "개발_당구_축구", "나는 개발자 좋아!");
		Member member3 = new Member("장보고", "피아노", "피아노만 한 우물!");
		Member member4 = new Member("김철수", "스포츠댄스_개발", "취미로 춤을 춘다 ~");
		Member member5 = new Member("김영희", "골프_야구", "운동 선수는 나의 꿈");
		Member member6 = new Member("흰둥이", "개발_축구_농구", "개발도 운동도 다 잘해요!");
		
		Member[] arr1 = new Member[] {member1, member2, member3, member4, member5, member6};
		members.addAll(Arrays.asList(arr1));
//		for(Member member:arr1) {
//			members.add(member);
//		}
		
//		1) 각 멤버의 취미를 검토하시오.
//		취미 중 개발을 좋아하는 취리를 가진 멤버의 데이터를 모두 출력하시오.
//		members.stream().filter((n) -> n.getHobby().contains("개발")).forEach(System.out::println);
		
//		2) 각 Member의 취미를 검토하시오
//		취미 중 개발을 좋아하는 취미를 가진 멤버의 데이터를
//		개발자 ooo(이름)으로 변경 후 출력하시오
//		members
//		.stream()
//		.filter((n) -> n.getHobby().contains("개발"))
//		.map((n) -> "개발자 " + n.getName())
//		.forEach(System.out::println);;
		
//		3) 취미가 3개 이상 가진 사람의 id를 출력
//		members
//		.stream()
//		.filter((n) -> st4.isContains(n.getHobby()) >= 2)
//		.forEach(System.out::println);
		
//		4) 취미를 3개 이상 가진 사람의 id를 ArrayList로 변경하고 hobbyIds 변수 담기
//		hobbyId를 출력
		ArrayList hobbyIds = 
		members
		.stream()
		.filter((n) -> st4.isContains(n.getHobby()) >= 2)
		.map((n) -> n.getId()).collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(hobbyIds);
		
//		!! 5) hobbyIds에 존재하는 id와 같은 id를 가진 members의 데이터 소개를 출력하기		
//		members.stream().filter(n -> hobbyIds.contains(n.getId())).forEach(System.out::print);
		
//		6) 소개를 가장 길게 쓴 사용자의 정보를 문자열로 출력하기
//		출력 예시)
//			이름:흰둥이
//			취미:개발_축구_농구
//			소개:개발도 운동도 다 잘해요!
		int maxlength = members.stream()
				.map(n -> n.getIntroduction().length())
				.reduce(0, (a,b) -> a>b?a:b);
		
		members.stream()
			.filter(n -> n.getIntroduction().length() == maxlength)
			.forEach(n -> System.out.print("이름:"+n.getName()+"\n취미:"+n.getHobby()+"\n소개:"+n.getIntroduction()));

		

	}
}
