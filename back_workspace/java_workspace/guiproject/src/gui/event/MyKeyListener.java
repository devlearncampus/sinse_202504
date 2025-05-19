package gui.event;

/*OS를 거쳐 JVM으로부터 전달되는 키보드 이벤트를 청취하기
위한 객체인 KeyListener를 재정의해보자*/
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MyKeyListener implements KeyListener{
	// KeyListener 가 보유한 추상메서드를 재정의 {} 붙여놓자..
	
	//키보드 눌렀다 뗄때
	public void keyReleased(KeyEvent e){
		System.out.println("눌렀다가 떼었어??");
	}
	
	public void keyTyped(KeyEvent e){}
	
	public void keyPressed(KeyEvent e){
		System.out.println("눌렀어??");
	}
}
