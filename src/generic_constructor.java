
public class generic_constructor 
{
	public static void main(String args[])
	{
		construct_demo demo1=new construct_demo(300.5778);
		construct_demo demo2=new construct_demo(333.0F);
		
		demo1.showValue();
		demo2.showValue();
	}
}

class construct_demo
{
	public double args;
	public <T extends Number>  construct_demo(T args) 
	{
		this.args=args.doubleValue();
	}
	
	void showValue()
	{
		System.out.println("The value is "+args);
	}
}


