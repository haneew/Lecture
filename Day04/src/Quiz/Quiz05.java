package Quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int eleA, eleB, eleC;
		
		eleA = ran.nextInt(15) + 1; // 1 ~ 15 
		eleB = ran.nextInt(15) + 1; // 1 ~ 15 
		eleC = ran.nextInt(15) + 1; // 1 ~ 15
		
		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
		
		
		// 현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출력하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다.)
		
		int floor, num1, num2, num3;
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("현재 층수를 입력하세요 : ");
	    floor = sc.nextInt();
	    
	    num1 = floor - eleA;
	    num2 = floor - eleB;
	    num3 = floor - eleC;			//최소 층을 구함. 하지만 음수 일 수 있음
	    
	    if(num1 < 0) {
	    	num1 = -num1;
	    }
	    if(num2 < 0) {
	    	num2 = -num2;
	    }
	    if(num3 < 0) {
	    	num3 = -num3;
	    }							// 절대값으로 변환함

	    int min = num1;
	    if(min < num2) min = num2;
	    if(min > num3) min = num3;  // 가장 가까운 층을 찾음, 근데 eleA, eleB, eleC 어떤건지 구별이 안됨.
	    
	    
	    		

	    
	    
	    sc.close();
    
	}

}
