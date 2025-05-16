package use;

import instrument.Piano;
import instrument.MusicTool;
import instrument.Drum;
import riding.Roller;

//납품을 앞두고 모든 악기에 대해 최종 테스트
public class UseTool{
	public static void main(String[] args) {
		//베이스 볼륨 테스트 
		//Bass bass=new Bass();
		//Trumpet trumpet = new Trumpet();
		//trumpet.setVolume(52);
		
		//오케스트라 협주..모든 악기를한꺼번에 볼륨을 조절
		//각 악기가 보유한 메서드가 무엇인지 알수가 없다..		
		//메서드명의 일관성 부재...각 개발자에게 부탁..
		//기술적으로 개발자들에게 업무규칙 만들어 제제를 가해야함
		//따라서 가이드 라인 제시...
		
		//추상클래스는 인스턴스화 될 수 없다..
		//new MusicTool();	
		//Piano p = new Piano();
		MusicTool p=new Piano();
		p.setVolume();
		
		//인터페이스도 is a 관계로 인정받음, 따라서 형변환 가능
		Roller p2 = new Piano();
		p2.roll();
		
		MusicTool d = new Drum();
		d.setVolume();

	}
}
