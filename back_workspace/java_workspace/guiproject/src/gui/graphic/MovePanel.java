package gui.graphic;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MovePanel extends JPanel{
	
	//JPanel의 paint() 메서드를 오버라이딩
	public void paint(Graphics g){
		//채워진 원 그리기 
		g.setColor(Color.RED);
		g.fillOval(50,50, 45,45);
	}	
}


