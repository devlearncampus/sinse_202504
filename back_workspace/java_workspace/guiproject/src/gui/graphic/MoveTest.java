package gui.graphic;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class MoveTest extends JFrame{
	JPanel p_north;
	JButton bt;
	MovePanel p_center;
	
	public MoveTest(){
		p_north = new JPanel();
		bt = new JButton("이동");
		p_center = new MovePanel();
		
		p_north.add(bt);
		add(p_north, BorderLayout.NORTH);
		add(p_center);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(2000, 0, 600,650);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MoveTest();
	}
}
