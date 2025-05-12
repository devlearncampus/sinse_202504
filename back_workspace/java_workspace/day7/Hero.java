public class Hero {
	int hp=10;
	boolean fly=false;
	String name="수퍼마리오";
	Bullet bullet;
	
	//멤버변수 hp 값을 변경하고 싶다 
	public void setHp(int hp) {
		this.hp=hp;
	}
	
	//멤버변수 fly 값을 변경하고 싶다
	public void setFly(boolean fly) {
		this.fly=fly;
	}
	
	//멤버변수 name 값을 변경하고 싶다		
	public void setName(String name) {
		this.name=name;	
	}
	
	//멤버변수 bullet 을 다른 무기로 변경하고 싶다
	public void fire(Bullet bullet){
		this.bullet=bullet;
	}

	public static void main(String[] args) {
		Hero hero = new Hero();
		hero.setHp(7);
		hero.setFly(true);
		hero.setName("merry");
		hero.fire(new Bullet());		
	}	
}
