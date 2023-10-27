package quiz;

import java.util.Arrays;

public class Quiz01 {
	public static void main(String[] args) {
		
		int[] arr = { 9, 54, 23, 72, 99, 85, 31, 16, 49, 62 };
		
		// 1) arr에서 홀수의 개수와 짝수의 개수를 각각 변수에 담아서 출력하세요
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < arr.length; i ++) {
			if(arr[i] % 2 == 0) {
				count1 += 1;
			}
			else {
				count2 += 1;
			}
			
		}
		System.out.printf("짝수는 %d개, 홀수는 %d개", count1, count2);
		System.out.println();
		
		// 2) arr에서 홀수만 골라서 합계를 구한 다음 출력하세요
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println("홀수의 합계 : " + sum);
		
		// 3) arr에서 짝수만 골라서 새로운 배열 arr2에 저장하고 출력하세요
		// [] : 배열 생성시에는 길이를 지정한다 (리터럴 및 변수 사용 가능)
		//		생성된 배열에 대해 사용하면 길이가 아니라, index를 지정한다
		
		// 원본배열의 길이는 10이고, 새로운 배열의 길이는 4다.
		// 실이가 서로 다르기 때문에, 원본배열의 index와 신규배열의 index를 따로 관리해야 한다.

		int[] arr2 = new int[count1];
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				arr2[j] = arr[i];
				j++;						// 원하는 값을 찾았을때만 1증가 시켜준다.
			}
		}
		System.out.println(Arrays.toString(arr2));

		
		// 4) arr의 내용을 거꾸로 담은 배열 arr3를 만들어서 출력하세요
		int[] arr3 = new int[arr.length];
		int k = 0;
		for(int i = arr.length -1; i >= 0; i--) {
			//		시작				도착
//			k = arr.length -1 - i;   이렇게 해도 된다. for문에 0지정했을때 
			arr3[k] = arr[i];
			k++;
		}
		System.out.println(Arrays.toString(arr3));
		
		// 5) arr를 내림차순 정렬한 후 다시 출력하세요						// 선택정렬 
		for(int i = 0; i < arr.length; i++) {
			for(int a = i + 1; a < arr.length; a++) {
				if(arr[i] < arr[a]) {		// 오름차순과 내림차순은 크기 비교에 의해서 결정된다.
					int tmp = arr[i];
					arr[i] = arr[a];
					arr[a] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
