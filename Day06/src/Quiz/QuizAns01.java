package Quiz;

public class QuizAns01 {
	public static void main(String[] args) {
		
		// 3)
		int sum = 0;
		int i = 0;
		while(i < 101) {
			sum += i;
			i++;
		}
		System.out.println("1부터 100까지의 합계 :" + sum +"\n");
		
		
		//5
		i = 1;
		while(i < 101) {					// 숫자를 반복하여 증가시킬 조건
			if(i % 7 == 0) {				// 변화하는 숫자의 값이 7로 나누어 떨어지면 출력
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		i = 7;							// 초기값 변경
	
	while(i < 101) {					
		System.out.print(i + " ");		// 조건은 그대로
		i += 7;							// 7씩 증가하기 때문에 if를 쓰지 않아도 된다.
	}	
	System.out.println();	
		
		
		
		
		
	}

}
