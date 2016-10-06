import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class stringinput 
{
	public static void main(String args[])
	{
		String str=null;
		System.out.println("Enter the multiple lines of text.");
		System.out.println("Enter the stop String to End the text");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		do
		{
			try {
				str=br.readLine();
				System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}while(!str.equals("stop"));
	}
}
