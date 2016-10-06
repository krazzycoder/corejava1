package io_package;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class datastream 
{
	public static void main(String args[])
	{
		try {
			DataOutputStream dout=new DataOutputStream(new FileOutputStream("test.dat"));
			dout.writeInt(87);
			dout.writeBoolean(true);
			dout.writeDouble(3435.344);
			dout.writeFloat(43.34F);
			dout.writeLong(4353355);
			dout.writeUTF("Its my Style Its my attitude!!!");
			
			DataInputStream din=new DataInputStream(new FileInputStream("test.dat"));
			int myint=din.readInt();
			boolean myboolean=din.readBoolean();
			double mydouble=din.readDouble();
			float myfloat=din.readFloat();
			long mylong=din.readLong();
			String mystring=din.readUTF();
			
			System.out.println("String value is "+mystring);
			System.out.println("Integer value is "+myint);
			System.out.println("Boolean value is "+myboolean);
			System.out.println("Double value is "+mydouble);
			System.out.println("Float value is "+myfloat);
			System.out.println("Long value is "+mylong);
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
