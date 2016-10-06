package util_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Currency;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public class using_currency 
{
	public static void main(String args[])
	{
		Currency currency=Currency.getInstance(Locale.US);
		System.out.println("Currency Symbol: "+currency.getSymbol());
		System.out.println("Currency Numeric Code: "+currency.getNumericCode());
		
	/*	Set<Currency> myset=Currency.getAvailableCurrencies();
	//	StringBuffer my_Buff=new StringBuffer();
		Iterator myiterator=myset.iterator();
		while(myiterator.hasNext())
		{
			Currency currencies=(Currency)myiterator.next();
			System.out.println(currencies.getDisplayName()+": "+currencies.getSymbol());
		}*/
		
		
/*	try {
		FileOutputStream fout=new FileOutputStream(new File("currency.txt"));
		fout.write(my_Buff.toString().getBytes());
		fout.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	}
}
