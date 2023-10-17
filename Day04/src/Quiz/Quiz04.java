package Quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		// 지하철 1구간당 평균 소요 시간이 4분이라고 가정한다
		// 이동한 구간수를 입력받아서 이동하는데 걸리는 시간을 출력하세요-
		// 단, 이동한 시간이 60분 이하이면 분으로만 출력하고
		// 이동한 시간이 60분 초과하면 시간과 분으로 나누어서 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		int num;
		int hour;
		
		
		System.out.print("이동한 구간의 수를 입력하세요 : ");
		num = sc.nextInt();
		
		
		if(num >= ) {
			System.out.printf("총 걸리는 시간은 %d분입니다.", num * 4);
		}
		else if(num < 15) {
			System.out.printf("총 걸리는 시간 %d시간 %d분입니다", );
		}
	}

}
