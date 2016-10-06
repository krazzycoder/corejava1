package io_package;

import java.io.FileWriter;
import java.io.IOException;

public class file_writer 
{
	public static void main(String args[])
	{
		String source="Now is the time to acquire the great thing with a lot"
				+ "things in hand but there are much opportunities to handle a "
				+ "lot of needs in respectance to the need of the well being and humans are "
				+ "the cost to deliver the greatest things but continue to say everytime"
				+ "that I'm the Greatest I'm the Champion";
		
		char buffer[]=new char[source.length()];
		source.getChars(0,source.length(),buffer,0);
		FileWriter f0=null,f1=null,f2=null;
		
		try {
			f0=new FileWriter("writer_file1.txt");
			f1=new FileWriter("writer_file2.txt");
			f2=new FileWriter("writer_file3.txt");
			
			for(int i=0;i<buffer.length;i+=2)
				f0.write(buffer[i]);
			
			f1.write(buffer);
			
			f2.write(buffer,buffer.length-buffer.length/4,buffer.length/4);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				f0.close();
				f1.close();
				f2.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
				
	}
}
