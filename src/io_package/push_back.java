package io_package;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class push_back 
{
	public static void main(String args[])
	{
		String source="if(a==4) a=0;\n";
		byte buf[]=source.getBytes();
		ByteArrayInputStream binput=new ByteArrayInputStream(buf);
		PushbackInputStream pushbackinput=new PushbackInputStream(binput);
		int c;
		try {
			while((c=pushbackinput.read())!=-1)
			{
				switch(c)
				{
				case '=':
					if((c=pushbackinput.read())=='=')
						System.out.print(".eq.");
					else
					{
						System.out.print("<-");
						pushbackinput.unread(c);
					}
					break;
				default:
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
