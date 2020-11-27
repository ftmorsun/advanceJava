package javaDevelopmentDay04;
import java.io.File;
import java.io.IOException;
public class Creatingfile {
public static void main(String[] args) throws IOException {
		
		/*
		  			How To Create Files
		 If you type just the name of a file, Java puts the file inside the project outside the src folder
		 To see the file do not forget to refresh the project
		*/
//		File file1 = new File("FileOutOfSrc.txt");
//		file1.createNewFile();
//		System.out.println("File is created inside the project, outside the src");
		
//		File file2 = new File("src/FileUnderSrc.txt");
//		file2.createNewFile();
//		System.out.println("File is created inside the src");
		
//		File file3 = new File("src/javadevelopmentntDay04/FileUnderDay04.txt");
//		file3.createNewFile();
//		System.out.println("File is created under day04 package");
		
		//Create a file whose name is "TaskFile" under documents folder in your local computer
//		File file4 = new File("/Users/apple/Documents/TaskFile.txt");
//		file4.createNewFile();
//		System.out.println("File is created under Documents folder");
		
		/*
		  		How To Create Folders
		*/
//		File folder1 = new File("FolderOutOfSrc");
//		folder1.mkdir();
//		System.out.println("Folder is created inside the project, outside the src");
		
//		File folder2 = new File("src/FolderUnderSrc");
//		folder2.mkdir();
//		System.out.println("Folder is created under the src");
		
//		File folder3 = new File("FolderOutOfSrc/SubFolder1");
//		folder3.mkdirs();
//		System.out.println("Folder is created under the src");
		
		//Task: Create a folder under documents, name it as "MyFirstFolder"
		//      Create a sub-folder under "MyFirstFolder", name it as "MyFirstSubFolder"
		//      Create a file under "MyFirstFolder", name it as "FileOuter"
		//      Create a file under "MyFirstSubFolder", name it as "FileInner"
				
//		File folder1 = new File("/Users/apple/Documents/MyFirstFolder");
//		folder1.mkdir();
//		System.out.println("Folder is created under Documents folder");
		
//		File folder2 = new File("/Users/apple/Documents/MyFirstFolder/MyFirstSubFolder");
//		folder2.mkdirs();
//		System.out.println("Folder is created under MyFirstFolder folder");
		
//		File folder3 = new File("/Users/apple/Documents/MyFirstFolder/FileOuter.txt");
//		folder3.createNewFile();
//		System.out.println("File is created under MyFirstFolder");
		
		File folder4 = new File("C:\\Users\\falac\\eclipse-workspace\\FileInner.txt");
		folder4.createNewFile();
		System.out.println("File is created under MyFirstSubFolder");

	}


}
