package castingTest;

public class CastingTest {
	public static void main(String[] args) {
//		자동 형변환
//		정수 + 실수 = 실수
		System.out.println(1 + 2.5);

//		정수 + 정수 = 정수
		System.out.println(5 + 3);
		
//		정수 / 정수 = 정수
		System.out.println(5 / 2);
		System.out.println(5.0 / 2);
		
//		강제 형변환
		System.out.println(5 / (double)2);
		System.out.println((int)(5 / (double)2));
		

		
	}
}
