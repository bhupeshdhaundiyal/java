package FileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Copy1FileToFile {
	public static void main(String[] args) throws IOException {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the location of the file");
		String path =scan.nextLine();
		FileOutputStream wr =new FileOutputStream("E://newFile.txt");

		FileInputStream read =new FileInputStream(path);
		
		int singlebyte =read.read();
		while(singlebyte!=-1){
			wr.write(singlebyte);
			
			singlebyte=read.read();
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
