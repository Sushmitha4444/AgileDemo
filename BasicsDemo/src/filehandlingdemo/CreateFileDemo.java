package filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo {
	public static void main(String[]args)
	{
		File myFile = new File("D:\\Abc\\file1.txt");
		try
		{
			if(myFile.createNewFile())
			{
				System.out.println("File created");
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("File error");
		}
		
	}

}
