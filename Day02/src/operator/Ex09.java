package operator;

public class Ex09 {
	public static void main(String[] args) {
		// 삼항 연산
		// 3개의 항을 이용하여 값을 결정한다.
		// 1항은 조건을 나타낸다
		// 2항은 조건이 참일 경우 결정될 값이다
		// 3항은 조건이 거짓일 경우 결정될 값이다.
		// 상항 연산자는 조건에 따라서 서로 다른 값을 결정하는 연산식이다.
		
		
		int score = 70;
		boolean flag = score >= 60;
		String result = flag ? "합격" : "불합격";
		
		System.out.println(result);
		
		System.out.println(flag ? "합격" : "불합격");  // 이렇게 해도 같다.
		
		// if와 유사한 점이 있다.
		if(flag) {								// 조건이 참이면
			System.out.println("합격");			// 합격을 출력
		}
		if(flag == false) {						// 조건이 거짓이면
			System.out.println("합격");			// 불합격을 출력
		}
		
		// if문은 조건에 따라서 서로 다른 코드를 실행하는 구문이다 (행위)
		// 삼항연산은 조건에 따라서 서로 다른 값을 결정하는 구문이다 (값)
		// 고로 비슷해 보이지만 이용하는 곳이 다르다.
		
//		아래 코드는 값을 결정할 수 없는 코드이기 때문에 실행할 수 없다.
//		flag ? System.out.println("합격") : System.out.println("불합격"); 
		
		
		
		
		
	}

}
