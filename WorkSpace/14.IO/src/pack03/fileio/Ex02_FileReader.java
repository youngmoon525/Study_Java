package pack03.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex02_FileReader {
	public static void main(String[] args) throws IOException {
		File file = new File("Ex02_FileWriter\\file.txt");
		if(file.exists()) {
			System.out.println("작업시작");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String str = "";
			while( (str = br.readLine() ) != null) {
				System.out.println(str);
			}
		}else {
			System.out.println("없음?");
		}
	}
}
