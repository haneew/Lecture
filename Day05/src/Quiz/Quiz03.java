package Quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		int year, month, day, gender;
		
		System.out.println("주민등록번호 13자리 (xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요.
		
		
		day = num1 % 100;
		num1 = num1 / 100;
		month = num1 % 100;
		year = num1 / 100;
		gender = num2 / 1000000;
				
		switch(gender) {
		case 1: 
			System.out.printf("당신은 %d년 %d월 %일생입니다.", 1900 + year, month, day);
			break;
		case 3: 
			System.out.printf("당신은 %d년 %d월 %일생입니다.", 2000 + year, month, day);
			break;
		case 2: 
			System.out.printf("당신은 %d년 %d월 %일생입니다.", 1900 + year, month, day);
			break;
		case 4: 
			System.out.printf("당신은 %d년 %d월 %일생입니다.", 2000 + year, month, day);
			break;
		}


		
		
	}

}
