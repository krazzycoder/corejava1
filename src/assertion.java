import java.lang.reflect.Method;
import java.util.Calendar;

public class assertion 
{
	public static void main(String args[])
	{
	/*  for(int i=0;i<5;i++)
	  {
		  if(i%2==0)
		  {
			  //Assert statement only for debugging purpose
			 assert i>0;
			 System.out.println("The value is "+i);
		  }
		 
	  }*/
	  
	  Method method=null;
	try {
		method = Calendar.class.getMethod("set",new Class[]{Integer.TYPE,Integer.TYPE});
		//method.invoke(arg0, arg1)
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println(method.getName());
	 
	/*  
	  Calendar calendar=Calendar.getInstance();
	  System.out.println(""+Calendar.MONTH);
	  System.out.println(""+Calendar.YEAR);
	  System.out.println(""+Calendar.DATE);
	  System.out.println(""+Calendar.DAY_OF_YEAR+" "+Calendar.DAY_OF_MONTH+" "+Calendar.DAY_OF_WEEK+" "+Calendar.DAY_OF_WEEK_IN_MONTH);
	  */
	}
}
