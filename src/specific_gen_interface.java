
public class specific_gen_interface 
{
	public static void main(String args[])
	{
	  Integer intarr[]={2,10,14,13,99,111,344,434,45};
		myclass1 mclass=new myclass1(intarr);
		
		System.out.println("The MAX is "+mclass.MAX()+"\n The MIN is "+mclass.MIN());
	}
}


interface minmax1<Integer>
{
	int MIN();
	int MAX();
}

class myclass1 implements minmax1<Integer>
{
	Integer arr[];
    myclass1(Integer arr[])
    {
    	this.arr=arr;
    }
	
	public int MIN() 
	{
	   int v=arr[0];
	   for(int i=0;i<arr.length;i++)
	   {
		 if(arr[i].compareTo(v)<0)
		 {
			 v=arr[i];
		 }
			 
	   }
	   
		return v;
	}

	public int MAX() 
	{
		int v=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].compareTo(v)>0)
			{
				v=arr[i];
			}
		}
		
		return v;
	}
	
}


