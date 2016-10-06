package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class whois 
{
	public static void main(String args[])
	{
		int c;
		
		System.out.println("Enter the Domain String");
		Scanner sc=new Scanner(System.in);
		String mystr=sc.nextLine();
		try {
			Socket socket=new Socket("whois.internic.net",43);
			
			InputStream inputstream=socket.getInputStream();
			OutputStream outputstream=socket.getOutputStream();
			
			if(inputstream==null)
				System.out.println("The InputStream is NULL");
			
			if (outputstream==null)
				System.out.println("The OutputStream is NULL");
			
			String str=((mystr.length()==0)?"www.google.com":mystr)+"\n";
			byte buff[]=str.getBytes();
			
			//sending the request
			outputstream.write(buff);
			
			//reading & display the response
			while((c=inputstream.read())!=-1)
			{
				System.out.print((char)c);
			}
			
			//socket.close();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
