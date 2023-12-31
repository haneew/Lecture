package quiz;

import java.util.Scanner;

class TV{
	// TV의 속성을 필드로 작성하세요
	// 전원, 채널, 볼륨
	boolean power;
	boolean mute;
	int channel;
	int vol;
	
	// TV의 기능을 메서드로 정의하세요
	// 전원 on/off , 채널 올림/내림, 볼륨 올림/내림, TV상태 출력, 음소거
		
		
	
	// 채널은 일정 범위안에서 cycle 형식으로 순환되어야 합니다
	// 볼륨은 일정 범위안에서 최소 최대치를 넘길 수 없습니다.
	// 음소거는 한번 누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복귀어야 합니다
	// 대부분의 기능은 전원이 켜져있는 상태에서만 작동해야 합니다.
	void turn() {
		power = !power;
		if(power) {
			System.out.println("전원이 켜졌습니다.");
		}
		else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	void channelUp() {
		channel ++;
		if(channel > 20) {
			System.out.println("현재 채널 : " + channel);
		}
	}
	void channelDown() {
		channel --;
		if(channel < 1) {
			System.out.println("현재 채널 : " + channel);
		}
	}
	void mutee() {
		mute = !mute;
		if(mute) {
			System.out.println("음소거 활성화");
		}
		else {
			System.out.println("음소거 비활성화");
		}
	}
	void volUp() {
		if(mute) {
			mutee();
		}
		if(vol < 40) {
			vol ++;
		}
		System.out.println("현재 볼륨 : " + vol);
	}
	void volDown() {
		if(mute) {
			mutee();
		}
		if(vol > 0) {
			vol --;
		}
		System.out.println(" 현재 볼륨 :" + vol);
	}
	
	// 생성자에게 객체 생성 시 초기값을 지정하세요
	// 매개변수로 받지 않아도 초기값을 지정할 수 있습니다.
	// 예를 들면 채널의 초기값이 0인것은 이상합니다. 다른 값이 초기값이 되도록 하세요
}


public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		
		
		LOOP : while(true){
			System.out.println("");
			System.out.println("");
			System.out.println("선택 >>>");
			menu = sc.nextInt();
			switch(menu) {
			// 입력된 메뉴에 따라서 tv 객체의 메서드를 호출하는 형태로 진행
			case 7:
				tv.channelUp();
				break;
			case 6:
				tv.channelDown();
			case 5:
				tv.volUp();
			case 4:
				tv.volDown();
			case 3:
				tv.mute;
				
			case 0:
				break LOOP;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

}
