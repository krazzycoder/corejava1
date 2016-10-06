package applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.net.MalformedURLException;
import java.net.URL;

/*
  <applet code="applet_redirect" width=300 height=50>
  </applet>
  */
public class applet_redirect extends Applet
{
	@Override
	public void start()
	{
		AppletContext context=getAppletContext();
		URL url=getCodeBase();
		
		try {
			context.showDocument(new URL(url+"index.html"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			showStatus("URL not found!!");
		}
	}
}
