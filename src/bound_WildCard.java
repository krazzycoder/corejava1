class OneD
{
	int X;
	OneD(int X)
	{
		this.X=X;
	}
}


class TwoD extends OneD
{
	int Y;
	TwoD(int X,int Y)
	{
		super(X);
		this.Y=Y;
	}
	
}

class ThreeD extends TwoD
{
   int Z;
   ThreeD(int X,int Y,int Z)
   {
	   super(X,Y);
	   this.Z=Z;
   }
}

class FourD extends ThreeD
{
   int U;
   FourD(int X,int Y,int Z,int U)
   {
	   super(X,Y,Z);
	   this.U=U;
   }
}

class Coords<T extends OneD>
{
	T[] coords;
	Coords(T[] o)
	{
		coords=o;
	}
}

public class bound_WildCard 
{
	
  static void showXY(Coords<? extends TwoD> c)
  {
	System.out.println("The XY Coordinates:");
	for(int i=0;i<c.coords.length;i++)
	{
	  	System.out.println(c.coords[i].X+"::"+c.coords[i].Y);
	}
	System.out.println();
	
  }
  
  
  static void showlowerBound(Coords<? super FourD> c)
  {
	  //It shows the lowest baseclass of the parent class FourD
	  System.out.println("It can show all the coordinate's ");
	  //System.out.pinc.getClass().getName();
	  for(int i=0;i<c.coords.length;i++)
	  {
		  System.out.println(c.coords[i].X);
	  }
  }
  
  static void showXYZ(Coords<? extends ThreeD> c)
  {
	  System.out.println("The XYZ coordinates:");
	  for(int i=0;i<c.coords.length;i++)
	  {
		  	System.out.println(c.coords[i].X+"::"+c.coords[i].Y+":: "+c.coords[i].Z);
	  }
	  
	  System.out.println();
  }
  
  static void showXYZT(Coords<? extends FourD> c)
  {
	  System.out.println("The XYZT coordinates:");
	  for(int i=0;i<c.coords.length;i++)
	  {
		  	System.out.println(c.coords[i].X+"::"+c.coords[i].Y+":: "+c.coords[i].Z+"::"+c.coords[i].U);
	  }
	  
	  System.out.println();
  }
  
  
  
  public static void main(String args[])
  {
	TwoD td[]={
			new TwoD(2,3),
			new TwoD(3,4),
			new TwoD(-4,-5)
			
	};  
	
	Coords<TwoD> tdlocs=new Coords<TwoD>(td);
	
	System.out.println("Contents of Tdlocs");
    showXY(tdlocs);
  
    System.out.println();
    System.out.println("***********************");
    System.out.println();
    
    FourD fd[]={
    		new FourD(2,3,4,6),
    		new FourD(3,4,5,6),
    		new FourD(2,0,4,2),
    		new FourD(1,2,3,4)
    };
    
    
    Coords<FourD> fourlocs=new Coords<FourD>(fd);
    System.out.println("The content of Fourlocs is the Following");
    showXYZT(fourlocs);
    System.out.println();
    System.out.println("***********************");
    System.out.println();
    
    showXY(fourlocs);
    showXYZ(fourlocs);
    
    
    System.out.println("\n Showing the Lower Bound **********\n");
    
    showlowerBound(tdlocs);
    showlowerBound(fourlocs);
	
  }
}
