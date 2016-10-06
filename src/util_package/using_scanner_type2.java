package util_package;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class using_scanner_type2 
{
	public static void main(String args[])
	{
		Scanner myscanner=null;
		save_File1("1 3 45 35 343 838 34 343 done");
		StringBuilder mybuilder=new StringBuilder();
		try {
			myscanner=new Scanner(new FileReader("scanner_read.txt"));
			myscanner.useDelimiter(", *");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(myscanner.hasNext())
		{
			if(myscanner.hasNextInt()){
				mybuilder.append(myscanner.nextInt()+" ");
			}
			else
			{
				break;
			}
		}
		System.out.println(mybuilder.toString()+"");
		
	}
	
	static void save_File1(String file__data)
	{
		try {
			FileWriter fw=new FileWriter("scanner_read.txt");
			fw.write(file__data);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void save_File()
	{
		String str="1 2 34 45 23 87 23 19 done";
		try {
			FileOutputStream fout=new FileOutputStream("scanner_read.txt");
			fout.write(str.getBytes());
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
