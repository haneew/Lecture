package oop;

import java.util.Arrays;

class Stack{
	int[] arr = new int[5];
	int top;
}
public class Ex02 {
	
	// push 함수와 pop 함수는 Stack에 대해서 작동하는 함수이므로
	// 매개변수에 반드시 Stack이 포함되어야 한다
	// 아래 두 함수는 Stack관련 코드가 아닌곳에서는 절대 사용할 수 없다.
	static void push(Stack stack, int data) {
		for(int i = 0; i < stack.arr.length; i++) {
			if(stack.arr[i] == 0) {		// 빈칸을 찾았다면
				stack.arr[i] =data;		// 데이터를 넣고
				stack.top = i;			// 마지막으로 넣은 데이터의 위치(index)를 top에 저장한다.
				return;
			}
		}
	}
	
	static int pop(Stack stack) {
		int num = -1;
		for(int i = stack.top; i != -1; i--) {		// 배열을 top부터 거꾸로 순회하면서
			if(stack.arr[i] != 0) {					// 0이 아닌 데이터가 있으면
				num = stack.arr[i];					// 그 데이터를 num에 복사해두고
				stack.arr[i] = 0;					// 원래 데이터가 있던 자리에는 0을 넣어서 빈칸으로 만들고
				if(stack.top != 0) {				// top을 한칸 내려야 하는데 0이면 마지막값이니까 처리하지 않음
					stack.top =i - 1;				// top을 한칸 내려서 마지막 데이터가 어디있는지 알려준다.
				}
				break;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		
		push(stack, 10);		// 스택에 10을 넣는다
		System.out.println(Arrays.toString(stack.arr)); 		// 첫 스택 확인
		
		push(stack, 20);		// 스택에 10을 넣는다
		System.out.println(Arrays.toString(stack.arr));			// 두번째 스택 확인
		
		push(stack, 30);		// 스택에 10을 넣는다
		System.out.println(Arrays.toString(stack.arr));			// 세번째 스택 확인
		
		
		System.out.println(Arrays.toString(stack.arr));			// 스택 내용 확인
		System.out.println("top : " + stack.top);				// top이 어느 데이터를 가리키는지 확인.
		System.out.println("top : " + stack.arr[stack.top]); 	// top이 가리키는 데이터
		System.out.println();
		
		System.out.println("pop : " + pop(stack));
		System.out.println("pop : " + pop(stack));
		System.out.println("pop : " + pop(stack));
	}

}
