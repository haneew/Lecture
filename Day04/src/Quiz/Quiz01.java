package Quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 두 정수를 입력받아서 더 큰 수를 화면에 출력하세요.
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		num2 = sc.nextInt();
		
		// 비교?
		if(num1 >= num2) {
			System.out.println("더 큰 정수값은 : " + num1);
		}
		else {
			System.out.println("더 큰 정수값은 : " + num2);
		}
		sc.close();
		
	}

}
