package book3;

import java.util.Scanner;

public class Main {			// 입력만 받는 이유 :  사용자가 이용하는 ( 프론트 )
	
	
	
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
	

	
	public static void main(String[] args) {
		// 변수 선언
		Handler handler = new Handler();
		Book book = null;						// 추가 수정 삭제 검색에서 사용할 객체를 받기 위한 변수
		Scanner sc = new Scanner(System.in);	//입력받기 위한 Scanner
		String name;
		int menu = -1;							// switch와 연동하기 위한 메뉴
		int row = 0;	 						// 추가 및 삭제가 정상적으로 수행되었는지 확인하기 위한 변수
//		String author, publisher;				// Book의 String타입 필드(입력 받기 위한 값)
//		int price;								// Book의 int타입 필드(입력받기 위한 값)
	
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
				handler.showList();
				break;
				
			case 2:			// 2. 추가	Main(IO) input output
				book = getBookFromUserInput(sc);
				row = handler.insertBook(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break;	// 추가하고 나서 break가 없으면 case 0 으로 넘어가버리니까 switch의 break
			
			case 3:
				// 배열 내부의 도서 중에서 이름이 일치하는 객체를 찾아서 제거한다.
				System.out.println("검색어를 입력하세요 : ");
				name = sc.nextLine();
				
				row = handler.deleteBook(name);
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