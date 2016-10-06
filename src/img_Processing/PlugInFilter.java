package img_Processing;

import java.applet.Applet;
import java.awt.Image;

public interface PlugInFilter 
{
  Image filter(Applet applet,Image image);
}
