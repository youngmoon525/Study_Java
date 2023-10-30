package pack03.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_ImageIO {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("img.jpg");
		FileOutputStream fos = new FileOutputStream("imgC1.jpg");
		int data , cnt = 0;
		while ( (data = fis.read()) != -1) {
			cnt++;
			//System.out.println(data);
			fos.write(data);
		}
		System.out.println(cnt);
		fos.flush();
		
		
	}
}
