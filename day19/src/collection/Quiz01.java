package collection;

import java.util.Arrays;
import java.util.List;

class Book implements Comparable<Book>{
	String name;
	int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%s : %,d원\n", name, price);
	}
	@Override
	public int  {
		return ;
	}
}

public class Quiz01 {
	static void showList(List<Book> list) {
		for(Book b : list) {
//			System.out.printf("%s : %,d원\n", b.name, b.price);
			System.out.println(b);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Book[] arr = {
				new Book("전지적 푸바오 시점", 19800),
				new Book("더 마인드", 17820),
				new Book("트랜드 코리아 2024", 17100),
				new Book("김대리의 데일리 뜨개", 18900),
				new Book("퓨처 셀프", 17820),
		};
		
		List<Book> list = Arrays.asList(arr);
		showList(list);
	
		// 책 제목 순 오름차순정렬
		list.sort((o1, o2) -> o1.name.compareTo(o2.name));
		showList(list);
		
		// 책 가격 순 내림차순정렬
		
		list.sort((o1, o2) -> o2.price - o1.price);
		showList(list);
		
//		list.sort() 함수는 내부에서 자신만의 방식으로 정렬을 수행한다
//		이때, 선택정렬 코드의 if조건에 해당하는 부분만 만들어내는 함수가 compare 혹은 compareTo이다
//		if(arr[i] - arr[j] > 0) { ... }
		
		
		// Book 클래스는 기본비교함수가 내장되어 있지 않기 때문에 예외가 발생한다
		// 기본비교함수를 넣어주려면 인터페이스 Comparable을 구현하면 된다
		
		// Comparable : 클래스에서 implements 해서 사용하는 인터페이스  
		// 자체적으로 비교가 가능한 성격으로 만들어준다. 즉, null 사용가능하게
		// 외부의 두 객체를 비교한다.
		// class Book implements Comparable{ 비교 가능한 도서 (compareTo를 오버라이딩한다) }
		
		// Comparator : 람다식으로 객체를 생성하여 전달할 때 사용한다
		// 나랑 외부 객체와 비교를 한다. 
		// 비교함수가 없거나, 자신만의 기준으로 비교하고 싶을때  만들어서 전달한다.
		
		list.sort(null);
		showList(list);
		
		
		
		
	}

}
