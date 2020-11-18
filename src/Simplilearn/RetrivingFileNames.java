package Simplilearn;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RetrivingFileNames {
	public static void main(String[] args) {
		File fileDir = new File("C:\\Users\\mascencio\\projects\\");
		if(fileDir.isDirectory()){
			List<String> listFile = Arrays.asList(fileDir.list());
			System.out.println("Listing files unsorted");
			for(String s:listFile){
				System.out.println(s);
			}
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");
			for(String s:listFile){
				System.out.println(s);
			}
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in descending order");
			Collections.sort(listFile,Collections.reverseOrder());
			for(String s:listFile){
				System.out.println(s);
			}

		}
		else{
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}

	}
	
}

