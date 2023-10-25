package function;

public class Ex02 {
	
	// 1)
	static int add(int n1,int n2) {
/*		int sum = 0;
		sum = n1 + n2;
		return sum;
	} */
		return n1 + n2;
	}
	
	// 2)
	static int getMinnumber(int n1, int n2, int n3) {
		int num = 0;
		if(n1 > n2 && n1 > n3) 		num = n1;
		if(n1 < n2 && n3 < n2) 		num = n2;
		else if(n3 > n2 && n3 > n1)	num = n3;
		return num;
		
/*		int min = 999999;
		if(n1 < min) {
			min = n1;
		}
		if(n2 < min) {
			min = n2;
		}
		if(n3 < min) {
			min = n3;
		}
		return min; */
	}
	
	// 3)
	static String upperCase(String str) {
/*		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(0 == str.length()) {
			 ch -= 32;
			}
					
		}
		return answer; */
		
		String answer = "";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(i == 0 && 'a' <= ch && ch <= 'z'){		// 범위는 무조건 &&
					ch -= 32;		//첫글자가 소문자면 대문자로 바꿔라.
			}
			answer += ch;  			// i번째 글자(ch)를 answer에 순서대로 더한다.
		}
		return answer;
	}
	
	// 4)
	static String substring(String str, int n1, int n2) {
		String answer = "";
		for(int i = n1; i < n2; i++) {					// 범위 값 설정, 7 12(7, 8, 9, 10, 11)
			char ch = str.charAt(i);
				answer += ch;
		}
		return answer;
	}
	
	// 5)
	
	
		
	public static void main(String[] args) {
		// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요
		
		
		int sum = add(4, 5);
		System.out.println("sum : " + sum);

		// 2) 세 정수를 전달받아서 가장 작은 수를 반환하는 함수 getMinnumber를 작성하세요
		
		int t1 = getMinnumber(1,2,3);
		System.out.println("t1 : " + t1);
		
		// 3) 문자열 하나를 전달받아서, 첫글자를 대문자로 변환하는 함수 upperCase를 작성하세요.
		String t2 = upperCase("hello");
		System.out.println("t2 : " + t2); 	// Hello
		
		String t3 = upperCase("3 years later");
		System.out.println("t3 : " + t3); 	// 3 years later 
		
		// 4) 문자열 하나와 정수 두개를 전달받아서
		// 문자열의 from번째 글자부터 to글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요
		
		String t4 = substring("Hello, world !!", 0, 5);
		System.out.println("t4 : " + t4);  				// world
		
		String t5 = substring("Hello, world !!", 7, 12);
		System.out.println("t5 : " + t5);  				// world
	
	
	}
}
