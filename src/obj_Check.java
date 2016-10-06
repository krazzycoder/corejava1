
class A 
{
	int i, j;	
}

class B
{
	int i,j;
}

class C extends A
{
	int k;
}

class D extends A
{
	int k;
}

public class obj_Check 
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		
		if(a instanceof A)
		{
			System.out.println("The a is object of A");
		}
		
		if(b instanceof B)
		{
			System.out.println("The b is object of B");
		}
		
		if(c instanceof C)
		{
			System.out.println("The c is object of C");
		}
		
		if(d instanceof D)
		{
			System.out.println("The d is object of D");
		}
		
		
		System.out.println();
		
	if(a instanceof C)
		System.out.println("a can be casted to C");
	else
		System.out.println("a cannot be casted to C");
	
	
	
	System.out.println();
	
	
	//Compare types of derive types
	A ob;
	 ob=c;
	 System.out.println("The ob will now referred to c");
	 
	if(ob instanceof D)
	{
	  System.out.println("ob can be casted to D");	
	}
	else
	{
		System.out.println("ob cannot be casted to D");
	}
	
	System.out.println();
	if(ob instanceof A)
		System.out.println("ob can be cast to A");
	
	if(a instanceof Object)
		System.out.println(" a can be cast to Object Type");
	
	if(b instanceof Object)
		System.out.println("b can be cast to Object Type");
	
	if(c instanceof Object)
		System.out.println("c can be cast to Object Type");
	
	
	}
}
