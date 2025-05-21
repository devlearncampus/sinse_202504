package gui.font;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FontConfig extends Frame implements ActionListener{
	Panel p_center;
	TextField t_size;
	TextField t_color;
	Button bt;
	MyWin myWin;
	
	public FontConfig(MyWin myWin){
		p_center = new Panel();
		t_size = new TextField(20);
		t_color = new TextField(20);
		bt= new Button("적용하기");
		this.myWin=myWin;
		
		Dimension d= new Dimension(250,55);
		t_size.setPreferredSize(d);
		t_color.setPreferredSize(d);
		
		p_center.add(t_size);
		p_center.add(t_color);
		p_center.add(bt);
		
		add(p_center);
		
		bt.addActionListener(this);
		
		setSize(250,180);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		myWin.area.setFont(new Font(null, -1, 40));	
		myWin.area
	}
}


