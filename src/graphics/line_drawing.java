package graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 <applet code="line_drawing" width=300 height=200>
 </applet>
 */
public class line_drawing extends Applet
{
	@Override
	public void paint(Graphics g) 
	{
		setForeground(Color.black);
		g.drawLine(0,0,100,100);
		g.drawLine(300,0,0,300);
		g.drawLine(0,0,300,100);
	}
}
