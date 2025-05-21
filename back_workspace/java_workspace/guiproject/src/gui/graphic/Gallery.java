package gui.graphic;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Gallery extends JFrame {
	JPanel p_north;
	JButton bt_prev;
	JButton bt_next;
	JLabel la_title;
	JPanel p_center;
	
	public Gallery(){
		p_north = new JPanel();
		bt_prev = new JButton("이전");
		bt_next = new JButton("다음");
		la_title = new JLabel("제목");
		p_center =new JPanel();
		
		//북쪽 패널에 버튼과 라벨 부착
		p_north.add(bt_prev);
		p_north.add(la_title);
		p_north.add(bt_next);
		
		//북쪽 패널을 프레임의 북쪽에 부착
		add(p_north,BorderLayout.NORTH);
		
		//중앙 패널을 프레임의 중앙에 부착
		add(p_center);
		
		//윈도우 크기
		setSize(600,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Gallery();
	}
}
