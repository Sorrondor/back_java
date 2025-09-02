package collectionTest.arrayList2;

import java.util.ArrayList;

public class UserField {
	public ArrayList<User> users = DBconnecter.users;
	
//		아이디 검사
		public User checkId(String id) {
//		id를 받아서 db에 아이디가 있는지 아닌지를 검사
			for(User user: users) {
				if(user.getId().equals(id)) {
					return user;
				}
			}
			return null;
		}
//		회원가입
		public void join(User user) {
			User userInDB = checkId(user.getId());
			if(userInDB == null) {
				users.add(user);
			}
		}
//		로그인
//		1. 사용자로부터 아이디, 비밀번호를 받는다
//		2. User객체가 담긴 ArrayList 타입 데이터베이스를 순회하며
//		입력받은 아이디와 동일한 아이디가 User객체의 필드에 저장되어 있는 객체가 있는지 확인한다.
//		3. 만일 입력받은 아이디가 저장된 아이디와 같은 경우, 다음 조건문을 실행한다.
//		4. User객체가 담긴 ArrayList 타입 데이터베이스를 순회하며
//		입력받은 비밀번호와 동일한 비밀번호가 User객체의 필드에 저장되어 있는 객체가 있는지 확인한다.
//		5. 만일 저장된 아이디와 비밀번호가 입력된 것과 같다면, 로그인을 승인한다.
//		6. 그렇지 않은 경우, 로그인을 거부한다.
		public void logIn(String id, String password) {
			for(User user : users) {
				if(user.getId().equals(id)) {
					if(user.getPassword().equals(password)) {
						System.out.println("로그인 승인");						
					}else {
						System.out.println("로그인 거부");						
					}
				}else {
					System.out.println("로그인 거부");
				}
			}
		}
//		로그아웃
//		1. 로그인 되어있을 때 부울 값을 선언한다
//		2. 만일 부울값이 참일 경우, 거짓으로 변경한다
		public void logOut() {
			boolean userState = false; // 로그인 시
			if(userState == true) {
				userState = false;
				System.out.println("로그아웃 합니다");
			}
		}
//		암호화(아스키 코드 사용)
//		1. 사용자로부터 아이디, 비밀번호를 받는다
//		2. char타입 배열을 선언한다
//		3. 아스키 코드를 사용하기 위해, String 타입으로 받은 id를 char으로 변환한다.
//		4. 변환한 char를 char타입 배열에 저장한다.
//		5. 배열에 저장된 모든 char를 순회하며 아스키 코드 상 1을 더하고 다시 저장한다
//		6. 배열을 다시 String으로 만들어 저장한다
//		7. 비밀번호도 동일한 과정을 거친다
		private void incoding(String id, String password) {
			char[] idArr = null;
			char[] pwArr = null;
			String idIncoded = "";
			String pwIncoded = "";
			final int KEY = 1;
			
			for(int i=0; i<id.length(); i++) {
				idArr[i] = (char)(id.charAt(i) + KEY);
				idIncoded = idArr.toString();
			}
			for(int i=0; i<password.length(); i++) {
				pwArr[i] = (char)(password.charAt(i) + KEY);
				pwIncoded = pwArr.toString();
			}
		}
//		비밀번호 변경(마이페이지)
//		비밀번호 변경(비밀번호 변경 30일 경과)
//		인증번호 전송
//		인증번호 생성
//		인증번호 확인
		public static void main(String[] args) {

		}
}
