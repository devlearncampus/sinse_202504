package use;

class ModifierStudy{
	public static void main(String[] args){
		/* 
		java의 수식자의 종류 
		1) static - 정적인 , 변수에 적용하면 클래스변수
								  메서드에 적용하면 클래스 메서드 
		2) final	 - 마지막,  변수에 붙이면 변수에 값을 변경할 수 없게됨
								  메서드에 붙이면, 자식이 부모의 메서드를
								  재정의할 수 없음(오버라이딩..)
		3) abstract - 
		*/	
		final int x=5;
		x=8;
	}
}
