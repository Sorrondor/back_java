package lambdaTest;

public class LambdaTask {
	public static void main(String[] args) {
		
//		LambaInter2 구현하기
//		두 정수를 받아서 사칙연산을 CalcResult로 리턴해주는 메서드
        LambdaInter2 li = (int num1, int num2, int num3) -> new CalcResult(num1, num2);
        

        CalcResult result = li.calc(10, 5, 8);
        
        result.getAdd();
        System.out.println(result);
	}
}

