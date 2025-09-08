package fileTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException, FileNotFoundException{
//		new FileWriter("경로", "이어쓰기 여부");
//		 try {
//			BufferedWriter bufferdWriter = new BufferedWriter(new FileWriter("test.txt", true));
//			bufferdWriter.write("와~ 오전만 아픈 마음의 병 치료 기원!\n 배승원 화이팅");
//			bufferdWriter.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
			BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
			String line = null;
			
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			bufferedReader.close();
	}
}
