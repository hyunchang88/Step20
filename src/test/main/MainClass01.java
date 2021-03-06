package test.main;

import java.io.File;

public class MainClass01 {
	public static void main(String[] args) {
		
		/*
		 *	 	c:/myFolder 를 엑세스 할 수 있는 File 객체 생성해서
		 * 		참조값을 변수에 담기
		 */
		
		String path = "c:/myFolder";
		File file1 = new File(path);
		
		if(file1.exists()){
			System.out.println(path+" 는 이미 존재 합니다.");
			// 디렉토리인지 판별
			if(file1.isDirectory()){
				System.out.println(path+" 는 디렉토리 입니다.");
			}else{
				System.out.println(path+" 는 파일 입니다.");
			}
		}else{
			System.out.println(path+" 는 존재하지 않습니다.");
			// 디렉토리 만들기
			file1.mkdir();
		}
	}
}
