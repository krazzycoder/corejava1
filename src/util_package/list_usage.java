package util_package;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


public class list_usage 
{
	static LinkedList<String> mylinked=null;
	public static void main(String args[])
	{
		
	/*	List<Integer> mylist=new ArrayList<Integer>();
		mylist.add(12);
		mylist.add(34);
		mylist.add(23);
		*/
		
	mylinked=new LinkedList<String>(Arrays.asList("S","H","I","V","A","M"));
	mylinked.add("R");
	mylinked.add("A");
	mylinked.add("T");
	mylinked.add("A");
	mylinked.add("N");
	
	mylinked.addFirst("*");
	mylinked.addLast("*");
	
	mylinked.add(2,"#");
	printLinkedList();

		
		
	}
	
	static void printLinkedList()
	{
		Iterator myiterator=mylinked.iterator();
		while(myiterator.hasNext())
		{
			String txt=myiterator.next().toString();
			System.out.print(txt);
		}
		
	}
}
