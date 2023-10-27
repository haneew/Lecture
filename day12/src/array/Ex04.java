package array;

import java.util.Arrays;
import java.util.Random;

public class Ex04 {
	public static void main(String[] args) {
		// 랜덤 정수 10개를 배열에 저장하여
		// 그 중 가장 큰 수와 가장 작은 수를 구하여 출력하기.
		
		
		Random ran = new Random();
		int[] arr = new int[10];		// 길이를 지정함. 값은 모두 0으로 초기화됨
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			
		}
		System.out.println(Arrays.toString(arr));
		
		int min = Integer.MAX_VALUE;	// 최소값을 구하기 위해 ------min 값 안에 이미 최소값이 들어가있다면 코드를 돌렸을때 대입이 되지 않는다
		int max = Integer.MIN_VALUE;	// 최대값을 구하기 위해		 이미 최소값이기 때문에.
		
		// 최소값을 구하려면 일단 최대값을 넣어두고, 그보다 작은 수가 들어오면 교체한다.
		// 최대값을 구하려면 일단 최소값을 넣어두고, 그보다 큰 수가 들어오면 교체한다.
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("배열에서의 최소값 : " + min);
		System.out.println("배열에서의 최대값 : " + max);
				
		
		
		
		
		
	}

}
