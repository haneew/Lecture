package Quiz;

import java.util.Scanner;

public class Quzi02 {
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
		int totalTime, baseTime, addTime, basePay, addPay;
		
		basePay = 3000;
		baseTime = 30;
		
		Scanner sc = new Scanner(System.in);					// 사용한 시간 입력받음.
		System.out.println("총 사용시간을 입력하세요 : ");
		totalTime = sc.nextInt();

		addTime = totalTime - baseTime;							// 추가시간을 얻기.
		addPay = addTime / 10 * 500;							// 추가금액 = 추가시간의 몫에 500원을 더한다. (10분당 500원 추가 요금이기 때문에)
		if(addTime % 10 != 0) {									// 추가시간의 10단위 묶음의 나머지가 0이 아니라면 - 전제조건
			addPay += 500;										// 기존 계산된 추가금액에 500원을 더해서 올림
		}
		
		System.out.printf("총 이용금액은 %d원 입니다.", basePay + addPay);
		
		sc.close();
	}

}
