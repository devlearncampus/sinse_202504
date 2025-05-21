/*
AWT는 자바의 초창기 GUI패키지임은 맞지만, os마다 다른 
디자인으로 실행되었다.. mac-맥에맞게, win-윈도우os
swing 은 os 즉 플랫폼에 상관없는 중립적인 Look&Feel 디자인을
유지 한다...요즘은 swing처럼 os 어울리지 않는 java에 최적화
디자인을 지양함..따라서 javaFX가 지원됨..
swing 은 기존의 awt를 계승했기 때문에 우리가 사용해왔던
awt 컴포넌트 명에 J접두어만 붙는다..
*/
package gui.swing;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyWin extends JFrame implements ActionListener{
	JTextArea area;
	JPanel p_south;
	JButton bt;
	
	public MyWin(){
		area = new JTextArea(4,15);//행,열
		p_south = new JPanel();
		bt = new JButton("환경설정");
		
		//area에 배경 
		area.setBackground(Color.YELLOW);
		
		add(area); //센터에 부착 
		p_south.add(bt);//남쪽 패널에 버튼 부착
		add(p_south, BorderLayout.SOUTH);//남쪽에 패널 부착
		
		bt.addActionListener(this);
		//setSize(300,400);	
		setBounds(2000, 100, 300, 400);
		setVisible(true);
	}
	
	//부모의 메서드 오버라이딩 
	public void actionPerformed(ActionEvent e){
		System.out.println("눌렀어?");
		//this란? 인스턴스가 자가 자신을 가리키는 레퍼런스 변수명이다
		// 개발자가 마음대로 정한 이름이 아니라, 시스템에서 정해놓은 레퍼런스 변수명
		new Config(this);
	}
	
	public static void main(String[] args) {
		new MyWin();
	}
}
