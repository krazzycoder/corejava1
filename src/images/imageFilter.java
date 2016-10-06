package images;

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
		//add(,BorderLayout.CENTER);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
	}
	
	@Override
	public void paint(Graphics arg0) 
	{
		
	}

	
}
