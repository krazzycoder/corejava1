package img_Processing;

import java.applet.Applet;
import java.awt.Image;
import java.awt.image.FilteredImageSource;
import java.awt.image.RGBImageFilter;

public class GrayScale extends RGBImageFilter implements PlugInFilter
{

	@Override
	public Image filter(Applet applet, Image image) 
	{
		return applet.createImage(new FilteredImageSource(image.getSource(),this));
	}

	@Override
	public int filterRGB(int x, int y, int rgb) 
	{
		int r=(rgb >> 16) & 0xff;
		int g=(rgb >> 8) & 0xff;
		int b=(rgb) & 0xff;
		int k=(int )(0.56*g+0.33*r+0.11*b);
		return (0xff000000|k<<16|k<<8|k);
	
	}
	
}
