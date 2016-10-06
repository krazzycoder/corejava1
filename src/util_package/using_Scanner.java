package util_package;

import java.util.Scanner;

public class using_Scanner 
{
	public static void main(String args[])
	{
		StringBuilder mybuilder=new StringBuilder();
		System.out.println("Enter the array of the number \n");
		Scanner myscanner=new Scanner(System.in);
		while(myscanner.hasNext())
		{
			if(myscanner.hasNextInt()){
				mybuilder.append(myscanner.nextInt()+" ");
			}
			else
			{
				break;
			}
		}
		System.out.println(mybuilder.toString());
	}
}
