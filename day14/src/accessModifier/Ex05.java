package accessModifier;

import java.util.Scanner;

// 이 프로그램에서 다룰 단일 데이터의 형태 : Human

// 이 프로그램의 내부 기능을 담당하는 형태
class Handler5{
	// 프로그램에서 사용되는 상세 기능을 함수로 구현하면 됩니다
	// 필요한 변수가 있다면 필드로 생성해도 됩니다.
	
	// 객체 형태의 데이터를 저장하기 위한 자료구조(배열)
	private Human[] arr = new Human[5];
	
	// 이름과 나이를 전달받아서, Human형태의 객체를 생성하고, 배열에 추가하는 함수
	// 추가되면 1, 아니면 0을 반환한다.
	public int add(String name, int age) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = new Human();
				arr[i].setName(name);
				arr[i].setAge(age);
				row = 1; 		// 1개의 데이터를 추가했다는 의미 - if가 작동하지 않으면 0이 반환된다.
				break;	
			}
		}
		return row;				// 0 반환
	}
	
	// 전체 내용을 출력하는 함수
	public void showList() {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null) {
				System.out.printf("%s : %d살\n", arr[i].getName(), arr[i].getAge());
			}
		}
	}
	
	
} // ================================================================================================

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Handler5 handler = new Handler5();
		int menu;
		int age;
		String name;
		int row;
		
		while(true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.print("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			switch(menu) {
			case 1:
				System.out.print("이름 입력 : ");
				name = sc.nextLine();
				System.out.print("나이 입력 : ");
				age = Integer.parseInt(sc.nextLine());
				row = handler.add(name, age);			// 입력값을 받아서 넘기면 handler가 알아서 처리하고
														// 그 결과만 main()에게 보고한다.
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;
			case 2: 
				handler.showList();
				break;
			case 0:
				sc.close();
				return; 	// main함수를 즉시 종료한다.
			
			default:
				System.out.println("잘못 선택하셧습니다");
			}
			System.out.println();
		} // end of while
	}
}
