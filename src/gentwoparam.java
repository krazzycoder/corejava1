import java.util.ArrayList;

class twogen<T,V>
{
	T ob1;
	V ob2;
	 twogen(T o1,V o2)
	 {
		 ob1=o1;
		 ob2=o2;
	 }
	 
	 void showTypes()
	 {
		 
		 System.out.println("The Type of the T is "+ob1.getClass().getName());
		 System.out.println("The Type of the V is "+ob2.getClass().getName());
		 
	 }
	 
	 T getOb1()
	 {
		 return ob1;
	 }
	 
	 V getOb2()
	 {
		 return ob2;
	 }
  	
}

public class gentwoparam 
{
	public static void main(String args[])
	{
		ArrayList<twogen<Integer,String>> myarr=new ArrayList<twogen<Integer,String>>();
		for(int i=1;i<10;i++)
		{
			myarr.add(new twogen<Integer,String>(i,"shivam"+i));
		}
		
		
		for(int i=0;i<myarr.size();i++)
		{
			System.out.println(myarr.get(i).getOb1().intValue()+" --"+myarr.get(i).getOb2().toString());
		}
		
	}
}
