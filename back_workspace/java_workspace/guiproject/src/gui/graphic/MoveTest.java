package gui.graphic;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoveTest extends JFrame implements ActionListener{
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
	
		bt.addActionListener(this);//버튼과 리스너 연결 
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 600,650);
		setVisible(true);
	}	
	
	public void actionPerformed(ActionEvent e){
		//MovePanel의 빨간색 원을 이동시키자..
		p_center.move();
		p_center.repaint();//다시 그려줘!!!! 주의- 절대 paint(Graphics) 호출 금지
		
		/*
		int x = p_center.getX();	
		x++;
		p_center.setX(x);		
		
		int y=p_center.getY();
		y++;
		p_center.setY(y);
		*/
	}
	
	public static void main(String[] args) {
		new MoveTest();
	}
}
