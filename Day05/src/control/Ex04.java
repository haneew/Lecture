package control;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;			// 입력 받으니까 값이 무조건 생긴다.
		String grade;		// 분기문에 따라 값이 생기거나 생기지 않지만, default가 있어서 무조건 생긴다.
		
		System.out.println("점수 입력 : ");
		score = sc.nextInt();
		
		switch(score / 10) {
		case 10:	
		case 9:	grade = "A";	break; // break를 만나면 중괄호(범위블럭) 아래로 이동한다.
		case 8:	grade = "B";	break;
		case 7: grade = "C";	break;
		case 6: grade = "D";	break;
		default: grade = "F";	
		}
		// 값이 있어야 출력할 수 있다.
		// 1) 변수 선언과 동시에 고정값을 지정한다. (초기화한다)
		// 2) 분기문 내부에서 값을 지정한다면, else 혹은 default를 이용하여 반드시 값이 지정되도록 한다.
		//    - 즉 값 지정시 default 값이 없으면 안된다 필수
		System.out.printf("점수 : %d, 등급 : %s\n", score, grade);
		sc.close();
		
	}

}
