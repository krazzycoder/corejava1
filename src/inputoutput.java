import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class inputoutput 
{
	public static void main(String arg[])
	{
		String args[]={
				"first.txt","second.txt"
		};
		if(args.length!=2)
		{
			System.out.println("Enter the path of Input and Output of the File!!!!");
			return;
		}
		
		int i=0;
		 FileInputStream fin=null;
		 FileOutputStream fout=null;
	
		 try {
			fin=new FileInputStream(args[0]);
			fout=new FileOutputStream(args[1]);
			
		  do
		  {
			i=(int)fin.read();
			fout.write(i);
			  
		  }while(i!=-1);
			
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(fin!=null)
			{
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fout!=null)
			{
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		 
		 
		 
		 i=0;
		 FileInputStream fence;
		 //Rewriting the Second.txt file
		
			 try {
				fence=new FileInputStream(args[1]);
				
		     do
			   {	
				i=fence.read();
			 if(i!=-1)
			 {	 
				char temp=(char)i;
				System.out.println(temp);
			 }
			 }while(i!=-1);	
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 finally
			 {
				 if(fin!=null)
				 {
					 try {
						fin.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 }
			 }
			 
		
		 
	}
}
