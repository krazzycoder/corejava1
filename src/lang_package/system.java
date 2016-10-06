package lang_package;

import java.util.Iterator;
import java.util.Map;

public class system 
{
	public static void main(String args[])
	{
	/*	Map<String,String> mymap=System.getenv();
		Iterator myiterator=mymap.keySet().iterator();
		int count=0;
		
		while(myiterator.hasNext())
		{
			Object prop=myiterator.next();
			String propval=mymap.get(prop);
			System.out.println("Property: "+((String)prop)+ "\t Value: "+((String)propval));
			++count;
		}*/
		
		//System.out.println("************************************************"+count);
		System.out.println(""+System.getProperty("COMPUTERNAME","Nothing Found !!"));
		System.out.println(""+System.identityHashCode("shivam is here"));
		System.out.println("\""+System.lineSeparator()+"\"");
	}
}
