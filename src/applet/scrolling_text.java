package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 <applet code="scrolling_text" width=300 height=50></applet> 
 */
public class scrolling_text extends Applet implements Runnable 
{
	Thread thread=null;
	String str="A Simple Moving Banner";
	int state;
	volatile boolean stateFlag=false; 
	volatile int counter=0;
	
	@Override
	public void init() 
	{
		setBackground(Color.CYAN);
		setForeground(Color.RED);
	}
	
	@Override
	public void start() 
	{
		thread=new Thread(this);
		stateFlag=false;
		thread.start();
	}

	@Override
	public void run() 
	{
		while(true)
		{
			repaint();
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(stateFlag)
				break;
			
		}	
	}
	
	@Override
	public void stop() {
		
		stateFlag=true;
		thread=null;
	}
	
	@Override
	public void paint(Graphics arg0) 
	{
		char ch;
		ch=str.charAt(0);
		str=str.substring(1,str.length());
		str+=ch;
		counter++;
		System.out.println("Calling thread "+counter);
		
		arg0.drawString(str,50,30);
	}
	
}
