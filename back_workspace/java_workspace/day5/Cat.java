/*JVM도 프로그램이므로, OS로 부터 메모리를 할당받으면, 해당 메모리를
3개의 영역으로 나누어서 관리한다 
1) method : 클래스 바이트 코드가 로드 되는 영역 
				로드 시점은 실행할때(java.exe) 이다.
2) stack : 모든 지역변수
				- 메서드내에 선언된 지역변수
				- 메서드의 매개변수 
3) heap : 객체의 인스턴스가 올라오는 영역 				
*/
class Cat{
	String name="tomcat";
	int age=5;
	
	public int getAge(){
		return age;
	}
	public static void main(String[] args){	
		int x=7;
		Cat c = new Cat();
		System.out.println(c.getAge());
	}
}
