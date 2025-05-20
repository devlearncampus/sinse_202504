package gui.layout;

//JoinForm은 extends 를 선언하는 순간부터 is a 관계에 의해서
//곧 Frame 되어버림..따라서 JoinForm을 대상으로 new 하면 , 윈도우가
//생성되는 것이다..
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Color;

class JoinForm extends Frame{
	//필요한 재료들을 has a 관계로 보유하자 
	Label la_title; //회원가입 제목
	Panel p_center;
	Label la_id;  //아이디 제목
	TextField t_id;//아이디입력 텍스트박스
	Label la_password; 
	TextField t_password;
	Label la_name;
	TextField t_name;
	Panel p_south;
	Button bt_login;
	Button bt_join;
		
	public JoinForm(){	
		la_title =new Label("회원가입");
		p_center = new Panel();
		la_id = new Label("ID");
		t_id = new TextField();
		la_password = new Label("Password");
		t_password = new TextField();
		la_name= new Label("Name");
		t_name = new TextField();
		p_south = new Panel();
		bt_login = new Button("Login");
		bt_join = new Button("Join");
		
		//스타일 적용 
		la_title.setBackground(Color.YELLOW);
		
		
		
		//조립 
		//제목을 북쪽에 부착 
		add(la_title, BorderLayout.NORTH);
		
		//센터 영역 
		Dimension d = new Dimension(110, 25);
		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_password.setPreferredSize(d);
		t_password.setPreferredSize(d);
		la_name.setPreferredSize(d);
		t_name.setPreferredSize(d);
		
		//센터 영역의 패널에 컴포넌트들 부착 
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_password);
		p_center.add(t_password);
		p_center.add(la_name);
		p_center.add(t_name);
		
		//패널을 센터 영역에 부착 
		add(p_center);
		
		//남쪽 처리 
		
		p_south.add(bt_login);
		p_south.add(bt_join);
		
		add(p_south, BorderLayout.SOUTH); //남쪽에 패널 부착 
		
		setSize(300, 200);	
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JoinForm();
	}
}
