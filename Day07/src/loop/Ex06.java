package loop;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		// String 타입의 데이터를 for문으로 접근하기.
		
		String s1 = "Helloworld";
		
		System.out.println("s1 : " + s1);
		System.out.println("s1.length() : " + s1.length());
		
		// 문자열을 문자(char)의 배열로 변환
		char[] arr = s1.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			char ch =arr[i];
			System.out.print(ch + " ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		// 배열의 i번째 글자 중에서, 짝수번째 글자가 알파벳 소문자이면 대문자로바꾸기
		
		for(int i = 0; i < arr.length; i++) {
			char ch =arr[i];
			if(i % 2 == 0 && 'a' <= ch && ch <= 'z') {				// a - 97, z -122
				arr[i] = (char)(ch - 32);							// a 와 A의 차이는 32 , arr[i]는 어레이를 참조하면 
			}
		}
		System.out.println(arr);
		System.out.println();
		
		
		
		
		// 1) 주어진 문자열을 char[]로 변환한 다음, 모든 글자를 대문자로 변경하기
		// 공백문자는 알파벳이 아니다 !!
		
		String s2 = "Life is too short";
		char[] arr2 = s2.toCharArray();
		
		for(int i = 0; i < arr2.length; i++) {			// 배열의 길이만큼 반복하면서
			char ch = arr2[i];							// 각 글자를 ch에 저장해두고
			if('a' <= ch && ch <= 'z') {				// ch가 a와 z사이에 있다면(소문자이면)
				arr2[i] = (char)(ch - 32);				// 배열의 값에 32를 빼서 대문자로 변경
			}
		}
		System.out.println(arr2);
		System.out.println();
		
		// 2) 주어진 문자열에서 숫자는 그대로 출력하고 숫자가 아닌 값은 출력하지 않고 줄을 바꾸기
		 
		String s3 = "9445-0230-1176-8878";			//	'0' ~ '9'	'1'	'2'	'3' ..
													//  48	  57	-48 -48	-48..
		
		char[] arr3 = s3.toCharArray();
				
		for(int i = 0; i < arr3.length; i++) {			
			char ch = arr3[i];						
			if('0' <= ch && ch <= '9') {
				System.out.print(ch);
			}
			else {
				System.out.println();
			}
		}
		
		
		

		
		
		
	}

}
