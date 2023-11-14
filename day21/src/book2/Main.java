package book2;

import java.util.Scanner;

public class Main {			
	
	// 배열을 전달받아서, 배열 내부의 각 객체를 서식에 맞게 출력하는 함수 (case 1)
	static void showList(Book[] arr) {
		for(int i = 0; i <arr.length; i ++) {
			if(arr[i] != null) {		// 배열의 각 초기값 null을 처리(회피)하기 위한 if
				System.out.printf("%s (%s %s) : %,d원\n", 
						arr[i].getName(), 		// 객체 내부 값을 가져오기 위한 getter
						arr[i].getAuthor(), 
						arr[i].getPublisher(), 
						arr[i].getPrice());	
			}
		}
		
	} // end of showList()
	
	// case 2의 입력부분, Scanner를 매개변수로 전달받아서 객체를 생성하고, 
	// 사용자 입력값으로 객체를 구성하여 그 객체를 반환하는 함수
	static Book getBookFromUserInput(Scanner sc) {		// 여기서는 scanner를 빌려왔기 때문에 closer가 필요없다
		Book book = new Book();						
		String name, author, publisher;					// 인풋을 받기 위해서 String과 int를 설정해두고
		int price;
		
		System.out.print("도서 이름 입력 : ");				// 각 값을 입력받고
		name = sc.nextLine();							// 문자열 형식으로 name(지역)에 담는다.
		
		System.out.print("저자 입력 : ");
		author = sc.nextLine();
		
		System.out.println("출판사 입력 : ");
		publisher = sc.nextLine();
		
		System.out.println("가격 입력 : ");
		price = Integer.parseInt(sc.nextLine());
		
		book.setAuthor(author);							// 입력받은 각 객체를 setter(Book class)에 담는다
		book.setName(name);								
		book.setPrice(price);
		book.setPublisher(publisher);
		
		return book;			// 여기까지 입력만 있었지만 배열에 넣는 작업은 없다. 이는 handler가 가져가야할 값이다.
		
	} // end of getBookFromUserInput()
	
	static int deleteBook(String name, Book[] arr) {
		int row = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != null && arr[i].getName().equals(name)) {		// . : NullPointerException
				arr[i] = null;	// 참조변수가 객체를 참조하지 않도록 한다
								// 모두에게서 잊혀진 참조변수는 소멸한다
				row = 1;		// 삭제했다는 결과를 반환하기 위해 row값을 1로 설정한다
				break;			// 하나 지웠으면 중단한다.
			}
		}
		return row;
	}
	
	public static void main(String[] args) {
		// 변수 선언
		Book book = null;						// 추가 수정 삭제 검색에서 사용할 객체를 받기 위한 변수
		Scanner sc = new Scanner(System.in);	//입력받기 위한 Scanner
		int menu = -1;							// switch와 연동하기 위한 메뉴
		String name;
		int row = 0; 						// 추가 및 삭제가 정상적으로 수행되었는지 확인하기 위한 변수
//		String author, publisher;			// Book의 String타입 필드(입력 받기 위한 값)
//		int price;								// Book의 int타입 필드(입력받기 위한 값)
		Book[] arr = new Book[10];				// 여러 Book 객체를 저장하기 위한 배열
												// 배열은 자료형에 맞는 0값으로 초기화된다
												// 참조형 변수(클래스 타입 변수)의 초기값은 null
		// arr = { null, null, null, null, null, null, null, null, null, null };
		
		// 입력 및 출력 (자료형 + 대입, 제어문 + 연산자 활용)
		while(menu != 0) {
			// 사용자 메뉴 출력
			System.out.println("1. 도서 목록");
			System.out.println("2. 도서 추가");
			System.out.println("3. 도서 삭제");
			System.out.println("0. 종료");
			System.out.print("입력 >>>>");
			menu = Integer.parseInt(sc.nextLine());
		
			switch(menu) {	// 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다 (분기문)
			
			case 1:			// 1. 목록 
				showList(arr);
				break;
				
			case 2:			// 2. 추가	Main(IO) input output
				book = getBookFromUserInput(sc);
				
				for(int i = 0; i < arr.length; i++) {		// 배열의 처음부터 끝까지 순회하면서
					if(arr[i] == null) {					// 빈칸을 찾았다면
						arr[i] = book;						// 값이 준비된 객체를 넣으면 끝
						break; 	// 다음칸에 또 값을 넣으면 안되니까 break (반복중단)
					}
				} 
				break;	// 추가하고 나서 break가 없으면 case 0 으로 넘어가버리니까 switch의 break
			
			case 3:
				// 배열 내부의 도서 중에서 이름이 일치하는 객체를 찾아서 제거한다.
				System.out.println("검색어를 입력하세요 : ");
				name = sc.nextLine();
				
				row = deleteBook(name, arr);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				
				break;
				
			case 0:			// 0. 종료
				System.out.println("프로그램 종료");
				sc.close();
				
				
			} // e o switch
			
		} // e o while
		
	} // e o main
	
} // e o class





// 단일 책임 원칙 : 하나의 클래스는 하나의 기능만 담당하게 만들어야 한다.
// case 2에서 sc로 입력만 받는 이유(배열을 같이 내보내지 않는 이유) : 배열은 저장의 기능이다.
// sc는 입력 배열은 저장이므로 두가지 기능을 가지게 된다. 
// handler로 저장기능을 따로 만듬 유지보수 쉬움