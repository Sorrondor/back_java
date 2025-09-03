package collectionTest.arrayList2;

public class Login {
	public static void main(String[] args) {
		UserField userField = new UserField();
		
//		회원가입
		User user = new User("garlemy", "정수", "dream1207*", "01044334455");
		userField.join(user);
		
//		로그인
		User userForLogin = new User("garlemy", "정수", "dream1207*", "01044334455");
		userField.logIn("garlemy", "dream1207*");
		
//		로그아웃
		userField.logOut();
	}
}
