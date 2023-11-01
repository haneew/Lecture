package accessModifier;

public class Ex02 {
	public static void main(String[] args) {
		
		Human ob1 = new Human();
//		ob1.name = "이지은";
		ob1.setName("이지은");
		
//		ob1.age = 30;
		ob1.setAge(30);
		
//		System.out.println("이름 : " + ob1.name);
		System.out.println("이름 : " + ob1.getName());
		
//		System.out.println("나이 : " + ob1.age);
		System.out.println("나이 : " + ob1.getAge());
		
		// getter와 setter가 있으면 어짜피 필드에 모두 접근이 가능한데
		// 안써도 효과가 같지 않나요?
		
		// 접근제한자를 이용하면 name/age 주고 받는게 모두 닫히는데
		// getter/setter를 이용하면 주는것/받는것 선택해서 제한할 수 있다.
		
		// 클래스 작성자가 메서드를 작성하지 않으면
		// 접근할 수 없으며, 클래스 작성자의 의도대로 움직이게 할 수 있다.
		
		
		
	}

}
