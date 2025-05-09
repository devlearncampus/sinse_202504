class LocalArea{
	int k;
	
	//자바의 생성자는 클래스명과 완전 똑같아야 함..
	public LocalArea(){
		k=9;
	}

	{		
		//인스턴스 초기화 영역은 해당 클래스로부터 인스턴스를 생성할때마다
		//실행되는 영역을 말함..따라서 new LocalArea() 때 이 영역을 건드
		//리게 됨..개발 시 거의 보기 힘들다..왜?? 생성자가 이미 객체의 변수들을 초기화 하는 역할을
		//하기 거의 다 생성자로 초기화한다..
		System.out.println("인스턴스 생성했지?");
		k=7;
	}
	
	public static void main(String[] args){
		new LocalArea();
		new LocalArea();
		new LocalArea();
		new LocalArea();
		new LocalArea();
		
		
		//int x=8;
		{
			int x=5;	
		}		
		//x=7;
	}
	
}
