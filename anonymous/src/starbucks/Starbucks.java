package starbucks;

public class Starbucks {
   
   public static void main(String[] args) {
      Form form = new Form() {
         private String[] menus;
         
         @Override
         public void showMenus() {
        	 System.out.printf("**메뉴판**\n");
    		 for(int j=0; j<menus.length; j++) {
    			 if(menus[j] == null) {
    				 System.out.printf("[%s]\n", menus[j]);
    			 }
    		 }
    	 
         }
         @Override
         public void sell(String menu) {
         }
         @Override
         public void registerMenus(String[] mu) {
        	 for(int i=0; i<mu.length; i++) {
        		 for(int j=0; j<menus.length; j++) {
        			 if(menus[j] == null) {
        				 menus[i] = mu[j];
        				 System.out.printf("메뉴판 %d번째 arr에 %s가 등록되었습니다.\n", i, mu[j]);
        			 }else {
        				 System.out.printf("중복된 메뉴입니다");        				
        			 }
        		 }
        	 }
         }

      };
      
//      Form 메서드를 선언 후 메서드 1번씩 모두 사용하기
      String[] arr= {"민초라떼", "민초햄버거", "민초치즈그라탕"};
      
      form.registerMenus(arr);
      form.showMenus();
   }
}








