package gui.layout;
import java.awt.*;

public class LoginForm2 {
	public static void main(String[] args) {
		//이 디자인에 사용될 컴포넌트들을 우선 선언...
		Frame frame=null;
		Panel p_center=null;
		Panel p_south=null;
		Label la_id=null;
		Label la_pwd=null;
		TextField t_id=null;
		TextField t_pwd=null;
		Button bt_login=null;
		Button bt_join=null;
		
		//생성 
		frame = new Frame("Login Form");
		p_center = new Panel();
		p_south = new Panel();
		la_id = new Label("ID");
		la_pwd = new Label("Password");
		t_id = new TextField(20);//생성자의 초기 글자수 너비 
		t_pwd = new TextField(20);
		bt_login= new Button("Login");
		bt_join= new Button("Join");
		
		//크기설정 
		/*
		처음 보는 객체에 대한 대처법 
		1) 객체명으로 기능을 예측하자, 예측이 안되면 조사하자
		2) 사용하기 위해 메모리 올리는 법을 파악(객체의 유형은 3가지)
		     - 일반클래스: new 생성자() 
			 - 추상클래스 : 자식으로 구현한 후 자식을 new 생성자()
			 - 인터페이스 : 자식으로 구현한 후 자식을 new 생성자()
		*/
		Dimension d=new Dimension(100, 25);
		
		la_id.	setPreferredSize(d);
		t_id.	setPreferredSize(d);
		la_pwd.setPreferredSize(d);
		t_pwd.setPreferredSize(d);
		
		//조립 
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pwd);
		p_center.add(t_pwd);
		
		//중앙 패널을 윈도우에 부착 
		frame.add(p_center);
		
		p_south.add(bt_login);
		p_south.add(bt_join);
		frame.add(p_south, BorderLayout.SOUTH);
		
		//윈도우 설정
		frame.setSize(300, 135);
		frame.setVisible(true);
	}
}
