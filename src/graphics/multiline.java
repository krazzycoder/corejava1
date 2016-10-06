package graphics;

import java.applet.Applet;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/*
 <applet code="multiline" width=300 height=100>
 </applet>
 */
public class multiline extends Applet
{
	int curX=0,curY=0;
	
	@Override
	public void init() 
	{
	 Font f=new Font("SansSerif",Font.PLAIN,12);
	 setFont(f);
	}
	
	@Override
	public void paint(Graphics g) 
	{
		FontMetrics fm=g.getFontMetrics();
		nextLine("This is the Line One", g);
		nextLine("This is the Line Two", g);
		sameLine("This is on same line.",g);
		sameLine("Thie is too... ",g);
		nextLine("This is Line three", g);
		curX=curY=0;
		
	}
	
	void nextLine(String s,Graphics g)
	{
		FontMetrics fontmetric=g.getFontMetrics();
		curY+=fontmetric.getHeight();
		curX=0;
		g.drawString(s, curX, curY);
		curX=fontmetric.stringWidth(s);
	}
	
	
	
	void sameLine(String s,Graphics g)
	{
		FontMetrics fontmetric=g.getFontMetrics();
		g.drawString(s,curX,curY);
		curX+=fontmetric.stringWidth(s);
	}
	
}
