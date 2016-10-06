public class generic_interface 
{
	public static void main(String args[])
	{
		Integer intnumarr[]={2,3,4,5,8,10};
		Character charsarr[]={'a','s','h','i','m','d'};
		
		myclass<Integer> mcls=new myclass<Integer>(intnumarr);
		myclass<Character> chars=new myclass<Character>(charsarr);
		
		System.out.println("**********The Case of the Integer*****************");
		int __intmin=mcls.max().intValue();
		int __intmax=mcls.min().intValue();
		
		System.out.println("MAX: "+__intmax+" MIN: "+__intmin);
		
		System.out.println("***********The case of the Characters *************");
		char __charmin=chars.min();
		char __charmax=chars.max();
		
		System.out.println("MAX: '"+__charmax+"' MIN: '"+__charmin+"'");
		
		
		
	}
}

interface MinMax<T extends Comparable<T>>
{
	T min();
	T max();
}

class myclass <T extends Comparable<T>> implements MinMax<T>
{
  T[] object;
   myclass(T[] object)
   {
	   this.object=object;
   }
	
	public T min()
	{
		T num=object[0];
		for(int i=0;i<object.length;i++)
		{
		  if(object[i].compareTo(num)<0)
		  {
			  num=object[i];
		  }
		}
		
		return num;
	}

	public T max() 
	{
		T num=object[0];
		for(int i=0;i<object.length;i++)
		{
		  if(object[i].compareTo(num)>0)
		  {
			  num=object[i];
		  }
		}
		
		return num;
	}
	
}
