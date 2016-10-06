package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 <applet code="intro" width=300 height=100></applet>
  */
public class intro extends Applet
{
	StringBuilder builder=new StringBuilder();
	@Override
	public void init() 
	{
	 setBackground(Color.yellow);	
	 setForeground(Color.black);
	 builder.append("I am Java 1.8 Applet ");
	}
	
	
	
	@Override
	public void start() 
	{
		builder.append(" I am introduced here by programmer");
	}
	
	
	
	@Override
	public void paint(Graphics arg0) {
		
		builder.append("Thank you");
		arg0.drawString(builder.toString(),10, 30);
	}
	
}
