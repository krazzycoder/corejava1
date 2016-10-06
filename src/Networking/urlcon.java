package Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class urlcon 
{
	static int c;
	public static void main(String args[])
	{
		try {
			URL url=new URL("http://google.com/");
			URLConnection urlcon=url.openConnection();
			
			long d=urlcon.getDate();
			if(d==0)
			{
				System.out.println("No Date information");
			}
			else
			{
				System.out.println("Date: "+new Date(d));
			}
			
			//Content type
			System.out.println("Content-Type: "+urlcon.getContentLength());
			
			d=urlcon.getExpiration();
			if(d==0)
				System.out.println("No Expiration");
			else
				System.out.println("Date: "+new Date(d));
			
			
			d=urlcon.getLastModified();
			if(d==0)
				System.out.println("No Expiration");
			else
				System.out.println("Date: "+new Date(d));
			
			Long l=urlcon.getContentLengthLong();
			if(l==-1)
				System.out.println("No last Modified Information");
			else
				System.out.println("Last Modified: "+new Date(d));
			
			
			
			//returning headers from the url connection
			Map<String,List<String>> myheadersmap=urlcon.getHeaderFields();
			Iterator<String> myiterator=myheadersmap.keySet().iterator();
			System.out.println("-------------------------------------------------------------------------------------------------");
			while(myiterator.hasNext()){
				   String key=myiterator.next();
				   List<String> mylist=myheadersmap.get(key);
				   
				   System.out.print(""+key+"= ");
				   
				   for(int i=0;i<mylist.size();i++)
					 System.out.print(mylist.get(i)+" ");
				
				   System.out.println();
			}
			
			System.out.println("--------------------------------------------------------------------------------------------------");
			
			
			
			if(l!=0)
			{
				System.out.println("****************************** Content *****************************");
				InputStream input=urlcon.getInputStream();
				while((c=input.read())!=-1)
				{
					System.out.print((char)c);
				}
				
				input.close();
			}
			else
			{
				System.out.println("No Content Available");
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
