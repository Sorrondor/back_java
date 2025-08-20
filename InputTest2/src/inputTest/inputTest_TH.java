package inputTest;

//char a='a', b='b'일 때
//대문자와 a+b 의 값을 (정수)로 출력
public class inputTest_TH {
	public static void main(String[] args) {
		char a = ' ', b = ' ';
		char A = ' ', B = ' ';
		int numa, numb, sum = 0;
		String print1, print2 = "";
		
		a = 'a';
		b = 'b';
		A = Character.toUpperCase(a); // 'A'
		B = Character.toUpperCase(b); // 'B'
		print1 = "첫 번째 문제 답 => A, B";
		
		System.out.println(print1);
		
		numa = (int)a;
		numb = (int)b;
		sum = numa + numb;
		print2 = "두 번째 문제 답 => %d";
				
		System.out.printf(print2, sum);
	}
}
