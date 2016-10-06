package graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

/*
 <applet code="center_alignment" width=200 height=100>
 </applet>
 
 */
public class center_alignment extends Applet
{
	final Font f=new Font(Font.SANS_SERIF,Font.BOLD,18);
	
	@Override
	public void paint(Graphics g) 
	{
		Dimension d=this.getSize();
		g.setColor(Color.white);
		g.fillRect(0,0,d.width-1,d.height-1);
		g.setColor(Color.BLACK);
		g.setFont(f);
		drawCenteredString("This is centered",d.width,d.height, g);
		g.drawRect(0,0,d.width-1,d.height-1);
	}
	
	void drawCenteredString(String s,int w, int h, Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		int x=(w-fm.stringWidth(s))/2;
		int y=fm.getAscent()+(h-(fm.getAscent()+fm.getDescent()))/2;
		g.drawString(s,x,y);
	}
	
}
