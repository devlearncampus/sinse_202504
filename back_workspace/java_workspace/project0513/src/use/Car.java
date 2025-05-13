/*
최대한, 현실을 반영하여 자동차를 정의해보자
조건1) 자동차의 핸들이 있어야함 
조건2) 자동차의 바퀴도 있어야 함 
조건3) 자동차의 문짝도 있어야 함 
*/
package use;
public class Car{
	int price; //0
	String name; //null
	//객체가 다른 객체를 멤버변수로 보유한 관계를 has a 관계라 한다..
	Handle handle; //null has a 관계  Car has a Handle
	Wheel wheel; //null Car has a Wheel
	Door door; //null Car has a Door
	
	//생성자는 사물을 태어나게 하는 시점에, 초기화에 관여하므로 
	//특히 has a 관계에 있는 객체의 인스턴스를 생성할때 아주 유용함
	public Car(){//js constructor() 동일 목적 
		price=5000;
		name="K9";
		handle = new Handle();
		wheel = new Wheel();
		door = new Door();
	}
}
