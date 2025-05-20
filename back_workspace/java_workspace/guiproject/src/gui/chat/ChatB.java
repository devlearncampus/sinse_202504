package gui.chat;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;

public class ChatB extends Frame{
	TextArea area;
	Panel p_south;
	TextField t_input;

	public ChatB(){
		area= new TextArea();
		p_south = new Panel();
		t_input = new TextField(40);
		
		//스타일
		area.setBackground(Color.YELLOW);
		
		add(area);
		p_south.add(t_input);
		add(p_south, BorderLayout.SOUTH);
		
		setSize(300,400);
		setVisible(true);
	}

}
