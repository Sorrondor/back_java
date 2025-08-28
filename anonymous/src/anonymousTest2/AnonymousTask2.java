package anonymousTest2;

public class AnonymousTask2 {
	public static void main(String[] args) {
//	메서드 선언
		MyInter myInter = new MyInter() {
			
			public String changeUpperOrLower(String str) {
				String ans = "";
				
				for(int i=0; i<str.length(); i++) {
					if(str.charAt(i)>=65 && str.charAt(i)<=90) {
						ans += (char)(str.charAt(i) + 32);
					}else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
						ans += (char)(str.charAt(i) - 32);
					}else {
						ans += str.charAt(i);
					}
				}
				return ans;
			};
			public void getString(String str) {
				char[] arr1 = str.toCharArray();
				for(int i=0; i<arr1.length; i++) {
					arr1[i] = (int)arr1[i] >= 67 ? (char)(arr1[i]+1) : (char)arr1[i];				
					
					System.out.print(arr1[i]);
				}
			};
			
		};
		
//	메서드 사용
		System.out.println(myInter.changeUpperOrLower("ABCD abcd"));
		myInter.getString("ABCD");
	}
}
