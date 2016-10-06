package img_Processing;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;

public class LoadedImage extends Canvas
{
	Image image;
    public LoadedImage(Image image) 
    {
		set(image);
	}
    
    
    void set(Image image)
    {
    	MediaTracker mediaTracker=new MediaTracker(this);
    	mediaTracker.addImage(image, 0);
    	try {
			mediaTracker.waitForAll();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
       this.image=image;
       repaint();
    }
    
    @Override
    public void paint(Graphics graphics) 
    {
    	if(image==null)
    	{
    		graphics.drawString("No Image",10,30);
    	}
    	else
    	{
    		graphics.drawImage(image,0,0,this);
    	}
    }
    
    
    @Override
    public Dimension getPreferredSize() 
    {
    	return new Dimension(image.getWidth(this),image.getHeight(this));
    }
    
    @Override
    public Dimension getMinimumSize() 
    {
    	return getPreferredSize();
    }
    
    
    
}
