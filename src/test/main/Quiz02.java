package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 		MainClass04 를 참고해서
 * 
 * 		Scanner 객체를 이용해서 문자열을 5줄 입력받고
 * 		입력받은 내용을
 * 		c:/myFolder/quiz02.txt 파일에 기록해 보세요.
 * 
 * 		hint : StringBuilder 객체 사용하기
 */
public class Quiz02 {
	public static void main(String[] args) {
		
		// 키보드로 부터 입력 받을 객체
		Scanner scan = new Scanner(System.in);

		String path = "c:/myFolder/quiz02.txt";
		// 파일객체
		File file = new File(path);
		
		try {
			// 파일에 문자열을 기록하기 위한 객체
			FileWriter fw = new FileWriter(file);
			// 문자열을 누적시킬 StringBuilder 객체 생성하기
			StringBuilder builder = new StringBuilder();
			
			for(int i=0; i<5; i++){
				System.out.print("문자열 입력:");
				String str = scan.nextLine();
				// 읽어들인 문자열을 누적 시킨다.
				builder.append(str);
				builder.append("\r\n"); // 개행기호도 누적시키기
			}
			// 파일에 기록하기
			fw.write(builder.toString());
			fw.close();
			System.out.println("파일에 문자열을 기록 했습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
}
