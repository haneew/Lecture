package Quiz;

import java.util.Scanner;

public class QuizAns02 {
	public static void main(String[] args) {
		
		int totalPrice, dutchPay;												// 변수 선언 및 초기화
		int meatPrice = 8500;
		int soju =4500, beer = 5000;
		int addmit;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("우리 식당에서는 기본 삼겹살 3인분으로 시작합니다.");			// 입력받기
		System.out.println("삼겹살 3인분, 소주 1병, 맥주 1병 주문되었습니다.");
		System.out.print("삼겹살 추가 주문량을 입력하세요 : ");
		addmit = sc.nextInt();
		
		totalPrice = (meatPrice * 3) + (soju * 1) + (beer * 1);					// 연산하기
		totalPrice += addmit * meatPrice;
		dutchPay = totalPrice / 2;
		
		System.out.printf("총 금액 : %, d원\n", totalPrice);						// 출력하기
		System.out.printf("1인당 결제할 금액 : %, d원\n", dutchPay);
		
		sc.close();																// 마무리
	}

}
