package variableTest;

//실습
//각 데이터에 맞는 타입 선언 후 출력해보기
//5, false, 7845.15, B, 85.10F, 자바, S, 98590, D, true, 107L, 공백문자
public class VariableTest01 {
	public static void main(String[] args) {
//		내가 값을 모를 때 -> 초기값
		
		int num1 = 0, num5 = 0;
		boolean bool1 = false, bool2 = false;
		double num2 = 0.0;
		char char1 = ' ', char2 = ' ', char3 = ' ';
		float num3 = 0.0F;
		String str1 = "", str2="";
		long num4 = 0L;
		
		num1 = 5;
		bool1 = false;
		num2 = 7845.15;
		char1 = 'B';
		num3 = 85.10F;
		str1 = "자바";
		char2 = 'S';
		num5 = 98590;
		char3 = 'D';
		bool2 = true;
		num4 = 107L;
		str2 = "";
		
		System.out.println(num5);
		
	}
	
}
