package loop;

import java.io.File;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception {
		
		File f = new File("src/loop/Ex01.java");
		System.out.println(f.exists()); //지정한 파일이 실제로 존재하는가?
		
		Scanner sc = new Scanner(f);
		// 코드를 작성하는 시점에서는 대상 파일의 정확한 줄 수를 알기 어려울 수도 있다.
		// 반복을 수행할 때 마다, 다음줄이 있는지 확인해보고
		// 다음 줄이 있으면 내용을 가져와서 출력
		
		while(sc.hasNextLine()){				// 다음 줄 내용이 있는지 없는지 확인
			String line = sc.nextLine();		// 다음 한 줄을 line에 저장
			System.out.println(line);			// 가져온 내용을 출력
		}
		sc.close();
	}

}
