package use;
/*
객체지향 언어의 장점 
1) 캡슐화 
2) 상속
3) 추상화
*/
public class Account{
	private String num="789-45655-89";
	private String bank="하나은행";
	private String owner="Adams";
	private int balance=500000;
	
	//클래스 작성 시, 데이터를 보호하고 이 보호된 데이터를 외부에서 
	//사용하게 해주려면, 공개된 메서드를 제공해주어야 하는데, 이러한 클래스
	//정의 기법을 가리켜 은닉화,캡슐화=encapsulation
	
	//데이터에 대해 읽기,쓰기가 가능하도록 메서드 정의 
	public int getBalance(){ //get+멤버변수조합 = getter 메서드
		return balance;
	}
	public void setBalace(int balance){//set+멤버변수조합 = setter 메서드 
		this.balance=balance;
	}
	
}
