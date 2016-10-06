public class anas
{
	public static void main (String ar[])
	{
		System.out.print("Enter the no");
        int i,j,c=0,v=0;
    for (i=0;i<ar.length;i++)
    {
	  //char ch = ar.char.at(i);
    	int a=Integer.parseInt(ar[i].trim());
    	c=0;
	  for (j=1;j<=a;j++)
	  {
		  if (a%j==0)
		  {
			c=c+1;
		   }
		  
	  }
	  
	  if(c==2)
	  {
		  v=v+a;
	  }
	  else
	  {
		System.out.println(ar[i]+" is not Prime \n");  
	  }
    }
    
    System.out.println("The sum of the prime number is "+v);
   }
 }