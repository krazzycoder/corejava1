class GenMethDemo
{
	static<T, V extends T> boolean isIn(T x,V[] y)
	{
		for(int i=0;i<y.length;i++)
		{
			if(x.equals(y[i]))
			{
				return true;
			}
		}
		
		return false;
	}
}

public class generic_Method
{
	public static void main(String args[])
	{
		Integer nums[]={1,2,3,4,5,6,7};
		
		if(GenMethDemo.isIn(2,nums))
		 System.out.println(" 2 is in nums");
		
		if(!GenMethDemo.isIn(7,nums))
		{
			System.out.println("7 is not contained by nums");
		}
		else
		{
			System.out.println("7 is contained by nums");
		}
		
		
		String strarr[]={"One","Two","Three","Four","Five","Six","Seven"};
		
		if(GenMethDemo.isIn("One",strarr))
		{
			System.out.println("\"One\" string is present in strarr");
		}
		
		
	}
	
}
