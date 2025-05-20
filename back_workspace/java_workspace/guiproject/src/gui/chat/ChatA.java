package gui.chat;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Color;

public class ChatA extends Frame{
	TextArea area;
	Panel p_south;
	TextField t_input;
	Button bt_open;
	
	public ChatA(){
		area= new TextArea();
		p_south = new Panel();
		t_input = new TextField(30);
		bt_open = new Button("열기");
		
		//스타일
		area.setBackground(Color.YELLOW);
		
		add(area);
		p_south.add(t_input);
		p_south.add(bt_open);
		add(p_south, BorderLayout.SOUTH);
		
		setSize(300,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChatA();
	}
}
