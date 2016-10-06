package util_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class mycomp1 implements Comparator<String>
{
	
	@Override
	public int compare(String astr, String bstr) 
	{
		int i,j,k;
		i=astr.indexOf(' ');
		j=bstr.indexOf(' ');
		
		k=astr.substring(i).compareTo(bstr.substring(j));
		if(k==0)
		 return  astr.compareTo(bstr);
		else
		  return k;
		
		//return arg1.compareTo(arg0);
	}
	
}

public class sorting_in_treemap 
{
	public static void main(String args[])
	{
		/*mycomp1 custom_comparator=new mycomp1();
		Comparator<String> mycomp=Collections.reverseOrder(custom_comparator);
	  TreeMap<String,Integer> mytreemap=new TreeMap<String,Integer>(mycomp);
		mytreemap.put("Shivam singh",1);
		mytreemap.put("Amit Gautam", 2);
		mytreemap.put("Amit Gautam", 5);
		mytreemap.put("Ambrish Awasthi",3);
		mytreemap.put("Mujeebul hasan",4);
      
		Set<Map.Entry<String,Integer>> myset=mytreemap.entrySet();
		for(Map.Entry<String,Integer> me:myset)
		{
			System.out.println(me.getKey()+" :: "+me.getValue()+" \n");
		}*/
		
		
		ArrayList<Integer> my_List=new ArrayList<Integer>(Arrays.asList(15,24,33,4,53,16,71,9,100));
	/*	System.out.println("the list before Shuffling \n"+my_List);
		Collections.shuffle(my_List);
		System.out.println("the list after Shuffling \n"+my_List);*/
		
		//Collection myarr=Collections.unmodifiableCollection(my_List);
		//myarr.add(3);
		//System.out.println("Executing the unmodifiable collection "+myarr);
	/*	Iterator myit=myarr.iterator();
		while(myit.hasNext())
		{
			int myint=(Integer)myit.next();
			System.out.println(myint);
		}*/
		
		Comparator<Integer> int_comp=Collections.reverseOrder();
		Collections.sort(my_List,int_comp);
	
	    System.out.println("The sorted arraylist is the following :-- "+my_List);
	    Collections.shuffle(my_List);
		System.out.println("The maximum of the array is "+Collections.max(my_List));
		System.out.println("The minimum of the array is "+Collections.min(my_List));
		
		
		
	}
	
}
