/*
모든 GUI 프로그래밍에서, ui 컴포넌트에 대한 이벤트가 발생했을때
제일 먼저 이벤트를 감지하는 주체는 사실 해당 OS이다..
os는 자신이 감지한 이벤트에 대해 정보 객체를 만든 후, 이 정보를
해당 프로그램에 전달해준다..이때 해당 프로그램은 os가 전달한 
이벤트 정보에 대해 1:1 대응되는 객체를 인스턴스화시켜 메모리에
올리고, 이 인스턴스를 해당 프로그램으로 전달하게 됨..
*/
package gui.event;
//Action이벤트만을 청취할 수 있는 청취자인 ActionListener를 
//현재 이 클래스에서완성할 것을 선언(implements)
//인터페이스 구현을 선언하면 언제나 자식 클래스는 구현 강제를 강요받음
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyActionListener implements ActionListener{
											/* is a */
	//부모인 ActionListener의 메서드 오버라이딩..
	public void actionPerformed(ActionEvent e){
		//개발자는 액션 이벤트가 발생했을때, 처리할 로직을 여기에 작성...
		//addEventListener("click", function(){
		// js에서의 익명함수 영역과 동일하다고 보면 됨..	
		//});
		System.out.println("나 눌렀어?");
	}
}
