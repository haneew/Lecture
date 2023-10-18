package Quiz;

import java.util.Scanner;

public class QuizAns02 {
	public static void main(String[] args) {
		
/*		
		  놀이공원에 있는 놀이기구에 대한 이용 요금을 계산해야 한다.   
		  이 놀이기구는 탑승하면 기본 3000원의 요금을 받고		// 기본요금, 기본시간 
		  이용시간에 따라 추가 요금이 발생한다.					// 추가요금, 추가시간
		  그 시간과 요금은 아래와 같다
		  
		  시간			요금
		  0 ~ 30		3000
		  31 ~ 41		3500
		  41 ~ 50		4000
		  ...  ------------- 10분마다 500원이 추가되는 규칙성
		  
		  시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성하세요
*/		
		
		
		int time;
		int fee = 3000;
//		int over;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("총 사용시간을 입력하세요 : ");
		time = sc.nextInt();

/*		if(time > 30) {
			// 추가 시간을 계산하는 식
			// 요금 = 기본요금 + 추가요금
			// 추가요금 = (추가시간(10분단위) + 보정값) * 500
			// 요금 += 추가요금
			over = ((time - 30) / 10) * 500; 			// 기본식
			if(time %10 != 0) {							// 시간이 10분 단위로 나누어 떨어지지 않으면
				over += 500;							// 500원을 추가로 넣는다
			}
			fee += over;								// 계산이 끝난 추가요금을 총 요금에 더한다.
		}
		
		System.out.printf("요금 : %,d원\n", fee);
*/
		
		
		if(time > 30) {
			fee += (time -21) / 10 * 500;
		}
		System.out.printf("요금 %,d원\n", fee);
		
		sc.close();
	}

}
