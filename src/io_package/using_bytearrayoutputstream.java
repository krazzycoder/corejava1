package io_package;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class using_bytearrayoutputstream 
{
	public static void main(String args[])
	{
	  	play_bytearrayoutputstream();
	}
	
	static void play_bytearrayoutputstream()
	{
		String source="I am the greatest";
		ByteArrayOutputStream boutstream=new ByteArrayOutputStream();
		byte buff[]=source.getBytes();
		
		try {
			boutstream.write(buff);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(boutstream.toString());
		byte bytearr[]=boutstream.toByteArray();
		for(int i=0;i<bytearr.length;i++)
		{
			System.out.print((char)bytearr[i]);
		}
		
		
		try {
			FileOutputStream fout=new FileOutputStream("bytestream.txt");
			fout.write(bytearr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		
		boutstream.reset();
		for(int i=0;i<5;i++)
		{
			boutstream.write('X');
		}
		
		System.out.println(boutstream.toString());
		
		
	}
	
	static void play_bytearrayinputstream()
	{
		String source="I am the greatest";
		ByteArrayInputStream binputStream=new ByteArrayInputStream(source.getBytes());
		
		for(int i=0;i<2;i++)
		{
			int c;
			while((c=binputStream.read())!=-1)
			{
				if(i==0)
				{
					System.out.print((char)c);
				}
				else
				{
					System.out.print(Character.toUpperCase((char)c));
				}
			}
			System.out.println();
			binputStream.reset();
		}
	}
	
}
