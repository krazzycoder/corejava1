package images;

import java.applet.Applet;

/*
 * <applet code="applet_param_Demo" width=400 height=300>
 * <param name=fontname value="myfont">
 * <param name=fonttype value="monotype corsiva">
 * </applet>
 */
public class applet_param_Demo extends Applet
{
	@Override
	public void init() 
	{
		try
		{
			String filename=getParameter("fontname");
			String fonttype=getParameter("Monotype Corsiva");
			System.out.println("Filename: "+filename);
			System.out.println("FontType: "+fonttype);
		}
		catch(Exception e)
		{
			System.err.println("NullPointerException");
		}
		
	}
}
