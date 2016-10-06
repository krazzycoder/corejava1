package images;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.util.StringTokenizer;

/*
 * <applet code="mediaTracker" width=300 height=400>
 * <param name="img" value="myimage">
 * </applet>
 * 
 * */

public class mediaTracker extends Applet implements Runnable
{
	MediaTracker tracker;
	int tracked;
	int current_img=0;
	int frame_rate=5;
	Thread motor;
	static final int MAXIMAGE=10;
	Image img[]=new Image[MAXIMAGE];
	String name[]=new String[MAXIMAGE];		
	volatile boolean stopFlag;

	@Override
	public void init() 
	{
		tracker=new MediaTracker(this);
		StringTokenizer st=new StringTokenizer(getParameter("img"),"+");
		while(st.hasMoreTokens()&&tracked<=MAXIMAGE)
		{
			name[tracked]=st.nextToken();
			img[tracked]=getImage(getDocumentBase(),name[tracked]+".jpg");
			tracker.addImage(img[tracked],tracked);
			tracked++;
		}
	}
	
	
	@Override
	public void paint(Graphics arg0) 
	{
		String loaded="";
		int donecount=0;
		
		for(int i=0;i<tracked;i++){
			if(tracker.checkID(i,true))
			{
				donecount++;
				loaded+=name[i]+" ";
			}
		}
		
	Dimension d=getSize();
	int w=d.width;
	int h=d.height;
	
	if(donecount==tracked){
		frame_rate=1;
		Image i=img[current_img++];
		int iw=i.getWidth(null);
		int ih=i.getHeight(null);
	    //arg0.drawImag
		
	}
		
		
	}
	
	
	
	@Override
	public void run() 
	{
		
	}

}
