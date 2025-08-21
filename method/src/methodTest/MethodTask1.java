package methodTest;

public class MethodTask1 {
//1. 1~10까지 출력해주는 메서드 선언
//2. 1번 메서드 선언
	void method1() {
		for(int i=0; i<10; i++) {
			System.out.print(i+1);			
		}
	}
	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1(); // 데이터타입 사용자정의_이름 = 메모리주소배정 클래스이름(매개변수);
		mt.method1();
	}
}
