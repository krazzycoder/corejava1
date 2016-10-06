package util_package;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class hash_map 
{
	public static void main(String args[])
	{
		// HashMap<String,Double> hm=new HashMap<String,Double>();
		Map<String,Double> hm=new TreeMap<String,Double>();
		hm.put("John Doe",new Double(2343.4));
		hm.put("Johhnt Depp",new Double(3443.43));
		hm.put("Smith Corsiva",new Double(234.343));
		hm.put("Ralph Smith", new Double(343.34));
		
		Set<Map.Entry<String,Double>> set=hm.entrySet();
		Iterator iterator=hm.keySet().iterator();
		while(iterator.hasNext())
		{
			String value=iterator.next().toString();
			
		}
		for(Map.Entry<String,Double> me:set)
		{
			System.out.println(me.getKey()+"#####"+me.getValue());
		}
		
		double balance=hm.get("John Doe");
		System.out.println("John Doe's old Balance: "+hm.get("John Doe"));
		hm.put("John Doe",balance+1000);
		System.out.println("John Doe's new Balance: "+hm.get("John Doe"));
		
		
	}
}
