package loop;

public class Ex01 {
	public static void main(String[] args) {
		// for : 일정 횟수만큼 반복하여 코드를 수행하기 위해 사용한다.
		// 여기서 일정 횟수는 직접 지정할 수도 있고, 특정 배열 및 걸렉션 요소의 길이만큼
		// 다시 말해 변수의 개수만큼 반복하여 사용할 수도 있다.
		
		// 내부 요소가 여러개 있고, 그 여러개의 요소만큼 반복 돌릴 수 있는 형태를
		// iterable 하고 라고 표현한다.
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello");
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		// 1) 지역변수 :  함수의 {} 및 제어문의 {}안에서 선언된 변수는
		//	  해당 지역 내에서만 유효하다
		// 	  {} 블럭을 벗어나면 참조할 수 없고, 같은 이름의 새로운 변수를 생성할 수도 있다.
		
		
		int num1 = 5;			// => main 함수 안에서 선언된 변수. (1)
		
		if(num1 > 2) {
			int num2 = 3;			// 변수의 선언 위치에 따라 유효범위가 달라진다.  => if문 안에서 선언된 변수.(2)
 			num1 += num2;
		}
		System.out.println("num1 : " + num1); // (1')
//		System.out.println("num2 : " + num2); // if가 종료되면서 num2도 소멸한다. (2')
		// num2 cannot be resolved to a variable.
		
//		System.out.println("i :" + i);
//		지역 변수 특성		
		
		
		int num2 = 1234; // 잘된다
		System.out.println(num2);	//지역변수는 갈색
		
		test ob = new test();
		System.out.println(ob.n1); 	// 클래스의 멤버필드는 파란색
		
		// 반복문이 끝난 후에도 값을 남겨서 참조하고 싶다면
		// 해당 변수의 선언문을 반복문 이전에 작성해야 한다.
		
		int sum = 0; 							// for문 밖. 즉 메인에서 선언되어야 한다.
		for(int i = 0; i <= 100; i++) {			// i는 for문에서 사용되고 {} 밖으로 나왔을때 소멸된다.
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		
	}

}

class test{
	int n1 = 10;	// 클래스 영역에서 선언되고
	int n2 = 20;	// 클래스를 이용한 객체에서 참조가 가능한 변수 (필드)
}