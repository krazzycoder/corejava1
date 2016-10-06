package util_package;

import java.util.Formatter;

public class formatter_test1 
{
	public static void main(String args[])
	{
		Formatter formatter=new Formatter();
		formatter.format("%-7d %n",100);
		formatter.format("%#,.2f %n",234567654334f);
		formatter.format("%3$d %2$d %1$d %n",10,20,30);
		
		
		System.out.println("'"+formatter+"'");
		formatter.close();
	}
}
