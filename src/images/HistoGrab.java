package images;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.PixelGrabber;


/*
 * <applet code="HistoGrab" width=500 height=1400>
 * <param name="img" value="sample.jpg">
 * </applet>
 */
public class HistoGrab extends Applet
{
	Dimension d;
	Image img;
	int iw,ih;
	int pixels[];
	int w,h;
	int hist[]=new int[256];
	int max_hist=0;
	
	@Override
	public void init()
	{
		d=getSize();
		w=d.width;
		h=d.height;
		
		img=getImage(getCodeBase(),"sample.jpg");
		/*System.out.println(""+getCodeBase());
		if(img==null)
		{
			System.out.println(""+getCodeBase());
			System.out.println(""+getParameter("img"));
			System.out.println("Image instance is NULL ");
			System.exit(0);
		}*/
		
		MediaTracker t=new MediaTracker(this);
		t.addImage(img,0);
		try {
			t.waitForID(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		iw=img.getWidth(null);
		ih=img.getHeight(null);
		pixels=new int[iw*ih];
		PixelGrabber pg=new PixelGrabber(img,0,0,iw,ih,pixels,0,iw);
		try {
			pg.grabPixels();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<iw*ih;i++){
			int p=pixels[i];
			int r=0xff& (p>>16);
			int g=0xff& (p>>8);
			int b=0xff& (p);
			
			int y=(int )(0.33 *r +0.56 *g+ 0.11*b);
			hist[y]++;
		}
		
		for(int i=0;i<256;i++){
			if(hist[i]>max_hist)
				max_hist=hist[i];
		}
		
		
	}
	
	@Override
	public void update(Graphics arg0) 
	{
		
	}
	
	@Override
	public void paint(Graphics g) 
	{
		g.drawImage(img,0,0,null);
		int x=(w-256)/2;
		int lasty=h-h*hist[0]/max_hist;
		
		
		for(int i=0;i<256;i++)
		{
			int y=h-h*hist[i]/max_hist;
			g.setColor(new Color(i,i,i));
			g.fillRect(x,y,i,h);
			g.setColor(Color.RED);
			g.drawLine(x-1, lasty,x,y);
			lasty=y;
		}
	}
}
