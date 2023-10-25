package function;

import java.util.Arrays;

// 주어진 배열에서 가장 등장빈도가 많은 값을 구하세요.
// 가장 많이 등장한 값의 횟수가 아니라, 값 그 자체를 반환해야 합니다.
// 최빈값이 2개 이상이면 -1을 반환해야 합니다.

// 0 < array의 길이 < 100
// 0 < array의 원소 < 1000

/*	array 내부 숫자의 등장 빈도를 counts에 기록하기
 
  	counts 에서 최대값과 그 index를 찾기
  	
  	최대값이 1개이면 answer에 그대로 담고, 최대값이 2개 이상이면 -1를 담는다.
  	
 */
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // 원소의 최대값을 먼저 구하고, 그 길이만큼의 배열을 생성하여 횟수체크에 사용한다.
        // 이 과정을 생략하고 싶다면 길이 1001의 배열을 생성하면 된다.
        // +1이 들어가는 이유는 0부터 index의 특성상 계산이 번거로워져서
        int max = 0;
        for(int i = 0; i < array.length; i++) {
        	if(max < array[i]) {
        		max = array[i];
        	}
        }
        int[] counts = new int[max + 1];    // 배열을 새로 만들면 { 0, 0, 0, 0, 0, 0, ... 0, 0 } 처럼 초기화 되어있다.
        
        // array 내부 숫자의 등장 빈도를 counts에 기록하기
        
        for(int i = 0; i < array.length; i++) {
        	int num = array[i];
        	counts[num] += 1;
        }
//        System.out.println(Arrays.toString(array)); 						// 중간 확인용
//        System.out.println(Arrays.toString(counts));
           
        // counts 에서 최대값과 그 index를 찾기
        
        max = 0;
        for(int i = 0; i < counts.length; i++) {
        	int num = counts[i];
        	if(max < num) {
        		max = num;				// 가장 높은 등장빈도수 찾기
        			answer = i;			// 최대값을 찾았을 때 그 위치(index)도 answer에 저장한다.
        	}
        }
        System.out.println("max : " + max);
        System.out.println("answer : " + answer);
        
        // 최대값이 1개이면 answer에 그대로 담고, 최대값이 2개 이상이면 -1를 담는다.
        int dup = 0; 	// 중복체크를 위한 변수
        for(int i = 0; i < counts.length; i++) {
        	if(counts[i] == max) {
        		dup++;
        	}
        }
        System.out.println("dup : " + dup);
        System.out.println("==============================");
        if(dup > 1 ) {				// 최대값이 1을 초과하면 ( 2개 이상이
        	answer = -1;			// 최빈값이 유일하지 않으므로, -1을 대입하여 반환하도록 한다.
        }
        
        // 최빈값을 answer에 담아서 반환하면 된다.
        
        // array에서 가장 많이 등장한 값을 찾아야 한다
        // array의 각 값이 등장한 횟수를 체크해야 한다.
        // 횟수에서 최대값을 찾아서, 횟수가 아닌 가장 많이 등장한 값을 answer에 담는다.
        // 만약, 횟수에서 최대값이 중복된다면 answer에 -1을 담는다.
        
        
        return answer;
    }   
    
}   
    
public class Pro120812 {
	public static void main(String[] args) {
	Solution s = new Solution();
//	int answer1 = s.solution(new int[] {1, 2, 5, 5, 5, 4});
//	int answer2 = s.solution(new int[] {1, 1, 2, 2 });
//	int answer3 = s.solution(new int[] {1});

//	System.out.println(answer1);
//	System.out.println(answer2);
//	System.out.println(answer3);
	
	
	}
}
