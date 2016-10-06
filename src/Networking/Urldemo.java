package Networking;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;


public class Urldemo 
{
  public static void main(String args[])
  {
	  try {
		URL url=new URL("http://hbti.ac.in/syllabus/btechmcaistyear.pdf");
		System.out.println("Protocol: "+url.getProtocol());
		System.out.println("Port: "+url.getPort());
		System.out.println("Host: "+url.getHost());
		System.out.println("File: "+url.getFile());
		System.out.println("EXT: "+url.toExternalForm());
		
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
}
