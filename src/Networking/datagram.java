package Networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class datagram 
{
	public static int server_port=998;
	public static int client_port=999;
	public static int buffer_size=1024;
	public static DatagramSocket ds;
	public static byte buffer[]=new byte[buffer_size];
	
	public static void Theserver()
	{
		int pos=0;
		System.out.println("Enter the Character in the line ");
		while(true)
		{
			try {
				int c=System.in.read();
				switch(c)
				{
				case -1:
					System.out.println("Server Quits.");
					ds.close();
					break;
				case '\r':
					break;
				case '\n':
					ds.send(new DatagramPacket(buffer, client_port));
					pos=0;
					break;
				default:
					buffer[pos++]=(byte)c;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void theclient()
	{
		while(true)
		{
			DatagramPacket packet=new DatagramPacket(buffer, buffer.length);
			try 
			{
				ds.receive(packet);
				System.out.println(new String(packet.getData(),0,packet.getLength()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Enter 1: Client 2: Server \n NOTE: Firstly Client to be executed then, Server to executed");
		int myinput=(new Scanner(System.in)).nextInt();
		try {
			
		  switch(myinput)	
			{
		  case 1:
		    ds=new DatagramSocket(client_port);
			theclient();
			break;
		  case 2:	
			ds=new DatagramSocket(server_port);
			Theserver();
			break;
		}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
