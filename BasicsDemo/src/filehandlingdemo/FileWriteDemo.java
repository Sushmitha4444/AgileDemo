package filehandlingdemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
	public static void main(String[]args)
	{
		String data="The file has contents";
		try
		{
			FileWriter output = new FileWriter("file1");
			output.write(data);
			System.out.println("Data written on file");
			output.close();
		}
		catch(IOException e){
			System.out.println("Error found");
		
		}
	}

}
