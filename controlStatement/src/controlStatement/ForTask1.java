package controlStatement;

//아래와 같은 문자열이 있을 때
//문자열은 연결시키고, 숫자는 연산하여 결과를 알려준다
//사용자가 임의로 정수와 알파벳을 입력할 때
//"abZ182bePz92"
//출력 예시) 문자열: abZbePz, 정수: 22
//.charAt(인덱스)
public class ForTask1 {
	public static void main(String[] args) {
		String Quest = "abZ182bePz92";
		String AnsStr = "";
		int AnsInt = 0;
		
		for(int i=0; i<Quest.length(); i++) {
			char str = Quest.charAt(i);
			int strToInt = (int)str;
			
			if((strToInt>=65 && strToInt<=90) || (strToInt>=97 && strToInt<=122)){
				AnsStr += str;
			}else {
				AnsInt += Integer.parseInt(String.valueOf(str));				
			}
		}
		System.out.printf("문자열: %s, 정수: %d", AnsStr, AnsInt);
	}
}
