
class nongen
{
	Object ob;
	nongen(Object o)
	{
		ob=o;
	}
	
	Object getOb()
	{
		return ob;
	}
	
	void showType()
	{
		System.out.println("Type of ob is "+ob.getClass().getName());
	}
}

public class nongeneric 
{
	public static void main(String args[])
	{
		nongen iob;
		
		iob=new nongen(88);
		iob.showType();
	  int num=(Integer)iob.getOb();
	  System.out.println("\n The boxed value is "+num);
	  
	  System.out.println("***************");
	  
	  
	  nongen strob;
	  strob=new nongen("Everything is possible in the world");
	  strob.showType();
	  
	  String temp=(String)strob.getOb();
	  System.out.println("The value is "+temp);
	  
	  
	  System.out.println("The test case is ");
	  iob=strob;
	  int mytem=(Integer)iob.getOb();
	  System.out.println("The typecasted value is "+mytem);
	  
	  
	}
}
