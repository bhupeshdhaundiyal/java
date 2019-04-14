package FileOperations;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile {
	public static void main(String[] args) throws IOException {
		
		File file =new File("E://writingFile.txt");
		FileInputStream fo =new FileInputStream(file);
		
		
		int singleyte=fo.read();
		while((singleyte)!=-1){
			System.out.print((char)singleyte);
			singleyte=fo.read();
			
			
		}
		System.out.println();
		
		
		
		
	}

}
