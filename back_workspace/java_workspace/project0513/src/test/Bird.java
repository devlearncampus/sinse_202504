package test;

public class Bird{
	String name="난 새";
	int age=3;
	
	/** 
	새를 잠을 재우고싶으면 이 메서드 호출
	*/
	public void sleep(){
		System.out.println("잠을 자요");
	}
	/**
	새의 먹이를 주세요
	*/
	public void eat(){
		System.out.println("밥을 먹어요");
	}
}
