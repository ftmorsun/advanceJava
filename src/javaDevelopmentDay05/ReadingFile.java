package javaDevelopmentDay05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
	 public static void main(String[] args)  {
		 
		     String path="src\\folder\\File.txt";
		 
		     //First Way   		 
		    		 
	        File file=new File(path);
	       
	        try(BufferedReader br=new BufferedReader(new FileReader(file))) {
	        	   String st;
	   	        while((st=br.readLine())!=null){
	   	            System.out.println(st);
			} }catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	        
	        
	        
	        //Second way to read from file
	       ;
	        
			try ( Scanner scan= new Scanner(new File(path))){
				   String st;
		   	        while(scan.hasNext()){
		   	            System.out.println(scan.nextLine());
			}} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
				     
			
			
			
			//third way 
			//3.Way to read file: This is reading the text character by character...
			try(FileInputStream fis = new FileInputStream(path)){
				
				int k;
				
				while((k = fis.read()) != -1) {
					System.out.print((char)k);
				}
		
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	        
	    }

}
