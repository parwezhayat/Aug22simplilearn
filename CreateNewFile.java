package Mypackage;
import java.io.IOException;
import java.io.*;

public class CreateNewFile {
	public static void CreateFileUsingFileClass() throws IOException{
		File file=new File("E://java//simplilearn//TestFile.txt");
		//Create the file
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File already exists");
			
		}
	}

	public static void main(String[] args) throws IOException
{
		// TODO Auto-generated method stub
		CreateFileUsingFileClass();
		
		
		
	}

}
