package io_package;

import java.io.Console;

public class console 
{
	public static void main(String args[])
	{
		String str;
		Console con;
		System.out.println("Enter the string");
		con=System.console();
		if(con==null) 
			return;
		str=con.readLine();
		
		con.printf("%n the entered string is %s",str);
	}
}
