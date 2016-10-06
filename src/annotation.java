import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno
{
	String str();
	int val();
}
public class annotation
{
  @MyAnno(str="My Annotation",val=100)	
  public static void mymethod(String str,double dble,int a)
  {
	  annotation annot=new annotation();
	  

	  Class<?> c=annot.getClass();
	  try {
		Method m=c.getMethod("mymethod",String.class,double.class,int.class);
		MyAnno ann=m.getAnnotation(MyAnno.class);
		System.out.println("The Type of the annotation is :----- "+ann.annotationType());
		System.out.println("Annotation String = "+ann.str()+" \n "+" Annotation Value ="+ann.val());
		
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
	  mymethod("mystring",2.3,2);	 
  }
	
}
