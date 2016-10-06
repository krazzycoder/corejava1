package io_package;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fout_operation 
{
	public static void main(String args[])
	{
		String str="This is the time to implement the java.io package's class and its interface to different classes and metmhods"
				+ " available to use in for different method to ping every classes in domain & range of clever folk of this damn world"
				+ "but any ways everything it is available to the every single people of this world";

		byte buff[]=str.getBytes();
		FileOutputStream fout1=null,fout2=null,fout3=null;
		try {
			fout1=new FileOutputStream("file1.txt");
			fout2=new FileOutputStream("file2.txt");
			fout3=new FileOutputStream("file3.txt");
			
			for(int i=0;i<buff.length;i+=2)
				fout1.write(buff[i]);
			
			fout2.write(buff);
			fout3.write(buff,buff.length-buff.length/4,buff.length/4);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(fout1!=null)
			{
				try {
					fout1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fout2!=null)
			{
				try {
					fout2.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fout3!=null)
			{
				try {
					fout3.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
