import java.io.IOException;

public class char_research 
{
	public static void main(String args[])
	{
		char character='y';
		
		
	/*	System.out.println("The Math Symbol= "+Character.MATH_SYMBOL);
		System.out.println("The Max Radix is "+Character.MAX_RADIX);
		System.out.println("The Min Radix is "+Character.MIN_RADIX);
		System.out.println("The Max value is '"+(int)Character.MAX_VALUE+"'");
		System.out.println("The Min value is '"+(int)Character.MIN_VALUE+"'");
		System.out.println("The Type is "+Character.TYPE);
		*/
		
		char ch=0;
		System.out.println("The value of the entered character is '"+ch+"'");
		
new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
	for(int i=0;i<7;i++)
	{	
		//String path="\"C:\\Users\\Shivam1\\Desktop\\Aaoge Jab Tum _Unplugged_ by Ustad Rashid Khan.mp4\"";
		String path="\"C:\\Users\\Shivam1\\Desktop\\1.mp3\"";
		
		try
		{
			Process process=Runtime.getRuntime().exec("\"C:\\Program Files (x86)\\VideoLAN\\VLC\\vlc.exe\""+path);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	
	
	
	 }
   }).start();			
	
	}
}
