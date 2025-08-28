package lambdaTask;

//1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//2) 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다구현 PrintString, strCount()
//3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
//4) 문자열과 문자형을 받으면 해당 문자를 모두 지워주는 람다구현 Remove removeStr()
//5) 문자열에서 중복된 값 모두 없애고 리턴해주는 람다구현 Dedupe, getDedupe()
//ex) "가나다가나다라가나다라마바사" -> "가나다라마바사"
public class LambdaTask2 {
	public static void main(String[] args) {
		PrintNum pn = () -> {
			for(int i=0; i<10; i++) {
				System.out.print(i+1);
			}
			System.out.println();
		};
		PrintString ps = (String str1) -> {
			System.out.print(str1.length() + "개");
			System.out.println();
		};
		Reverse rv = (String str2) -> {
			for(int i=0; i<str2.length(); i++) {
				System.out.print(str2.charAt(str2.length()-1 - i));
			}
			System.out.println();
		};
		Remove rm = (String str3, char ch1) -> {
			for(int i=0; i<str3.length(); i++) {
				if(str3.charAt(i) == ch1) {	continue; }
				System.out.print(str3.charAt(i));
			}
			System.out.println();
		};
		Dedupe dd = (String str4) -> {
			char[] arr1 = new char[0];
			
			for(int i=0; i<str4.length(); i++) {
				char c = str4.charAt(i);
				boolean flag = false;
			
				for(int j=0; j<arr1.length; j++) {
					if(arr1[j] == c) {		
						flag = true;
						break;
					}
					
					if(flag == false) {
						char[] temp = new char[arr1.length + 1];
						for(int k=0; k<arr1.length; k++) {
							temp[k] = arr1[k];
						}
						temp[arr1.length] = c;
						arr1 = temp;
					}	
					for(int m=0; m<10; m++) {
						System.out.print(c);						
					}
				}
			}
			
		};
		
		pn.printUpTo10();
		ps.strCount("abcde");
		rv.reverseString("abcde");
		rm.removeStr("aabbcc", 'b');
		dd.getDedupe("가나다가나다라가나다라마바사");
		
	}
}
