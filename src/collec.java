import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class collec {
	public static void main(String args[])
	{
		HashMap <Integer,String> has=new HashMap<Integer,String>();
		has.put(1,"Shivam");
		has.put(2,"Ramesh");
		has.put(3,"Ratan");
		
		Iterator it=has.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,String> mapen=(Entry<Integer, String>)it.next();
			System.out.println(mapen.getKey()+"******"+mapen.getValue());
			it.remove();
			//System.out.println(has.+"")
		}
	}
}
