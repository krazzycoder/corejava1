package img_Processing;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;

/*
 * <applet code="imageFilter" width=500 height=400>
 * </applet>
 */
public class imageFilter extends Applet implements ActionListener
{
	Image img;
	Button reset;
	String filters="GrayScale+Invert+Contrast+Blur+Sharpen";
	Label label;
	LoadedImage loadImage;
	PlugInFilter pluginfilter=null;
	Image fim;
	
	
	@Override
	public void init() 
	{
		setLayout(new BorderLayout());
		Panel panel=new Panel();
		add(panel,BorderLayout.SOUTH);
		reset=new Button("Reset");
		reset.addActionListener(this);
		panel.add(reset);
		StringTokenizer tokenizer=new StringTokenizer(filters,"+");
		while(tokenizer.hasMoreTokens())
		{
			Button b=new Button(tokenizer.nextToken());
			b.addActionListener(this);
			panel.add(b);
		}
		
		label=new Label("");
		add(label,BorderLayout.NORTH);
		img=getImage(getCodeBase(),"sample.jpg");
		loadImage=new LoadedImage(img);
		add(loadImage,BorderLayout.CENTER);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		String a="";
		a=arg0.getActionCommand();
		   if(a.equals("Reset"))
			{
				loadImage.set(img);
				label.setText("Normal");
			}
		   else
		   {
			   try {
				pluginfilter=(PlugInFilter)Class.forName("img_Processing."+a).newInstance();
				fim=pluginfilter.filter(this, img);
				loadImage.set(fim);
				label.setText("Filtered: "+a);
				
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
			   repaint();
			   
		   }
		
	}
	
	

	
}
