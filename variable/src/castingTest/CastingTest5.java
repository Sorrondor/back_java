package castingTest;

public class CastingTest5 {
   public static void main(String[] args) {
//      String.valueOf(값);
//      어떤 값을 문자열로 형변환시켜주는 메서드
      
      char a = 'a', j = 'j', k = 'k';
//      모두 대문자로 바꿔서 출력
//      아스키코드
//      'A', 'J', 'K'
      
      int x = (int)a-32, y= (int)j-32, z=(int)k-32; 
      char A = (char)x, J = (char)y, K = (char)z;
      
      System.out.printf("%c, %c, %c \n", A, J ,K);
      
//      int atoA = Character.valueOf(a) + 10, jtoJ = Character.valueOf(j) + 10, ktoK = Character.valueOf(k) + 10;
//      char A = char(atoA), J = char(jtoJ), K = char(ktoK);
   }
}