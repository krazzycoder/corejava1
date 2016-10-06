package io_package;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class buffer_input 
{
	public static void main(String args[])
	{
		boolean marked=false;
		String source="This is &copy; copyright symbol"
				+ "but this &copy not .\n";
		
		try {
		byte buff[]=source.getBytes();
		ByteArrayInputStream byte_inputstrm=new ByteArrayInputStream(buff);
		BufferedInputStream buff_inputstream=new BufferedInputStream(byte_inputstrm);
		
		int c;
		
			while((c=buff_inputstream.read())!=-1)
			{
				switch(c)
				{
				case '&':
				 if(!marked)	
					{
					 buff_inputstream.mark(32);
					marked=true;
					}
				 else
				 {
					 marked=false;
				 }
					break;
				case ';':
					if(marked)
					{
						marked=false;
						System.out.print("(c)");
					}
					else
					{
						System.out.print((char)c);
					}
					break;
				case ' ':
					if(marked)
					{
						marked=false;
						buff_inputstream.reset();
						System.out.print("&");
					}
					else
					{
						System.out.print((char)c);
					}
					break;
				default:
					if(!marked)
						System.out.print((char)c);
					break;
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
