package control;

public class Ex01 {
	public static void main(String[] args) {
		// switch ~ case : 특정 변수의 값에 따라 서로 다른 코드를 실행한다
		
		int num = 1;
		
		// if의 조건이 모두 특정 변수와 연관되어 있고ㅡ 값의범위가 아닌 특정값의 일치여부이다.
		if(num == 1) 		System.out.println("one");
		else if(num == 2)	System.out.println("two");
		else if(num == 3)	System.out.println("three");
		else 				System.out.println("other");
		System.out.println();
		
		// switch ~ case 일치하는 값만 처리한다. (선풍기 스위치를 떠올리자.)
		switch(num) {
		case 1: System.out.println("ONE");		break;  //case는 시작만하므로 break가 필요하다.
		case 2: System.out.println("TWO");		break;
		case 3: System.out.println("THREE");	break;
		default:System.out.println("OTHER");
		}
		// 제한적인 상황에서 if 대신 사용할 수 있다.
		// if에 비해서 가독성을 올리거나, 1:1(위의 정수1과 문자열one처럼) 대칭관계를 나타내기에 좋다.
		
				
	}

}
