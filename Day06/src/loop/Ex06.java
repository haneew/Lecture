package loop;

public class Ex06 {
	public static void main(String[] args) {
		// 30일동안 은행에 돈을 입금한다.											30일
		// 첫날에 10원, 그 다음날에 20원, 다음날에 40원								기본금액 10
		// 이런식으로 전날의 두배를 입금한다.										전날의 두배
		// 30일째 입금이 끝난 후
		// 31일째 은행에 누적된 총 금액은 얼마인지 계산하여 출력하세요					누적
		
		
		int num = 10;
		long sum = 0;			// long을 써야한다 double도 가능		
		int day = 1;
				
		while(day < 30) {
			sum += num;
			num *= 2;
			day += 1;
		}
		System.out.printf("총 입금 금액은 %,d원 입니다.", sum);
		
		
		
		// https://app.diagrams.net/
	}

}
