package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//		8.43 + 2.59를 더한 값이 10이 되도록 출력 (형변환)
		double num1 = 8.43, num2 = 2.59;
		int result = 0;
		
		result = (int)num1 + (int)num2;
		System.out.println((int)num1 + (int)num2);
	}

}
