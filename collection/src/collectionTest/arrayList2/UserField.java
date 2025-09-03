package collectionTest.arrayList2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

public class UserField {
	public ArrayList<User> users = DBconnecter.users;
	public static String userId;
	public static String code;
	public int KEY = 300;
	
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
			System.out.println("회원가입 되었습니다.");
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
						System.out.println("로그인 승인합니다.");						
					}else {
						System.out.println("로그인 거부합니다.");						
					}
				}else {
					System.out.println("로그인 거부합니다.");
				}
			}
		}
//		로그아웃
//		1. 로그인 되어있을 때 부울 값을 선언한다
//		2. 만일 부울값이 참일 경우, 거짓으로 변경한다
		public void logOut() {
			boolean userState = true; // 로그인 시 true
			if(userState == true) {
				userState = false;
				System.out.println("로그아웃 합니다.");
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
		public void changePasswordMP(String password) {
			System.out.println("기존 비밀번호를 입력하세요.");
			for(User user : users) {
				if(user.getPassword() == password) {
					user.setPassword(password); 
					System.out.println("비밀번호가 변경되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 다릅니다.");
				}
			}
		}
//		비밀번호 변경(비밀번호 변경 30일 경과)
		public void changePassword30(String password) {
			for(User user : users) {
				user.setPassword(password); 
			}
		}
//		인증번호 생성
		public String randomNumber() { 
			String code = "";
			for(int i=0; i<6; i++) {
				code += (int)(Math.random() * 10);
			}
			this.code = code;
			return code;
		}
//		인증번호 전송
		public void sendEmail(String Email) {
			// 메일 인코딩
	        final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
	        
	        //원하는 메일 제목 작성
	        String subject = "메일 발송 테스트";
	        
	        //보낸 이메일 작성
	        String fromEmail = "garlemy@naver.com";
	        String fromUsername = "김정수";
	        
	        String toEmail = Email; // 콤마(,)로 여러개 나열
	        
	        //도메인 사용할 필요 없다
	        //앱비밀번호
	        final String username = "garlemy@gmail.com";         
	        final String password = "rjhy aydz vinc abel";
	        
	        // 메일에 출력할 텍스트
	        String html = null;
	        StringBuffer sb = new StringBuffer();
	        sb.append("<h3>인증번호 발송</h3>\n");
	        sb.append("<h5>인증번호 6자리</h5>\n");
	        sb.append("<h5>" + code + "</h5>\n");
	        sb.append("<h5>입니다.</h5>\n");
	        html = sb.toString();
	        
	        // 메일 옵션 설정
	        Properties props = new Properties();    
	        props.put("mail.smtp.starttls.enable", "true");
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.port", "587");
	        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
	        
	        try {
	          // 메일 서버  인증 계정 설정
	          Authenticator auth = new Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	              return new PasswordAuthentication(username, password);
	            }
	          };
	          
	          // 메일 세션 생성
	          Session session = Session.getDefaultInstance(props, auth);
	          
	          // 메일 송/수신 옵션 설정
	          Message message = new MimeMessage(session);
	          message.setFrom(new InternetAddress(fromEmail, fromUsername));
	          message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
	          message.setSubject(subject);
	          message.setSentDate(new Date());
	          
//	          // 메일 콘텐츠 설정
	          Multipart mParts = new MimeMultipart();
	          MimeBodyPart mTextPart = new MimeBodyPart();
	          MimeBodyPart mFilePart = null;
	 //    
//	          // 메일 콘텐츠 - 내용
	          mTextPart.setText(html, bodyEncoding, "html");
	          mParts.addBodyPart(mTextPart);
//	                
//	          // 메일 콘텐츠 설정
	          message.setContent(mParts);
	     
	          // 메일 발송
	          Transport.send( message );
	          
	        } catch ( Exception e ) {
	          e.printStackTrace();
	        }
		}
//		인증번호 확인
		public boolean checkCode(String inputCode) {
			return code.equals(inputCode);
		}
		public static void main(String[] args) {
			UserField uf = new UserField();
			Scanner sc = new Scanner(System.in);
			
			String message = "인증번호를 입력하세요.";
			String inputCode = null;
			int errorCount = 0;
			uf.incoding("aselas", "dream1207*");
			
			uf.sendEmail("garlemy@naver.com");
			uf.randomNumber();
			
			do {
				if(errorCount == 0) {
					System.out.println(message);
					inputCode = sc.nextLine().trim();					
				}else if(errorCount > 0) {
					errorCount++;
					System.out.println("다시 입력하세요.");
					inputCode = sc.nextLine().trim();					
				}else {
					System.out.println("처음부터 다시 인증해주세요");
					break;
				}
			}while(!uf.checkCode(inputCode));
			
			if(uf.checkCode(inputCode)) {
				System.out.println("인증완료");
			}else {
				System.out.println("인증실패");
			}
		}
}
