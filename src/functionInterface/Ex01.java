package functionInterface;

interface Test {				// 함수형 인터페이스
	void method(String s);		// 인터페이스 중에서 추상메서드가 오직 하나만 있는 형식

}

class Repository{
	String[] arr = new String[] {
			"이지은","짱구","김태리","단비","유진초이"
	};
	
	public void forEach(Test lambda) {
		for(int i = 0; i < arr.length; i++) {				// 즉 list에는 for문 기본적인 것이 내장되어 있다.
			if(arr[i] != null) {							// 람다는 반복문 대신 쓴다고 생각해도 무관하다.
				lambda.method(arr[i]);
			}
		}
	}
}


public class Ex01 {
	public static void main(String[] args) {
		Repository repo = new Repository();
		
		repo.forEach(str -> System.out.println(str));
		System.out.println();
		
		repo.forEach(str -> System.out.println(str.length()));
		System.out.println();
		
		Test lambda = (str) -> {
			String odd = "홀수";
			if(str.length() % 2 == 0) {
				odd = "짝수";
			}
			System.out.println();
		};
		repo.forEach(lambda);
	}

}
