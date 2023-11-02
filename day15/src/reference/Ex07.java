package reference;

import java.util.Arrays;

public class Ex07 {
	public static void main(String[] args) {
		
		int n1  = 10, n2 = 20;
		boolean flag1 = n1 - n2 > 0;		// n1 > n2
		
		String s1 = "Hello", s2 = "World";
		boolean flag2 = s1.compareTo(s2) > 0;		// s1 > s2
			
		System.out.println("n1이 n2보다 크다 : " + flag1);
		System.out.println("s1이 s2보다 크다 : " + flag2);
		
		System.out.println("n1이 n2보다 작다 : " + !flag1);
		System.out.println("s1이 s2보다 작다 : " + !flag2);
		
		// String 클래스의 compareTo(String anotherString)은
		// 두개의 문자열의 클자의 코드값을 비교하여 정수로 반환한다.
		
		Integer[] arr = { 50, 30, 20, 40, 10 };
		String[] arr2 = { "원빈", "현빈",	"우빈", "준빈", "다빈" };
		
		sortIntArray(arr);
		sortStringArray(arr2);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println();
		
		
		
		// arr배열을 정렬한다. 내부 요소를 a와 b라고 할때, b에서 a를 뺀 결과가 정수이다
		// 정수가 0보다 크면 바꿔라
		Arrays.sort(arr, (a, b) -> a - b);			// 현재 오름차순 -> 내림차순으로 바꾸려면 a와 b의 위치를 바꾼다.
		System.out.println(Arrays.toString(arr));
		
		// arr2 배열을 정렬한다. 내부요소를 a와 b라고 할때, b와 a를 비교한 결과가 정수로 나타난다
		// 정수가 0보다 크면 바꿔라.
		Arrays.sort(arr2, (a, b) -> a.compareTo(b));
		System.out.println(Arrays.toString(arr2));
		
		//: 두 값의 차이를 구한다. 차이를 구해서 0보다 크면 자리를 바꿔라
		
		
		
	} // end of main	
	
	
	// 정수배열을 오름차순으로 정렬하는 함수 sortInArray(int[] arr)
	static void sortIntArray(Integer[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
//				if(arr[i] < arr[j]) {  				// 이렇게 써도 되지만 밑처럼 써도 된다.
				if(arr[i] - arr[j] > 0) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	// 문자배열을 오름차순으로 정렬하는 함수 sortStringArray(String[] arr)
	static void sortStringArray(String[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0) {
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
		
		
		
		
	
}
