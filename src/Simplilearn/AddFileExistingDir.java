package Simplilearn;

import java.io.File;
import java.io.IOException;

public class AddFileExistingDir {
	
	 public static void main(String[] args) {
	        try {
	            File file = new File("C:\\Users\\mascencio\\projects\\sampleFile.txt");
	            if(file.createNewFile())
	                System.out.println("File creation successfull");
	            else
	                System.out.println("Error while creating File, file already exists in specified path");
	        }
	        catch(IOException io) {
	            io.printStackTrace();
	        }
	    }


	
}
	
	
