package Quiz;

import java.util.Random;
import java.util.Scanner;

public class QuizAns02 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(100) + 1;
		int user;
		int count = 1;
		
		// 반복을 수행하면서
		//		사용자에게 값을 입력받고
		//		만약 정답이 입력값보다 작으면 down
		// 			정답이 입력값보다 크면 up
		//			일치하면 반복을 중단
		//		반복할때마다 횟수를 증가시키기
		//
		// 반복이 끝나면 정답과 횟수를 출력하고 종료.
		
		
		while(true) {
			
			System.out.println("값을 입력하세요 : ");			// 여러번 물어봐야하기 때문에 while안에 있어야 한다.
			user = sc.nextInt();							// 만들기전에 말로 읊어보고 순서를 생각할 것.
			count++;
			
			if(answer < user) {
				System.out.println("down");
				
			}
			else if(answer > user) {
				System.out.println("up");
				
			}
			else if(answer == user) {
				System.out.printf("%d은(는) 정답입니다.\n총 횟수 : %d", user, count);
				break;
			}
			
		}
		sc.close();
		
	}

}
