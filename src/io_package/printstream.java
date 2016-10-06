package io_package;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class printstream 
{
	public static void main(String args[])
	{
		
			PrintWriter ps=new PrintWriter(new FileOutputStream(FileDescriptor.out));
			ps.println("Hello World without main!!");
			//ps.println();
			ps.format("The value of the number is %d",34);
			ps.println();
			
			System.out.println("Its demo version");
			ps.close();
			
	}
}
