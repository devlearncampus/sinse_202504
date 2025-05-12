/*다른 클래스를 사용하기 위한 클래스이므로, 실행부 정의하자*/
package use;//개발자가 패키지를 선언하면 javac -d 옵션사용 시
					//선언한 패키지에 해당하는 디렉토리 자동 생성해준다...
import animal.Dog; //classpath 환경변수를 기준으로.. 그 밑의 animail 밑의
							//Dog.class를 임포트 한다!!
class UseDog {
	public static void main(String[] args) {
		Dog d= new Dog();
		d.bark();
	}
}
