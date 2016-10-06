import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class characterinput
{
	
	static char c;
public static void main(String args[])
{
  /*Here Character Stream is used instead of byte Stream which is efficient & introduced in JAVA 1.1*/	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the character \'q\' to terminate the string");
	
	do
	{
		try {
			c=(char)br.read();
			System.out.print(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}while(c!='q');
	
}	
	

}
