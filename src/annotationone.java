import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface mainval
{
  String str();
  int myval();
}

@Retention(RetentionPolicy.RUNTIME)
@interface mess
{
	String description();
}

@mainval(str="This is the class LEVEL annotationone",myval=420)
@mess(description="This is the annotation for CLASS annotationone")
public class annotationone 
{
	@mainval(str="This is mymethod in METHOD LEVEL annotationone",myval=420)
	@mess(description="This is the annotatio for METHOD mymethod")
	public static void mymethod()
	{
		annotationone annone=new annotationone();
		
		Annotation annot[]=annone.getClass().getAnnotations();
		System.out.println("The List of all Annotations belongin to the Class");
		for(Annotation temp:annot)
		{
			System.out.println(temp);
		}
		
		System.out.println();
		try 
		{
			
			Annotation annotmethod[]=annone.getClass().getMethod("mymethod").getAnnotations();
			System.out.println("The List of the Annotations belonging to mymethod");
			for(Annotation temp: annotmethod)
			{
			  System.out.println(temp); 	
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@mainval(str="This is mymethodTWO in CLASS annotationone",myval=567)
//	@mess(description="This is the annotatio for METHOD mymethod")
	public static void mymethodtwo()
	{
		annotationone annone=new annotationone();
		Annotation annotmethod[];
		try {
			annotmethod = annone.getClass().getMethod("mymethodtwo").getAnnotations();
		
		System.out.println("The List of the Annotations belonging to mymethodtwo");
		for(Annotation temp: annotmethod)
		{
		  System.out.println(temp); 	
		}
		System.out.println("************************");
		
		Annotation annotundeclaredmethod[]=annone.getClass().getMethod("mymethodtwo").getDeclaredAnnotations();
		System.out.println("The List of the Undeclared Annotations belonging to mymethodtwo");
		Annotation allann[]=annone.getClass().getAnnotations();
		for(Annotation temp: annotundeclaredmethod)
		{
	  	  for(int i=0;i<allann.length;i++)
	  	  {
	  		  String temp1=allann[i].toString();
	  		  String temp2=temp.toString();
	  		  if(!temp1.equals(temp2))
	  		  {
	  			  System.out.println(temp1);
	  			  break;
	  		  }
	  		  
	  	  }
		   
		}
		
		
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@mess(description="This is the annotatio for METHOD mymethodthree")
	public static void mymethodthree()
	{
		annotationone annone=new annotationone();
		try 
		{
			
			Annotation annotmethod[]=annone.getClass().getMethod("mymethodthree").getAnnotations();
			System.out.println("The List of the Annotations belonging to mymethodthree");
			Annotation allann[]=annone.getClass().getAnnotations();
			for(Annotation temp: annotmethod)
			{
		     System.out.println(temp); 	
			}
			
			System.out.println("******************");
			
			Annotation annotundeclaredmethod[]=annone.getClass().getMethod("mymethodthree").getDeclaredAnnotations();
			System.out.println("The List of the Undeclared Annotations belonging to mymethodthree");
			for(Annotation temp: annotundeclaredmethod)
			{
			  //System.out.println(temp); 	
			  for(int i=0;i<allann.length;i++)
		       {

			  		  String temp1=allann[i].toString();
			  		  String temp2=temp.toString();
			  		  if(!temp1.equals(temp2))
			  		  {
			  			  System.out.println(temp1);
			  			  break;
			  		  }
			  		  
		       } 
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String args[])
	{
		mymethod();
		System.out.println();
		mymethodtwo();
		System.out.println();
		mymethodthree();
	}
	

}
