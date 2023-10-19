package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int answer = ran.nextInt(100) + 1;
		int user;
		int count;
		
				
		// 반복을 수행하면서
		//		사용자에게 값을 입력받고
		//		만약 정답이 입력값보다 작으면 down
		// 			정답이 입력값보다 크면 up
		//			일치하면 반복을 중단
		//		반복할때마다 횟수를 증가시키기
		//
		// 반복이 끝나면 정답과 횟수를 출력하고 종료.
		
		
		while(true) {		//  횟수를 알 수 없기 떄문에 무한반복으로 설정하고 내부에서 break로 중단하기.
		// 		사용자에게 값을 입력받고
			System.out.println("정수 입력 : ");
			user = sc.nextInt();
			//	만약 정답이 입력값보다 작으면
			if(answer < user) System.out.println("down");
			//	만약 정답이 입력값보다 크면
			else if(answer > user)	System.out.println("up");
			//	일치하면 반복 중단
			else		break;
			// 반복횟수 
			count++;
			}
		
		
		System.out.printf("%d은(는) 정답입니다.\n총 횟수 : %d", user, count);
		
		
		
		sc.close();

		
		
	}

}
