package FileOperations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFile {
	public static void main(String[] args) throws IOException {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the data");
		String data =scan.nextLine();
		
		File f =new File("E://writingFile.txt");
		
		FileOutputStream fo =new FileOutputStream(f,true);    // by default the value is false 
		   //which will not append the data the file will be override but when we put true then it will apppend the data 
		byte a[]=data.getBytes();
		fo.write(a);
		fo.close();
		
		
		System.out.println("file write sucesfully");
		
		
		
		
	}

}
