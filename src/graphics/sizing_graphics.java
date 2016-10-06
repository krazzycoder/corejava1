package graphics;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 <applet code="sizing_graphics" width=200 height=200>
 </applet> 
 */
public class sizing_graphics extends Applet
{
	final int inc=5;
	int max=100;
	int min=40;
	Dimension d;
	
	public sizing_graphics() 
	{
		addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseReleased(MouseEvent arg0) 
			{
				int w=(d.width+inc)>max?min:d.width+inc;
				int h=(d.height+inc)>max?min:d.height+inc;
				
				setSize(new Dimension(w,h));
			}
		});
	}
	
	@Override
	public void paint(Graphics g) 
	{
		d=getSize();
		g.drawLine(0,0,d.width-1,d.height-1);
		g.drawLine(0,d.height-1,d.width-1,0);
		g.drawRect(0,0,d.width-1,d.height-1);
	}
}
