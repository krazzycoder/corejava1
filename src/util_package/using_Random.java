package util_package;

import java.util.Random;

public class using_Random 
{
	public static void main(String args[])
	{
		Random random=new Random(10L);
		for(int i=0;i<20;i++)
		System.out.print(random.nextInt(100)+" ");
		
		System.out.println();
		
		for(int j=0;j<20;j++)
			System.out.print(random.nextInt(100)+" ");
		
		System.out.println("\n");
		System.out.println("***********************************");
		
		Random random1=new Random(93L);
		for(int i=0;i<20;i++)
			System.out.print(random1.nextInt(100)+" ");
			
			System.out.println();
			
			for(int j=0;j<20;j++)
				System.out.print(random1.nextInt(100)+" ");
		
	    System.out.println("\n The Gaussian Distribution is the following :--");
			for(int i=0;i<20;i++)
				System.out.print(random1.nextGaussian()+" ");
			
			
	   
	}
}
