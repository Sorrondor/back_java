package anonymousTest;

public class CalcResult {
	public static void main(String[] args) {
		
		MathTask mt= new MathTask() {		
			@Override
			public void printName(String name) {
				System.out.printf("사용자의 이름은 %s입니다.\n", name);
			}
			@Override
			public String concat(String str1, String str2) {
				System.out.printf("연결한 문자열:%s\n", str1 + str2);
				return null;
			}
			@Override
			public CalcResult calc(int num1, int num2) {
				System.out.printf("두 수를 더한 합:%d\n", num1+num2);
				System.out.printf("두 수를 뺀 차:%d\n", num1-num2);
				System.out.printf("두 수를 곱한 곱:%d\n", num1*num2);
				System.out.printf("두 수를 나눈 몫:%d\n", num1/num2);
				return null;
			}
			@Override
			public int add(int num1, int num2) {
				System.out.printf("두 수의 합은 %d입니다.\n", num1+num2);
				return 0;
			}
		};
		mt.printName("홍길동");
		mt.concat("고길동 ", "둘리");
		mt.calc(6, 3);
		mt.add(6, 3);

	}
}
