package util_package;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class using_date 
{
  public static void main(String args[])
  {
	  GregorianCalendar g_calendar=new GregorianCalendar();
	  System.out.print((g_calendar.get(Calendar.YEAR))+"/");
	  System.out.print((g_calendar.get(Calendar.MONTH)+1)+"/");
	  System.out.println(g_calendar.get(Calendar.DAY_OF_MONTH));
	  if(g_calendar.isLeapYear(4))
		  System.out.println("2000 is Leap Year !");
	  else 
		  System.out.println("2000 is not Leap Year !");
	 
	  
	  
/*	  String temp[]=TimeZone.getAvailableIDs();
	  StringBuffer buff_str=new StringBuffer();
	  for(String mytemp:temp)
		  buff_str.append(mytemp+"\n");
	  
	  byte[] bytearr=buff_str.toString().getBytes();
	  try {
		FileOutputStream fout=new FileOutputStream(new File("timezone.txt"));
		fout.write(bytearr);
		fout.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	  
	
	  Date mydate=new Date();
	  mydate.setHours(9);
	  mydate.setMinutes(23);
	  mydate.setSeconds(27);
	 
	  
	 TimeZone timezone=g_calendar.getTimeZone();
     System.out.println(timezone.toString()+" ** "+timezone.inDaylightTime(mydate));
	  
     Locale mylocale=Locale.CANADA;
     System.out.println(mylocale.getCountry()+" "+mylocale.getLanguage()+" "+mylocale.getDisplayName());
	  
	  
  }
	
}
