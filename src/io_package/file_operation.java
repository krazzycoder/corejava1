package io_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class file_operation 
{
	public static void main(String args[])
	{
		FileInputStream fin=null;
		int size=0;
		int n=0;
		try {
			fin=new FileInputStream("Fileinputstream.java");
			System.out.println("Total Available Bytes : "+(size=fin.available()));
			n=size/40;
			System.out.println("Printing first "+n+" bytes of the file");
			for(int i=0;i<n;i++)
			{
				System.out.print((char)fin.read()+"");
			}
			System.out.println();
			System.out.println("Total Available Bytes : "+(size=fin.available()));
			byte[] mybyte=new byte[n];
			if(fin.read(mybyte)!=n){
				System.out.println("couldn't read "+n+" bytes.");
				
			}
			
			System.out.println("'"+new String(mybyte,0,n)+"'");
			System.out.println("\n Still Available: "+(size=fin.available()));
			
			System.out.println("Skipping half of the bytes !");
			fin.skip(size/2);
			System.out.println("Still Available: "+fin.available());
			
			System.out.println("Reading "+n/2+" into the end of the array");
			if(fin.read(mybyte,n/2,n/2)!=n/2){
				System.out.println("couldn't read "+n/2+" bytes");
			}
			
			System.out.println("'"+new String(mybyte,0,mybyte.length)+"'");
			System.out.println("Still Available : "+fin.available());
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
