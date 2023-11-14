package book3;

// 접근 제한자 + getter/setter


public class Book {
	private String name;
	private String author;
	private int price;
	private String publisher;
	
	
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
