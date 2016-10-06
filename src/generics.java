class Gen<T>
{   
	T ob;
	
	Gen(T o)
	{
		ob=o;
	}
	
	T getOb()
	{
		return ob;
	}
	
	void showType()
	{
		System.out.println("Type of T is "+ob.getClass());
	}
}

public class generics 
{
  public static void main(String args[])
  {
	  Gen<Integer> iOb;
	  
	  iOb=new Gen<Integer>(88);
	  iOb.showType();
	  
	  int v=iOb.getOb();
	  System.out.println("Value : "+v);
	  
	  System.out.println();
	  System.out.println("**********************");
	  System.out.println();
	  
	  
	  Gen<String> myob;
	  myob=new Gen<String>("My name is cod3ran0nym0us!");
	  myob.showType();
	  
	  
	  String myobstr=myob.getOb();
	  System.out.println("The String of the Object is :::---- \""+myobstr+"\"");
	  
	  
	  //test case
	  //Benefit of Generics is TypeSafety if we see in comparison with Non-Generics
	  //iOb=myob;
	  
	  
	  
	  
  }
}
