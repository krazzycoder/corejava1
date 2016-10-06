package Networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class httpurldemo 
{
	public static void main(String args[])
	{
		try {
			URL url=new URL("http://www.hbti.ac.in/");
			
			HttpURLConnection urlconn=(HttpURLConnection) url.openConnection();
			
			//Request Code
			 System.out.println("Request Method is "+urlconn.getRequestMethod());
			 
			 //Response Code
			 System.out.println("Response Code is "+urlconn.getResponseCode());
			 
			 //Response Message
			 System.out.println("Response Message "+urlconn.getResponseMessage());
			 
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
