package loop;

public class Ex01 {
	public static void main(String[] args) {
		// 반복문
		// 특정 조건에 따라, 코드를 반복하여 수행하는 구문.
		
		
		System.out.println("Hello");
		System.out.println("Hello");
		
		
		int num = 0;							// 반복할 횟수를 체크할 변수 (선언)
		while(num < 50) {						// 반복을 수행할 조건 (조건)
			num++;								// 횟수를 1증가시킨 후 (증감)
			System.out.println("while : " + num);	// 원하는 작업을 수행
			// ↑ 실질적인 종속문장
		}
		System.out.println();
		
		for(int i = 0; i < 25; i++) {			// 반복의 횟수를 선언, 조건, 증감
			System.out.println("for :" + i);	// 종속문장
		}
		System.out.println();
		
		// 새로운 반복을 돌리기 위해 횟수를 0으로 대입.
		num = 0;
		
		if(num < 20) {		// 조건이 참일때 종속문장을 1회 실행한다.
			System.out.println("if : " + ++num);
		}
		
		while(num < 20) {	// 조건이 참인동안 종속문장을 반복하여 실행한다.
			System.out.println("while : " + ++num);
		}	// 종속문장을 실행하고 나면, 다시 조건을 체크한다.
		
		
		// 값이 변하는 숫자 출력하기
		int i = 0; 		//시작값
		while(i < 5) {		//범위(끝값, 마지막 값은 포함하지 않는다)
			System.out.print(i + " ");
			i += 1;			//증감식
		}
		System.out.println();
		
		
		char ch = 'A';			//반복문은 일정한 조건(일정한 규칙)에 의해 반복한다
		while(ch <= 'Z') {
			System.out.println(ch + "(" + (int)ch + ")");
			ch++;
		}
		System.out.println();
		
		//놀이기구 문제의 요금표를 반복문으로 간단하게 표현하기
		int st = 31;
		int fee = 3500;
		System.out.println("0 ~ 30분 : 3,000원");
		
		while(fee <= 10000){				// 무한반복이 아니라면, 원하는 범위를 설정한다
			System.out.printf("%d ~ %d분 : %d원\n", st, st+9, fee);
			st += 10;						// 1구간당 10분단위로 표현한다
			fee += 500;						// 1구간당 500원단위로 증가한다.
		}
		// 반복이 되느냐 안되느냐 먼저 생각. 규칙!
		System.out.println();
		
		// 오전취업반의 수업시간은 9시, 10시, 11시, 12:30분, 13:30, 14:30이다.
		// while을 이용하여 출력해보자.
		
		int n1 = 9, n2 = 0, n3 = 9, n4 = 50;
		
		while(n1 < 15) {				// 조건이 항상 참인 반복문, 무한반복 (일단 반복을 돌린다.)
			
			System.out.printf("%02d:%02d ~ %02d:%02d\n", n1, n2, n3, n4);
			n1 += 1;		// n1을 증가(1시간이 지나간다)
			n3 = n1;		// 오전에는 시작시간과 종료시간의 hour가 같다
			
			if(n1 >= 12) {	// 오후가 되면
				n3 += 1;	// 시작시간보다 종료시간의 hour가 1만큼 더 크다.
				n2 = 30;	// 시작시간의 분은 30분 고정	
				n4 = 20;	// 종료시간의 분은 20분 고정
			}

			
		}
		
			
		
	}

}
