package Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest 
{
	public static void main(String args[])
	{
		try {
			InetAddress address=InetAddress.getLocalHost();
			System.out.println(address);
			
			address=InetAddress.getByName("www.google.com");
			System.out.println(address);
			
			System.out.println("\n***************************");
			InetAddress address_arr[]=InetAddress.getAllByName("www.google.com");
			System.out.println("Address Belonging to Google.com");
			for(InetAddress temp: address_arr)
				System.out.println(temp);
			
			System.out.println("\n***************************");
			InetAddress address_arr1[]=InetAddress.getAllByName("www.facebook.com");
			System.out.println("Address Belonging to facebook.com");
			for(InetAddress temp: address_arr1)
				System.out.println(temp);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
