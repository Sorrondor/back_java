package exceptTask;

import java.util.Scanner;

import chatting.BadWordException;

// 사용자에게 입력을 받았을 때 특수문자 중 !@#를 사용하면 오류를 발생시키는 로직
// 만든 예외를 이용해서 메세지를 출력
public class ExceptionTask2 {
   public static void main(String[] args) {
	   System.out.println(System.getProperties());
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("상대방에게 보낼 메시지");
		message = sc.nextLine();
		
		try {
			if(message.contains("!")) {
				throw new BadWordException("! 는 너무한데");
			}else {
				System.out.println(message);
			}
		}catch(BadWordException e){
			System.out.println("! 사용하지 마세요");
			System.out.println(e.getMessage());
		    System.out.println(e.getClass());

		    System.out.println(System.in);
		}
   }
}
