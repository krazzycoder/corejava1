package io_package;

import java.io.File;
import java.io.FilenameFilter;


class onlyExt implements FilenameFilter
{
	String ext="";
	public onlyExt(String ext)
	{
		this.ext="."+ext;
	}

	@Override
	public boolean accept(File arg0, String arg1) 
	{
		return arg1.endsWith(ext);
	}
	
}

public class file 
{
	public static void main(String args[])
	{
		/*File f1=new File("/playlist.txt");
		System.out.println(""+f1.getAbsolutePath());
		System.out.println(""+f1.length());
		System.out.println(""+f1.getName());
		System.out.println(""+f1.getFreeSpace()+"/"+f1.getTotalSpace());
		f1.delete();*/
		
		File myfile=new File("D:/");
	    onlyExt filenmfilter=new onlyExt("java");
	    String dir[]=myfile.list(filenmfilter);
	    for(String temp:dir){
	    	System.out.println(""+temp);
	    }
		
	}
}
