package io_package;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class push_backsample1 
{
	public static void main(String args[])
	{
		byte bytearr[]=new byte[]{'H','E','L','L','O'};
		InputStream inputstr=new ByteArrayInputStream(bytearr);
		PushbackInputStream pushbackstream=new PushbackInputStream(inputstr,10);
		int c;
		try {
			while((c=pushbackstream.read())!=-1)
			{
				System.out.print((char)c);
			}
			
			System.out.println();
			
			byte newbytearr[]=new byte[]{'W','O','R','L','D'};
			pushbackstream.unread(newbytearr);
			while((c=pushbackstream.read())!=-1)
			{
				System.out.print((char)c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
