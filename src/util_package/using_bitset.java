package util_package;

import java.util.BitSet;

public class using_bitset 
{
	public static void main(String args[])
	{
		BitSet bit1=new BitSet(16);
		BitSet bit2=new BitSet(16);
		
		for(int i=0;i<16;i++)
		{
			if(i%2==0)
				bit1.set(i);
			if(i%5==0)
				bit2.set(i);
		}
		
		byte[] mybyte=bit1.toByteArray();
		System.out.println("The Bit set pattern 1 is "+mybyte.toString());
		System.out.println("The Bit set pattern 2 is "+bit2);
		
		
		
	}
}
