/*자동차 클래스로부터 인스턴스 1개를 생성하여
자동차의 핸들의 색상, 바퀴의 브랜드명, 
문짝의 열기기능을 호출..
*/
package use;
public class UseCar{
	public static void main(String[] args) {
		//본체만 생성한 것일뿐, has a관계의
		//부품들은 아직도 생성안된 상태..
		Car car = new Car();
		/*
		car.handle=new Handle();	
		car.wheel= new Wheel();
		car.door= new Door();
		*/
		System.out.println(car.handle.color);
		System.out.println(car.wheel.brand);
		car.door.open();
	}
}
