package javaDevelopmentDay05;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a folder under src
				File folder2 = new File("FolderToWrite");
     			folder2.mkdir();
				
				//Create a file under FolderToWrite
				File file = new File("FolderToWrite\\FileToWrite.txt");
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					
					FileWriter fw = new FileWriter(file, true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write("Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.");
					bw.newLine();
					
					bw.write("The buffer size may be specified, or the default size may be accepted.");
					bw.newLine();
					
					bw.write("The default is large enough for most purposes.");
					bw.newLine();
					
					bw.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				//Recommended...
				try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
					
					bw.write("Writes text to a character-output stream, buffering characters so as to provide for the efficient writing of single characters, arrays, and strings.");
					bw.newLine();
					
					bw.write("The buffer size may be specified, or the default size may be accepted.");
					bw.newLine();
					
					bw.write("The default is large enough for most purposes.");
					bw.newLine();
					
				} catch (IOException e) {
					e.printStackTrace();
				}

		

	}

}
