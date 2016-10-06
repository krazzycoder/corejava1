package util_package;

import java.util.Timer;
import java.util.TimerTask;

public class using_timer 
{
	public static void main(String args[])
	{
		Timer mytimer=new Timer();
		mytimer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("Timer Task Executing !!!");	
			}
		},1000,500);
		
		System.out.println("initialise 5 seconds Time Lapse");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Terminating the Task !!!");
		mytimer.cancel();
	}
}
