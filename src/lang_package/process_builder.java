package lang_package;

import java.io.File;
import java.io.IOException;
import java.util.*;
public class process_builder 
{
	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		String mystr="\"C:\\Users\\Shivam1\\Desktop\\form.php\"";
		list.add("\"notepad.exe\""+mystr);
		//list.add("C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe");
		ProcessBuilder processBuilder=new ProcessBuilder(list);
		//processBuilder.directory(new File("‪C:\\Users\\Shivam1\\Desktop\\form.php"));
		//processBuilder.command(list);
		//Process myruntime=Runtime.getRuntime().exec("notepad.exe","‪C:\\Users\\Shivam1\\Desktop\\form.php");
		try {
			processBuilder.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
