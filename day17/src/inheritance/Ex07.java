package inheritance;

class Car {
	int speed;
	int min;
	int max;
	int perTic = 5;
	
	public Car() {
		this.min = 30;
		this.max = 50;
	}
	void drive() {
		System.out.println("출발 !!");
		speed = min;
		while(speed != max) {
			System.out.println("현재 속도 : " + speed);
			speed += perTic;
			
		}
		while(speed >= 0) {
			System.out.println("현재 속도 : " + speed);
			speed -= perTic;
		}
		System.out.println("정지 !!\n");
	}
}
class RaceCar extends Car {
	public RaceCar(int min, int max, int perTic) {
		super();
		// 상속받아서 가지고 있으면 필드도 내것 (this로 참조할 수 있다.)
		this.min = min;		// 만약 getter/setter를 적용한 제한적인 정보라면 this.setMin(min); 로 작성해야 한다. 즉 setter를 이용해 set값만 바꿈 
		
		// 슈퍼클래스에서 private을 걸지 않았다면 super로 참조할 수 있다.
		this.max = max;
		this.perTic = perTic;
	}
}

// Car를 상속받는 RaceCar 클래스를 작성하세요
// 생성자에서 min, max, perTic을 전달받고록 처리하세요

public class Ex07 {
	public static void main(String[] args) {
		Car ob1 = new Car();
		ob1.drive();
		
		RaceCar ob2 = new RaceCar(80, 100, 10);
		// 80에서 시작해서 10씩 증감하면, 100이되면 감소하기 시작하여 0에서 정지하는 코드
		ob2.drive();
		// 자바의 상속은 단일상속만 가능하다
		// 자바의 서브클래스는 오직 하나의 슈퍼클래스만 가진다
		// 단, 슈퍼클래스가 또다른 슈퍼클래스를 가지면 연이어 상속받는다.
		
		// 내가 만든적 없는 메서드가 호출된다.
		// 슈퍼클래스를 지정하지 않아도, 자동으로 상속되는 클래스가 있다.
		// 자바 모든 클래스의 최상위 클래스 : Object
		System.out.println(ob1.getClass().getSimpleName());
	}
	

}
