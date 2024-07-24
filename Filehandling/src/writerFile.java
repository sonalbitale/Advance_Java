import java.io.FileWriter;

public class writerFile {
	
	
	public static void Writer(String filename, String Content) {
		try { 
			FileWriter writer = new FileWriter(filename);
		writer.write(Content);
		System.out.println("content added succesfully");
		writer.close();
			
		} catch (Exception e) {
			System.out.println("error occured");
			e.printStackTrace();
		}
		
		
			
			
		
		
	}

	public static void main(String[] args) {
		
		Writer("E:\\file.txt","this is new content added to the file");
		
		
		

	}

}
