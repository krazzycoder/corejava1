import java.applet.Applet;
import java.awt.Graphics;

public class applet extends Applet 
{
	@Override
	public void paint(Graphics arg0) 
	{
		super.paint(arg0);
		arg0.drawString("A Simple Applet",20,20);
		arg0.drawString("My Second String",100,100);
		
	}
	
}
