package FileOperations; 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class Demo1 {

	public static void main(String[] args) throws IOException {
		//File file = new File("D:\\4to6batch\\FilesOperations\\Demo.java");
		File file = new File("E:\\4to6batch\\FilesOperations\\x\\y\\z\\w\\s");
		//file.mkdir();
		file.mkdirs();
		if(file.exists()){
			System.out.println("File Already Exist");
			file.delete();
		}
		else{
		file.createNewFile();
		System.out.println("File Created...");
		}
	
	
	
	String File="E:\\4to6batch\\a.txt";
	FileOutputStream fo =new FileOutputStream(File);
	int  a=98952565;
	fo.write(a);
	fo.close();
	
	
	
	byte abc[]={1,2,3,4,5,6,7,8,9};
	//File file1 = new File("E:\\a.txt");

	FileOutputStream os =new FileOutputStream("E:\\azzzzzzzzz.dat");
	os.write(abc);
	//os.write(abc);
	os.close();System.out.println("here...");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
