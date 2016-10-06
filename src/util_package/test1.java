package util_package;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

class address
{
	private Integer myint;
	private String mystr;
	address(Integer myint,String mystr)
	{
		this.myint=myint;
		this.mystr=mystr;
	}
	
	@Override
	public String toString() 
	{
		return myint+"**"+mystr;
	}
}

public class test1 
{
	static LinkedList<address> mymap=null;
	public static void main(String args[])
	{
		mymap=new LinkedList<address>();
		mymap.add(new address(1,"Shivam"));
		mymap.add(new address(2,"singh"));
		mymap.add(new address(3,"ratan"));
		mymap.add(new address(4,"crazy"));
		System.out.println(""+mymap);
		
	}
	
}
