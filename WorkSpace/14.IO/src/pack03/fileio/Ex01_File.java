package pack03.fileio;

import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		//String path = Ex01_File.class.getResource("").getPath();
		//System.out.println(path);
		File file = new File("IOFolder");
		//boolean isFile = file.exists();//파일 경로 (파일 객체 초기화에 사용한경로)있는지 확인
		//mkdir();<=make directory 실제 파일의 경로를 만들어냄.
		if(file.exists()) {
			System.out.println("해당 경로 또는 파일이 있음.");
		}else {
			System.out.println("해당 경로 또는 파일이 없음.");
			file.mkdir();
		}
	}
}
