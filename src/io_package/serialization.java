package io_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class myclass implements Serializable
{
	String s;
	int i;
	double d;
	myclass(String s,int i,double d)
	{
		this.s=s;
		this.i=i;
		this.d=d;
	}
	@Override
	public String toString() 
	{
		return "s="+s+" i="+i+" d="+d;
	}
}

public class serialization 
{
	public static void main(String args[])
	{
		//Object serialization
		try {
			ObjectOutputStream objStream=new ObjectOutputStream(new FileOutputStream("serial"));
		    myclass object1=new myclass("shivam",1,34.344);
		    System.out.println(object1);
		    objStream.writeObject(object1);
		   
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Object de-serialization
		ObjectInputStream input_objstream;
		try {
			input_objstream = new ObjectInputStream(new FileInputStream("serial"));
			myclass myobject=(myclass)input_objstream.readObject();
			System.out.println(myobject);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
