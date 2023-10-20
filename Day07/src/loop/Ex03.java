package loop;

public class Ex03 {
	public static void main(String[] args) {
		// for문 기본 연습 문제.
		
		// 1) 1에서 10사이 정수의 합계를 구하여 출력하세요.
		
		// 2) 11에서 20사이 정수의 합계를 구하여 출력하세요.
		
		// 3) 5에서 0까지 세로로 출력하세요.
		
		
		int num = 0;			// 합계를 구하려면 항상 초기값 0
		
		for(int i = 1; i <= 10; i++) {
			num += i; 
		}
		System.out.println("1에서 10사이의 정수의 합 : " + num);
		System.out.println();
		
		num = 0;				// 초기화 시키기.
		for(int i = 11; i <= 20; i++) {
			num += i; 
		}
		System.out.println("11에서 20사이의 정수의 합 : " + num);
		System.out.println();
		
		
		for(int i = 5; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		
		
		
	}

}
