class Stats<T extends Number>
{
	T nums[];
	
	Stats(T[] o)
	{
	      nums=o;	
	}
	
	double getavg()
	{
		double average=0;
		double sum=0.0;
		
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i].doubleValue();
		}
		
		average=sum/nums.length;
			return average;
	}
	
	//here if wildcard ('?') is replaced by T parameter then it will give Compilation Error 
	boolean sameavg(Stats<?> comp_ob)
	{
		if(getavg()==comp_ob.getavg())
		{
			return true;
		}
		
		return false;
	}
	
}



public class generic_eg1 
{
	public static void main(String args[])
	{
		Integer intarr[]={1,2,3,4,5,6,7,8,9,10};
		Stats<Integer> intstats=new Stats<Integer>(intarr);
		
		System.out.println("The average of the entered number is "+intstats.getavg());
		
		System.out.println("**********************************************");
		Double doublearr[]={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.10};
		Stats<Double> doublestats=new Stats<Double>(doublearr);
		
		System.out.println("The average of the entered double number is "+doublestats.getavg());
		
		Float floatarr[]={1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f,9.0f,10.0f};
		Stats<Float> floatstats=new Stats<Float>(floatarr);
		
		System.out.println("The average of the entered float number is "+floatstats.getavg());
		
		
		System.out.println("\n Comparing the averages of int and Float averages");
		if(intstats.sameavg(floatstats))
		{
			System.out.println("The average of Integer array and Float array is Equal");
		}
		else
		{
			System.out.println("The average of Integer array and Float array is not Equal!");
		}
		
		
		System.out.println("\n Comparing the average of Integer and Double array");
		if(intstats.sameavg(doublestats))
		{
			System.out.println("The average of Integer array and Double array is  Equal!");
		}
		else{
			System.out.println("The average of Integer array and Double array is not Equal!");
		}
		
		
		System.out.println("\n Comparing the Double and Float array");
		if(doublestats.sameavg(floatstats)){
			System.out.println("The average of Double array and Float array is Equal!");
		}
		else
		{
		    System.out.println("The average of Double array and Float array is not Equal!");		
		}
			
		
		
	}
}
