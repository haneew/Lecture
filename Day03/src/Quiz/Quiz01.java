package Quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 이름과 나이를 입력받고
		// 나이를 이용하여 성인 여부를 문자열로 준비한 다음
		// 이름, 나이, 성인여부를 한 문장에 출력하는 코드를 작성하세요
		// (단, 성인은 20세 이상입니다.)
		
				
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		boolean isEven;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		
		isEven = age >= 20;
		
		System.out.printf("이름은 %s 나이는 %d %s", name, age, isEven ? "성인입니다" : "미성년자입니다.");
		
		sc.close();
		
		
		
	}

}
