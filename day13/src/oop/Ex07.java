package oop;

class Card{
	int num;
	String ch;
	
	Card(String ch, int num){
		this.num = num;
		this.ch = ch;
	}
	void show() {
		System.out.printf("[%s, %d]\n", ch, num);
	}
}

public class Ex07 {
	public static void main(String[] args) {
		// 하나의 자료형이 여러 객체를 생성해야 하는데
		// 모양은 같아도 객체마다 서로 다른 값을 가져야 할 경우를 생각해보자.
		
//		Card test = new Card();			(X)
		Card ob1 = new Card("♣", 7);
		Card ob2 = new Card("♥", 7);
		Card ob3 = new Card("♠", 7);
		Card ob4 = new Card("◈", 6);
		Card ob5 = new Card("♣", 5);
		
		Card[] arr = { ob1, ob2, ob3, ob4, ob5 };
		for(Card c : arr) {
			c.show();
		}
		
	}
}
