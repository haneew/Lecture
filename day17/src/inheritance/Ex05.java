package inheritance;

class Parent5{	// 두 정수를 전달받아서, 객체를 생성하고, 덧셈식을 출력하는 클래스
	int n1, n2;
	
	public Parent5(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
		
	}
	public void show() {
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}
}
class Child5 extends Parent5{
	// 생성자를 작성하여 필요한 코드를 작성하세요
	
	// 세 정수를 전달받고, 세 정수의 덧셈식을 출력하는 기능을 오버라이딩하세요. (!!함수 내용 수정!!)
	
	// 세 정수 중 가장 큰 수를 출력하는 함수를 작성하세요(오버라이딩 아님, !!함수 추가!!)
	int n3;
	Child5(int n1, int n2, int n3){
		super(n1, n2);
		this.n3 = n3;
	}
	
	@Override
	public void show() {
		System.out.printf("%d + %d + %d = %d\n", n1, n2, n3 , n1 + n2 + n3);
	}
//	void showMaxNum() {
//		if(n1 > n2 && n1 > n3) {System.out.println(n1);}
//		else if(n2 > n3 && n2 > n1) {System.out.println(n2);}
//		else{System.out.println(n3);}
//	}
	void showMaxNum() {				// 이렇게 간단히 쓰는걸 연습해야함..
		int max = Integer.MIN_VALUE;
		if(max < n1) max = n1;
		if(max < n2) max = n2;
		if(max < n3) max = n3;
		System.out.println("최대값 : " + max);
	}
}

public class Ex05 {
	public static void main(String[] args) {
		Child5 ob = new Child5(12, 57, 82);
		ob.show();
		ob.showMaxNum();
		
		Parent5 ob1 = new Child5(1, 2, 3);
		Child5 ob2 = (Child5) ob1;
		
		System.out.println("ob1 : " + ob1);
		System.out.println("ob2 : " + ob2);
		System.out.println("ob1 == ob2 " + (ob1 == ob2));
		// ob1참조변수와 ob2 참조변수는 동일한 대상을 참조하고 있다.
		
		
		ob2.show();
		ob.showMaxNum();
		
		ob1.show();			// ob1은 슈퍼클래스 타입이지만 오버라이딩 메서드가 실행된다.
//		ob.showMaxNum();	// ob1은 슈퍼클래스 타입이므로, 서브클래스의 메서드를 참조할 수 없다
		
		// 객체는 하난데 Parent와 Child 중 어떤걸 참조하냐에 따라서 기능이 다르게 나타난다.
		// 상속관계 안에서 형태가 달라도 어느정도 동일한 결과를 나타내는 것이 Overriding이다.
		
	}

}
