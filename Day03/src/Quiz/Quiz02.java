package Quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 친구와 고기집에 갔다
		// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다
		// 돼지고기 삼겹살 1인분이 8500이고
		// 소주1병(4500원), 맥주1병(5000원)을 고정으로 주문했다
		// 추가 주문한 삼겹살 양을 입력받아서 <==여기가 입력받아야 할 값
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마를 내야하는지 계산하여 출력하는 프로그램을 작성하세요
		
		int fork = 8500;
		int soju = 4500;
		int beer = 5000;
		int add;
		int num;
		
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("추가 주문 삼겹살 : ");
		add = sc.nextInt();
		System.out.print("총 인원수를 입력하세요 : ");
		num = sc.nextInt();
		
		System.out.printf("총 금액은 : %d 입니다\n", fork * ( 3 +  add) + soju + beer);
		System.out.printf("1인당 금액은 : %d 입니다", (fork * ( 3 +  add) + soju + beer)/num);
		
		
		sc.close();
		
		
		
		
		
		
		
	}

}
