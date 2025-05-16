package instrument;

public class Drum extends MusicTool{
	//컴파일이 성공되려면, 부모의 불완전한 메서드를 재정의해야함
	public void setVolume(){
		System.out.println("드럼의 소리를 높여요");
	}
}
