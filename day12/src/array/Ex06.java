package array;

import java.util.Arrays;

public class Ex06 {
	public static void main(String[] args) {
		// 배열에서의 최소값/최대값을 구하는 작업이 필요할때
		// 배열의 값들이 크기순으로 이미 정렬되어 있다면 훨씬 구하기 쉽다.
		// 배열을 정렬하기 위해서는 서로 다른 두 값의 크기를 비교하여 " 자리를 바꿔야 한다. Ex05"
		
		// [ 선택정렬 알고리즘 ]
		// 배열의 각 자리에 맞는 값을 선택하여 자리를 교체하면서 정렬을 수행하는 알고리즘
		
		int[] arr = { 4, 8, 2, 7, 6 };
		System.out.println(Arrays.toString(arr));		// 배열을 문자열 형식으로 출력해라.
		
		// 안보고 쓸 수 있게 연습 
		
		for(int i = 0; i < arr.length; i++) {		// 비교 기준의 순번 (index)
			for(int j = i + 1; j < arr.length; j++) { 	// 비교 대상의 순번   // j = i + 1 같은걸 반복하지 않기 위해
				if(arr[i] > arr[j]) {	// 앞이 값이 더 크면, 앞의 값과 뒤의 값을 교환한다.
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
