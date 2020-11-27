package javaDevelopmentDay04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritinIntoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="C:\\Users\\falac\\eclipse-workspace";
		
		File file = new File(path+"\\FileToWrite2.txt");
		//Error check
		FileWriter fw;
		try {
			//append requires true
			fw= new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Java is easy\n");
			bw.newLine();
			bw.write("Dream Big\n");
			bw.newLine();
			bw.write("If you don't close, you can't write");
			
			bw.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
        
	
	}

}
