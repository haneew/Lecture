import java.util.Scanner;

import accessModifier.Human;

public class Quiz1 {
	public static void main(String[] args) {
		// Human 클래스를 이용하여 비어있는 상태의 객체 하나 생성하세요
		
		Scanner sc = new Scanner(System.in);
		Human ob = new Human();		// 새로운 객체를 생성한다. ob = new Human(); 으로 객체가 ob를 가르기도록도 가능하다.
		
		// 본인의 이름과 나이를 키보드로 입력하여 그 값을 ob에 저장하고
		// 한줄에 출력하세요.
		
		System.out.println("이름을 입력하세요");
		ob.setName(sc.nextLine());
		System.out.println("나이를 입력하세요");
		ob.setAge(sc.nextInt());
		
		System.out.printf("%s님은 %d살입니다\n", ob.getName(), ob.getAge());
		sc.close();
	}
	
	// 만약에 휴먼타입에 배열이 있으면 

}
