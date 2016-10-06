package graphics;

import java.applet.Applet;
import java.awt.Graphics;

/*
 <applet code="draw_rectangle" width="500" height="200">
 </applet> 
 */
public class draw_rectangle extends Applet 
{
	@Override
	public void paint(Graphics g) 
	{
		g.drawRect(10, 60,60, 50);
		g.fillRect(100,10,60, 50);
		g.drawRoundRect(190,10,60, 50, 15, 15);
		g.fillRoundRect(70,90,140,100,30,40);
	}
}
