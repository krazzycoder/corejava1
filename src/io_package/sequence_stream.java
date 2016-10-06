package io_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class inputstreamEnumerator implements Enumeration<FileInputStream>
{
  private Enumeration<String> files;
	public inputstreamEnumerator(Vector<String> files)
	{
		this.files=files.elements();
	}
	
	@Override
	public boolean hasMoreElements() 
	{
		return files.hasMoreElements();
	}

	@Override
	public FileInputStream nextElement() 
	{
		try {
			return new FileInputStream(files.nextElement().toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}

public class sequence_stream 
{
	public static void main(String args[])
	{
		int c;
		Vector<String> files=new Vector<String>();
		files.add("lovefile1.txt");
		files.add("lovefile2.txt");
		files.add("lovefile3.txt");
		
		inputstreamEnumerator myenumerator=new inputstreamEnumerator(files);
		InputStream sequencestream=new SequenceInputStream(myenumerator);
		
		try {
			while((c=sequencestream.read())!=-1)
			{
				System.out.print((char)c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				sequencestream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
