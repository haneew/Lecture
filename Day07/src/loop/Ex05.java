package loop;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		// 입력받은 숫자를 이용하여 진행상황 출력하기
		Scanner sc = new Scanner(System.in);
		int maxSize = 100;													// 전체 진행률을 100%로 보여주기 위해 100값을 잡았고
																			// 실행할때는 양이 많아서 절반으로 진행했다.
																			// 그래서 for문 만에 각 사이즈를 50값은 / 2, 25값은 / 4 로 설정해뒀다.
		int currentSize;
		System.out.println("현재 진행률 입력 : ");
		currentSize = sc.nextInt();											
		
		System.out.print("[");
		for(int i = 0; i < maxSize / 2; i++) {								// 총 크기는 50칸
			if(i == maxSize / 4 ) {											// 50칸의 절반위치에 진행률 숫자를 출력
				System.out.printf(" %3d %% ", currentSize);
			}
			else if(i <= currentSize /2) {									// 입력퍼센트의 절반보다 작으면
				System.out.print("#");										// #을 이용하여 현재 진행된 영역을 표시
			}
			else {															// 입력 퍼센트의 절반보다 같거나 크면
				System.out.print("_");										// 공백 혹은 언더바를 이용하여 진행되지 않음을 표시
			}
			Thread.sleep(200);												// 나타나는데 시간 설정
		}
		System.out.println("]");
		sc.close();
		
	}

}
