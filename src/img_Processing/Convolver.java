package img_Processing;

import java.applet.Applet;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.MemoryImageSource;
import java.util.Hashtable;

abstract class Convolver implements ImageConsumer, PlugInFilter
{
   int width,height;
   int imgpixel[],newimgpixels[];
   boolean imageReady=false;
   
   abstract void Convolve();
    @Override
    public Image filter(Applet applet, Image image)
    {
		imageReady=true;
		image.getSource().startProduction(this);
		
		waitForImage();
		
		try{
		Convolve();
		}
		catch(Exception exception)
		{
		  exception.printStackTrace();	
		}
		
		return applet.createImage(new MemoryImageSource(width,height,newimgpixels,0, width));
	}
    
    synchronized void waitForImage()
    {
    	try
    	{
    		while(!imageReady)
    			wait();
    	}
    	catch(Exception exception)
    	{
    		System.out.println("Interrupted");
    	}
    }
    
    public void setProperties(Hashtable<?,?> dummy){}
    public void setColorModel(ColorModel dummy){}
    public void setHints(int dummy){}
    
    
    
}
