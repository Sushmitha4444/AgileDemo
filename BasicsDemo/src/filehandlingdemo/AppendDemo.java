package filehandlingdemo;

import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {
	public static void main(String[]args)
	{
		String data="Data is appended";
		try {
			FileWriter output = new FileWriter("file1",true);
			output.write(data);
			System.out.println("Data append done");
			output.close();
	
		}
		catch(IOException e)
		{
			System.out.println("file appended");
		}
	}

}
