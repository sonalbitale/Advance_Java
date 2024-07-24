import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readerclass {

	public static void main(String[] args) throws FileNotFoundException {
		
		try {
			FileReader fr = new FileReader("E:\\file.txt");
			int ch= 0;
			while((ch= fr.read())!=-1) {
				System.out.println(ch);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
