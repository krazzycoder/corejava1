
public class generic_rawtype 
{
	public static void main(String args[])
	{
	   Gen3<Integer> iob=new Gen3<Integer>(88);
	   Gen3<String> strob=new Gen3<String>("CoderAnonymous");
	   Gen3<Double> doubleob=new Gen3<Double>(324.43);
	   Gen3<Float> floatob=new Gen3<Float>(23.4F);
	   
	   
	   int num=iob.getOb();
	   String str=strob.getOb();
	   double dbl=doubleob.getOb();
	   //int a=(Integer)strob.getOb();
	   
	   
	  System.out.println("The value of the number is "+num);
	  System.out.println("The value of the string is "+str);
	  System.out.println("The value of the Double is "+dbl);
	  
	   
	}
}

class Gen3<T>
{
	T obj;
  public Gen3(T obj)
  {
	  this.obj=obj;
  }
  
   T getOb()
   {
	   return obj;
   }
}


