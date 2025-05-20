package gui.chat;

import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

class MyFrame extends Frame{
						/*is a*/
	Button bt1;
	Button bt2;
	
	public MyFrame(){
		bt1=new Button();
		bt2=new Button();	
		
		//부착 
		add(bt1, BorderLayout.NORTH);//add메서드에는 컴포넌트 형이면 다 들어갈 수 있다..
		//api 찾아보니, button은 컴포넌트의 자식이므로, add() 에 들어갈 수 있다..
		add(bt2, BorderLayout.SOUTH);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new MyFrame();	
		
	}	
}
