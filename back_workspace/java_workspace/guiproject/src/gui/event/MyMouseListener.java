package gui.event;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MyMouseListener implements MouseListener{
	public void mouseClicked(MouseEvent e){
		System.out.println("mouseClicked 호출");
	}
	public void mouseEntered(MouseEvent e){
		System.out.println("mouseEntered 호출");
	}
	public void mouseExited(MouseEvent e){
		System.out.println("mouseExited 호출");
	}
	public void mousePressed(MouseEvent e){
		System.out.println("mousePressed 호출");
	}
	public void mouseReleased(MouseEvent e){
		System.out.println("mouseReleased 호출");
	}
	
	
}
