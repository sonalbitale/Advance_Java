import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamdemo {
	public static void main(String []args) {
		String str= "java is oop language";
		try {
			FileOutputStream ft = new FileOutputStream("E:\\file.txt");
					ft.write(str.getBytes());
			      ft.close();
			System.out.println("data saved");
					
				
				
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
