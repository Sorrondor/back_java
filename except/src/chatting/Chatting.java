package chatting;
import java.util.Scanner;

public class Chatting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = null;
		
		System.out.println("상대방에게 보낼 메시지");
		message = sc.nextLine();
		
		try {
			if(message.contains("뭉충")) {
				throw new BadWordException("뭉충이는 너무한데");
			}else {
				System.out.println(message);
			}
		}catch(BadWordException e){
			System.out.println("비속어 사용하지 마세요");
			   System.out.println(e.getMessage());
		         System.out.println(e.getClass());
		}
	}
}
