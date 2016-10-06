package util_package;

import java.util.Comparator;
import java.util.TreeSet;

class mycomparator implements Comparator<String>
{
	@Override
	public int compare(String arg0, String arg1)
	{
		return arg1.compareTo(arg0);
	}
	
}

public class using_comparator 
{
	public static void main(String args[])
	{
		System.out.println("The Treeset without Comparator >>>");
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("M");
		ts1.add("N");
		ts1.add("C");
		ts1.add("K");
		ts1.add("L");
		for(String element:ts1)
		{
			System.out.print(" "+element);
		}
		
		System.out.println("\n");
		System.out.println("The Treeset with comparator >>>");
		
		TreeSet<String> ts=new TreeSet<String>(new mycomparator());
		ts.add("M");
		ts.add("N");
		ts.add("C");
		ts.add("K");
		ts.add("L");
		
		for(String element:ts)
		{
			System.out.print(" "+element);
		}
	}
}
