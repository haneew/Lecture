package Quiz;

import java.util.Scanner;

public class QuizAns03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		
		System.out.println("주민등록번호 13자리 (xxxxxx-yyyyyyy)");
		System.out.print("입력 : ");
		input = sc.next();
		
		num1 = Integer.parseInt(input.split("-")[0]);
		num2 = Integer.parseInt(input.split("-")[1]);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println();
		
		
		// 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일			뒷자리 첫째글자 > 성별과 년대  / 앞자리 1,2글자 년도 34출생월 56 출생일
		// 그리고 성별은 문자열로 준비하여 모두 출력하세요.
		
		int year, month, date, genderNumber;
		String gender;
		
																// num1		year	month	date  (ex. 930516)
		date = num1 % 100; // 0의 개수만큼 오른쪽 숫자를 가져온다. 		//930516	?		?		16
																	
		num1 /= 100;											// 9305		?		?		16	
								
		month = num1 % 100;										// 9305		?		5		16
		
		year = num1 / 100;										// 9305 	93		5		16
		
		genderNumber = num2 / 1000000;
		
		switch(genderNumber) {
		case 1: case 2:
			year += 1900;
			break;
		case 3: case 4:
			year += 2000;
		}
		
		switch (genderNumber) {
		case 1: case 3:
			gender = "남성";
			break;
		case 2: case 4:
			gender = "여성";
			break;
		default:
			gender = "";
		}
		
		System.out.printf("%4d - %02d - %02d (%s)\n", year, month, date, gender);
		//%02 2자리를 확보 후 출력, 앞자리가 0일경우 0을 출력해라. 
	}
}
