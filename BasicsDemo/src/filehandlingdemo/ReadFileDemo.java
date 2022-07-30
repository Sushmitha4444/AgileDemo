package filehandlingdemo;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {
	public static void main(String[]args)
	{
		char[] data = new char[50];
		try {
			FileReader input = new FileReader("file1");
			input.read(data);
			System.out.println("Reading data");
			System.out.println(data);
			input.close();
		}
		catch(IOException e) {
			System.out.println("Error");
		}
	}

}
