package loop;

public class Ex08 {
	public static void main(String[] args) {
		// 단일 for문으로 1부터 9까지 출력하기
		for(int i = 1; i < 10; i++) {
			System.out.print(i + " ");
		}System.out.println();
		
		
		// 이중 for문으로 1부터 9까지 출력하기
		for(int i = 1; i < 9; i +=3) {
			for(int j = i; j < i + 3; j++) {
				System.out.print(j + " ");
			}System.out.println();  		// 추가하면 구간 나눈걸 확인할 수 있다.
		}System.out.println();
		
		
		
		// 시작값부터 마지막값까지 일정한 크기로 변하면서 규칙성과 연속성이 필요하다.
		// 3단 구구단 예제
		for(int i = 1; i < 10; i++) {										// ==> 이런 부분적인 것을 module(부품화)해서 
			System.out.printf("%d x %d = %d\n", 3, i, 3 * i);
		}System.out.println();
		
		//2단부터 9단까지 구구단 출력하기.
		for(int dan = 2; dan < 10; dan++) {									// ==> 대입 할 수 있어야 한다. 복붙
			for(int i = 1; i < 10; i++) {											
				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
			}System.out.println();
		}
		
		
	}

}
