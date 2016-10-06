package util_package;

import java.util.Calendar;
import java.util.Formatter;

public class format_Calendar
{
	public static void main(String args[])
	{
		Calendar calendar=Calendar.getInstance();
		Formatter formatter=new Formatter();
		formatter.format("%s %th %n","Abbreviated Month Name: ",calendar);
		formatter.format("%s %tA %n","Abbreviated Weekday Name: ",calendar);
		formatter.format("%s %tc %n","Standard Date & Time string: ",calendar);
		formatter.format("%s %tD %n","Standard Date: ",calendar);
		formatter.format("%s %tp %n","AM/PM : ",calendar);
		formatter.format("%s %tY %n","Full Year: ",calendar);
		formatter.format("%s %tz %n","Offset from UTC: ",calendar);
		formatter.format("%s %tZ %n","TimeZone Name: ",calendar);
		formatter.format("%s %tr %n","Time : ",calendar);
		System.out.println(formatter);
		formatter.close();
	}
}
