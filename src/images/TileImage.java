package images;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.util.ArrayList;
import java.util.Collections;

/*
 * <applet code="TileImage" width=500 height=400>
 * <param name="img" value="sample.jpg">
 * </applet>
 */
public class TileImage extends Applet
{
	Image img;
	Image cell[]=new Image[4*4];
	int iw,ih;
	int tw,th;
	ArrayList<Integer> myarrlist=new ArrayList<Integer>();
	
	@Override
	public void init() 
	{
		img=getImage(getCodeBase(),"sample.jpg");
		/*if(img==null)
		{
			System.out.println(getCodeBase()+" #### "+getParameter("img"));
			
		}*/
		MediaTracker mediaTracker=new MediaTracker(this);
		mediaTracker.addImage(img,0);
		try {
			mediaTracker.waitForID(0);
			iw=img.getWidth(null);
			ih=img.getHeight(null);
			
			tw=iw/4;
			th=ih/4;
			CropImageFilter f;
			FilteredImageSource fis;
			mediaTracker=new MediaTracker(this);
			for(int y=0;y<4;y++)
			{
				for(int x=0;x<4;x++)
				{
					f=new CropImageFilter(tw*x,th*y,tw,th);
					fis=new FilteredImageSource(img.getSource(),f);
					int i=y*4+x;
					cell[i]=createImage(fis);
					mediaTracker.addImage(cell[i],i);
				}
			}
			
			mediaTracker.waitForAll();
			for(int i=0;i<cell.length;i++)
			  myarrlist.add(i);
			
			Collections.shuffle(myarrlist);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void paint(Graphics g) 
	{
		for(int x=0;x<4;x++)
		{
			for(int y=0;y<4;y++)
			{
				int counter=4*x+y;
			   	g.drawImage(cell[myarrlist.get(counter)],y*tw,x*th,null);
			}
		}
			
	}
}
