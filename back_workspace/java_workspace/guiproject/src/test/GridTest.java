package test;
/*
GridLayout : 행과 열(층수 호수)을 지원하는 배치방법 					
*/
import java.awt.*;
public class GridTest{
	public static void main(String[] args){
		Frame f = new Frame("그리드 배치");
		f.setLayout(new GridLayout(3,4));	
		
		for(int i=0;i<3;i++){ //층수
			for(int a=0;a<4;a++){//호수
				Button bt=new Button(i+"층 "+a+"호");
				
				//Color 클래스가 보유한 YELLOW 상수(static)
				bt.setBackground(Color.YELLOW);
				f.add(bt);
			}
		}
		
		f.setSize(300,400);
		f.setVisible(true);
	}
}
