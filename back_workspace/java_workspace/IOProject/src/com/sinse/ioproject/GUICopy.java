package com.sinse.ioproject;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUICopy extends JFrame{
	JLabel la_ori, la_dest;
	JTextField t_ori, t_dest;
	JButton bt_ori, bt_dest,bt_copy;

	public GUICopy() {
		
		la_ori = new JLabel("원본");
		la_dest = new JLabel("복사본");
		t_ori = new JTextField();
		t_dest = new JTextField();
		bt_ori = new JButton("열기");
		bt_dest = new JButton("저장");
		bt_copy = new JButton("복사");
		
		Dimension d =new Dimension(100, 24); //라벨, 버튼에 적용할 크기
		Dimension d2 =new Dimension(330, 24); //텍스트 필드에 적용할 크기 
		
		la_ori.setPreferredSize(d);
		la_dest.setPreferredSize(d);
		
		t_ori.setPreferredSize(d2);
		t_dest.setPreferredSize(d2);
		
		bt_ori.setPreferredSize(d);
		bt_dest.setPreferredSize(d);
		
		setLayout(new FlowLayout());
		
		add(la_ori);
		add(t_ori);
		add(bt_ori);
		add(la_dest);
		add(t_dest);
		add(bt_dest);
		add(bt_copy);
		
		setSize(580, 130);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GUICopy();
	}
}






