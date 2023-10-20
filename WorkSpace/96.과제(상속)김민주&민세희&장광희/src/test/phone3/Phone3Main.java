package test.phone3;

import java.util.Scanner;

import test.phone2.*;

public class Phone3Main extends Phone2Main {
	
	
	
	public static void main(String[] args) {
		
//		Phone3DTO phone3dto = new Phone3DTO(null, null, null, null);
		
		Phone3DAO phone3dao = new Phone3DAO();
		
//		phone3dao.PowerOn(false);
		phone3dao.webtoonApp();
		
		
}
}