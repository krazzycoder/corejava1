package util_package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class hs_set 
{
	public static void main(String args[])
	{
		List<String> mylist=new ArrayList<String>(Arrays.asList("C","B","D","A","T"));
		System.out.println("mylist is the following:--");
		System.out.println(mylist);
		Collections.sort(mylist);
		System.out.println("mylist after the sorting is the following:--");
		System.out.println(mylist);
		
		
		Set<String> myset=new HashSet<>();
		myset.add("B");
		myset.add("B");
		myset.add("C");
		myset.add("D");
		myset.add("M");
		myset.add("A");
		
		System.out.println(myset);
		
		
		Set<String> myset1=new TreeSet<>();
		myset1.add("B");
		myset1.add("B");
		myset1.add("C");
		myset1.add("D");
		myset1.add("M");
		myset1.add("A");
		
		System.out.println(myset1);
		
		
		Set<String> myset2=new LinkedHashSet<>();
		myset2.add("B");
		myset2.add("B");
		myset2.add("C");
		myset2.add("D");
		myset2.add("M");
		myset2.add("A");
		
		
		System.out.println(myset2);
	}
}
