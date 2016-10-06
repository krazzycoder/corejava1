package images;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
 * <applet code="image_drawing" width=250 height=250>
 * </applet>
 * 
 */
public class image_drawing extends Applet
{
	int gap=3;
	int mx,my;
	boolean flicker=true;
	Image buffer=null;
	int w,h;
	
	@Override
	public void init() 
	{
		Dimension d=getSize();
		w=d.width;
		h=d.height;
		
		buffer=createImage(w,h);
		addMouseMotionListener(new MouseAdapter() 
		{
			@Override
			public void mouseDragged(MouseEvent arg0) 
			{
				mx=arg0.getX();
				my=arg0.getY();
				flicker=false;
				repaint();
			}
			
			
			@Override
			public void mouseMoved(MouseEvent arg0) 
			{
				mx=arg0.getX();
				my=arg0.getY();
				flicker=true;
				repaint();
			}
		});
	}
	
	
	@Override
	public void paint(Graphics g) 
	{
		Graphics screengc=null;
		if(!flicker){
			screengc=g;
			g=buffer.getGraphics();
		}
		
		g.setColor(Color.BLUE);
		g.fillRect(0,0,w,h);
		g.setColor(Color.RED);
		
		for(int i=0;i<w;i+=gap)
			g.drawLine(i,0,w-1,h);
		for(int i=0;i<h;i+=gap)
			g.drawLine(0,i,w,h-1);
		
		g.setColor(Color.BLACK);
		g.drawString("Press Mouse Button to double Buffer",10,h/2);
		g.setColor(Color.YELLOW);
		g.fillOval(mx-gap,my-gap,gap*2+1,gap*2+1);
		
		if(!flicker)
			screengc.drawImage(buffer,0,0,null);
		
		
		
		
		
	}
	
	
	@Override
	public void update(Graphics arg0) {
		paint(arg0);
	}
	
}
