package gui.event;

import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import gui.event.day0520.MyActionListener;

class DoubleButton {
	public static void main(String[] args) {
		Frame frame=null;
		Button bt1=null;
		Button bt2=null;
		
		frame = new Frame();
		bt1= new Button("A");
		bt2= new Button("B");
		
		frame.setLayout(new FlowLayout());//플로우 배치 적용
		frame.add(bt1);
		frame.add(bt2);
		
		MyActionListener my=new MyActionListener(bt1,bt2);
		//my.setBtn(bt1, bt2);
		
		bt1.addActionListener(my);//버튼1과 리스너연결 
		bt2.addActionListener(my);//버튼2와 리스너연결 
		
		frame.setSize(300,400);
		frame.setVisible(true);
	}
}
