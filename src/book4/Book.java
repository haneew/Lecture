package book4;

// 접근 제한자 + getter/setter


public class Book {
	private String name;		// 클래스 내부에서는 자유롭게 접근이 가능하다.(1)
	private String author;
	private int price;
	private String publisher;
	
	// 출력 서식을 toString으로 오버라이딩-----------------------------------------
	@Override
	public String toString() {
		String data = String.format("%s (%s %s) : %,d원\n", 
				name, 			// getName이 아닌 그냥 name인 이유 (1)
				author, 
				publisher, 
				price);	
		return data;
	}
	//-----------------------------------------------------------------------
	
	public Book(String name, String author, int price, String publisher) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public Book() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
