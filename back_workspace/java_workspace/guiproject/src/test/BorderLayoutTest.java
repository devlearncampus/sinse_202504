/*
모든 GUI 프로그램은 컴포넌트들을 조합하여 화면을 구성하기 때문에, 
각자의 배치(Layout)방법을 지원한다..
AWT 의 배치방법은 다음과 같다 
1) BorderLayout 
	동,서,남,북,센터의 방위를 갖는 배치 방법
	Frame은 개발자가 아무것도 지정하지 않으면, 디폴트로 BorderLayout적용
	
2) FlowLayout 
3) GridLayout 
*/
package test;

import java.awt.*;

class BorderLayoutTest{
	public static void main(String[] args) {
		/*
		UI 컴포넌트는 다른 컴포넌트를 포함할수있는 능력을 기준으로 2가지 유형
		1) 컨테이너 유형 : 다른 컴포넌트를 포함할 수 있다.. 예) html div,p,...비슷
		                      대표적인 컴포넌트가 바로 윈도우인 Frame
							  배치능력이 있으므로, 여러 유형의 배치관리자를 적용할 수 있다
							  
		2) 비주얼 컴포넌트 : 컨테이너 안에 소속되는 대상 예) 버튼,체크박스,초이스,
		*/
		Frame frame=new Frame();//윈도우 생성
		BorderLayout border=new BorderLayout();
		
		//프레임에 보더배치 적용 
		frame.setLayout(border);
		
		Button bt_east=new Button("동");
		Button bt_west=new Button("서");
		Button bt_south=new Button("남");
		Button bt_north=new Button("북");
		Button bt_center=new Button("센터");	
		
		frame.add(bt_north, BorderLayout.NORTH);//북쪽에 버튼 부착
		
		frame.add(bt_center); //개발자가 방위를 설정하지 않으면, 센터,중앙이다
		
		frame.setSize(500,450); //윈도우 창 크기 설정
		frame.setVisible(true); //윈도우 보이게
	}
}
