import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	
	public static  void createFile(String filename) {
		try {
			File file = new File(filename);
			if(file.createNewFile()) {
				System.out.println("file got created "+file.getName());
			}
			else {
				System.out.println("file already existed");
			}
		
	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	
		
	}

	 public static void main(String[] args) {
		 createFile("E://file.txt");
	 }
		
	

}

