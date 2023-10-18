package Quiz;

import java.util.Random;

public class Quiz01 {
	public static void main(String[] args) {
		// 게시글 데이터의 총 개수가 주어지면
		// 여러 게시글을 총 몇개의 페이로 나누어서 불러와야 할지 계산하여 출력하세요
		// - 페이지 당 게시글 출력 개수는 10개이다
		// - 하나의 게시글이라도 생략되면 안된다.
		// - 총 게시글 수는 10000 ~ 99999 사이이다
		// - 요청으로 읽어들여야 할 게시글의 페이지 번호가 제시된다
		// - 출력으로 불러와야 할 게시글의 번호를 n번부터 n + 9까지 가져와야 한다
		
		
		Random ran = new Random();
		int boardCount = ran.nextInt(89999) + 10000;			// 총 게시글
		
		int pageCount = boardCount / 10;		// 수정되어야 함, 요청받은 페이지 - 
	
		int page = ran.nextInt(pageCount) + 1;
		int begin = page * 10 - 9, end = page * 10;
		
		if (boardCount % 10 != 0 ) {
			pageCount += 1;
		}
		
		// 예시 총게시르 개수		4096
		// 총페이지 개수		410
		// 요청받은 페이지개수	1	2	3	4	5  	...	409
		// 시작값 			1	11	21	31	41	...	4081
		// 끝값				10	20	30	40	50	...	4090
		
		
		
		System.out.println("총 게시글의 개수 : " + boardCount);
		System.out.println("총 페이지 수 : " + pageCount);
		System.out.println("요청받은 페이지 : " + page);
		System.out.printf("%d개의 게시글에서 %d페이지를 요청받았으므로, \n", boardCount, page);
		System.out.printf("%d번부터 %d번 게시글을 불러와서 출력하면 된다\n", begin, end);
		
		
		
		
	}

}
