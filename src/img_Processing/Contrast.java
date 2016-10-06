package img_Processing;

import java.applet.Applet;
import java.awt.Image;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;

public class Contrast extends RGBImageFilter implements PlugInFilter
{
   double gain=1.2;
   
	@Override
	public Image filter(Applet applet, Image image) 
	{
		return applet.createImage(new FilteredImageSource(image.getSource(),this));
	}

	private int multclamp(int in, double factor)
	{
		in=(int)(in*factor);
		return in>255?255:in;
	}
	
	private int con(int in)
	{
		return (in<128)?(int)(in/gain): multclamp(in,gain);
	}
	
	@Override
	public int filterRGB(int x, int y, int rgb) 
	{
		int r=con((rgb>>16) & 0xff);
		int g=con((rgb>>8) & 0xff);
		int b=con((rgb & 0xff));
		
		return (0xff000000|r<<16|g<<8|b);
	}

}
