package Quiz;

import java.util.Scanner;

public class QuizAns02 {
	public static void main(String[] args) {
		
		
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		
		
		
		if(num % 6 == 0) {
			System.out.printf("%d는 6의 배수입니다.", num);
		}
		else if(num % 2 == 0) {
			System.out.printf("%d는 2의 배수입니다.", num);
		}
		else if(num % 3 == 0) {
			System.out.printf("%d3의 배수입니다.", num);
		}				
		
		// else로 마무리하는 형식을 권장하지만, 상황에 따라서 작성하지 않는 경우도 있다.
		sc.close();
	}

}
