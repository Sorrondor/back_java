package castingTest;

public class CastingTest6 {
	public static void main(String[] args) {
//      "12.123";
//      "345.789"
//      "6789"
//      3개 값을 더해서 123456789를 출력하기
		String str1 = "12.123", str2 = "345.789", str3 = "6789";
		double doble1, doble2 = 0.0;
		int int1, int2, int3 = 0;
		
		doble1 = Double.parseDouble(str1);
		doble2 = Double.parseDouble(str2);		
		int1 = (int)doble1; 
		int2 = (int)doble2;
		int3 = Integer.parseInt(str3);
		
		System.out.printf("%d%d%d", int1, int2, int3);
	}

}
