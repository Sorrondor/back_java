package streamTest.mapTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapTest {
   public static void main(String[] args) {
      
      ArrayList<User> users = new ArrayList<User>(); 
      
      User user1 = new User(1L, "홍길동", 17, "개발자");
      User user2 = new User(1L, "장보고", 20, "기획자");
      User user3 = new User(1L, "이순신", 35, "디자이너");
      User user4 = new User(1L, "이성계", 42, "개발자");
      User user5 = new User(1L, "이태희", 22, "사장");
      
      users.add(user1);
      users.add(user2);
      users.add(user3);
      users.add(user4);
      users.add(user5);
      
//      System.out.println(users);
      
//      ["홍길동", "장보고" ..]
//      users.stream().map((user) -> user.getName()).forEach((name) -> System.out.println(name));
      
//      ArrayList를 생성한다. data1
//      1~10까지 data1에 추가한다
//      data1의 모든 값을 10배로 변경한다.
//      data1의 모든 값을 출력한다.
      ArrayList<Integer> data1 = new ArrayList<Integer>();
      IntStream.rangeClosed(1, 10).forEach(data1::add);
      data1.stream().map((n) -> n*10);
//      System.out.println(data1);
      
//      2. .map()
//      ArrayList의 값을 알파벳으로 바꾸기
      ArrayList<Integer> data2 = new ArrayList<Integer>();
      IntStream.rangeClosed(1, 10).forEach(data2::add);
      data2.stream().map((n) -> n+64).forEach((n) -> System.out.print((char)(int)n));
      
      
   }
}
