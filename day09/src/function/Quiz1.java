package function;

public class Quiz1 {
	//1)
	static String getSign(int num) {
		String str;
		if(num > 0)			str = "양수";
		else if(num < 0) 	str = "음수";
		else 			 	str = "0";
		return str;
	}
	
	//2)
	static int getReverseNum(int num) { //  1회				|	2회					|	3회				|	4회
		int result = 0;					// num		result	|	num 		result	|	num		result	|	num		result
		while(num != 0) {				// 1234		0		|	123			4		|	12		43		|	1		432	
			result *= 10;				// 1234		0		|	123			40		|	12		430		|	1		4320
			result += num % 10;			// 1234		4		|	123			43		|	12		432		|	1		4321
			num /= 10;					// 123		4		|	12			43		|	1		432		|	0		4321
		}
		return result;
	}
	// 3)
	static int pow(int n1, int n2) {		// (2, 10)
		int answer = 1;
		for(int i = 0; i < n2; i++) {		// 10번 반복하여
			answer *= n1;					// 2를 곱한다
		}
		return answer;
	}
	// 4)
	static int remainder(int n1, int n2) {
		int answer = 0;
		answer = n1 % n2;
		return answer;
	}
	
	// 5)
	static String getReverseStr(String s) {
		String result = "";			// 빈문자열
		for(int  i = s.length() - 1; i != -1; i--) {
			result += s.charAt(i);
			
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		// 1) 정수를 하나 전달받아서, 양수, 음수, 0을 문자열로 반환하는 함수 getSign
//			int 		매개변수		produces	양/음/0 == 
		String t1 = getSign(3);
		System.out.println("t1 : " + t1 + "\n");
		
		// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
		int t2 = getReverseNum(1234);		//4321
		System.out.println("t2 : " + t2);
		
		// 3) 두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 pow
		int t3 = pow(2, 10);
		System.out.println("t3 : " + t3);
		
		// 4) 두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 remainder
		int t4 = remainder(100, 6);
		System.out.println("t4 : " + t4);
		
		// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
		String t5 = getReverseStr("Hello");
		System.out.println("t5 : " + t5);
		
		// 함수 호출 코드에 마우스를 올려보세요
		// 함수 호출 코드에 마우스를 올린 상태로 컨트롤 클릭하면 함수의 정의로 이동합니다.
		int test = Integer.parseInt("1234");
		
	}
}
