package Simplilearn;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
        //absolute file name with path
        File file = new File("C:\\Users\\mascencio\\projects\\file.txt");
        if(file.delete()){
            System.out.println("C:\\Users\\mascencio\\projects\\file.txt File deleted");
        }else System.out.println("\\Users\\mascencio\\projects\\file.txt doesn't exist");
        
        //file name only
        file = new File("file.txt");
        if(file.delete()){
            System.out.println("file.txt File deleted from Project root directory");
        }else System.out.println("File file.txt doesn't exist in the project root directory");
        
        //relative path
        file = new File("temp/file.txt");
        if(file.delete()){
            System.out.println("temp/file.txt File deleted from Project root directory");
        }else System.out.println("File temp/file.txt doesn't exist in the project root directory");
        
        //delete empty directory
        file = new File("temp");
        if(file.delete()){
            System.out.println("temp directory deleted from Project root directory");
        }else System.out.println("temp directory doesn't exist or not empty in the project root directory");
        
        //try to delete directory with files
        file = new File("/C:\\Users\\mascencio\\projects\\");
        if(file.delete()){
            System.out.println("\\Users\\mascencio\\projects\\ directory deleted from Project root directory");
        }else System.out.println("\\Users\\mascencio\\projects\\ directory doesn't exist or not empty");
    }

}
