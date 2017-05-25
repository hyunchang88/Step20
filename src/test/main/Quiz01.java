package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 		MainClass04 를 참고해서
 * 
 * 		Scanner 객체를 이용해서 문자열 1줄 입력받고
 * 		입력받은 내용을
 * 		c:/myFolder/quiz01.txt 파일에 기록해 보세요
 */
public class Quiz01 {
	public static void main(String[] args) {
		
		// 키보드로 부터 입력 받을 객체
		Scanner scan = new Scanner(System.in);

		String path = "c:/myFolder/quiz01.txt";
		// 파일객체
		File file = new File(path);
		
		try {
			// 파일에 문자열을 기록하기 위한 객체
			FileWriter fw = new FileWriter(file);
			// 문자열 한줄 읽어 들이기
			System.out.println("문자열 입력:");
			String line = scan.nextLine();
			fw.write(line);
			fw.close();
			System.out.println("파일에 문자열을 기록 했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	}
}
