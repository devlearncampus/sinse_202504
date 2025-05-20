import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FontConfig extends Frame{
	Panel p_center;
	TextField t_size;
	TextField t_color;
	Button bt;
	
	public FontConfig(){
		p_center = new Panel();
		t_size = new TextField(20);
		t_color = new TextField(20);
		bt= new Button("적용하기");
		
		Dimension d= new Dimension(250,55);
		t_size.setPreferredSize(d);
		t_color.setPreferredSize(d);
		
	}
}
