package variable;

public class Ex01 {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("제 이름은 손흥민입니다.");
		System.out.println("올해 나이는"+ 30 +"살입니다");
		System.out.println( ); //내용을 적지 않아도 실행되고 한줄 아래로 띄워준다.
		
		System.out.println("손흥민의 나이는 30살입니다");
		System.out.println();
		
		String name = "손흥민";
		int age = 30;
		
		System.out.println(name + "의 나이는 " + age + "살입니다");
		
		//변수에 담긴 값을 바꾸면 동일한 코드로 다른 값을 처리할 수 있다.(일일히 새로 쓰지 않는다)
		
		name = "한동근";
		age = 33;
		
		System.out.println(name + "의 나이는 " + age + "살입니다");
		

	}

}
