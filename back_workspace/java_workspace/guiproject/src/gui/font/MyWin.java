package gui.font;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWin extends Frame implements ActionListener{
	TextArea area;
	Panel panel;
	Button bt;  
	FontConfig fontConfig;
	
	public MyWin(){
		area = new TextArea();
		panel = new Panel();
		bt = new Button("서식 설정");
		
		add(area);
		panel.add(bt);
		add(panel, BorderLayout.SOUTH);
		
		bt.addActionListener(this);
		
		setSize(300,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		fontConfig = new FontConfig(this);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}
}
