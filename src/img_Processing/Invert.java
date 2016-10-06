package img_Processing;

import java.applet.Applet;
import java.awt.Image;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;

public class Invert extends RGBImageFilter implements PlugInFilter
{

	@Override
	public Image filter(Applet applet, Image image) 
	{
		return applet.createImage(new FilteredImageSource(image.getSource(),this));
	}

	@Override
	public int filterRGB(int x, int y, int rgb) 
	{
		int r=0xff-(rgb>>16) & 0xff;
		int g=0xff-(rgb>>8) & 0xff;
		int b=0xff-(rgb & 0xff);
		return (0xff000000|r<<16|g<<8|b);
	}

}
