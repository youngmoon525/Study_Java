package pack02.testinterface;

public class ProductDAO implements ProductInterface{

	public ProductInterface[] rtnInter() {
		ProductInterface[] pArr = new ProductInterface[4];
		return pArr;
	}
	
	public String[] rtnArr() {
		String[] arr = new String[4];
		return arr;
	}
	
	// 상품정보 5건을 담아 return하는 메소드 initDtos를 완성하기
	@Override
	public ProductDTO[] initDtos() {
		ProductDTO[] dtos = new ProductDTO[5];
		//ProductDTO dto1 = new ProductDTO(1, 1000, "상품명1");
		dtos[0] = new ProductDTO(1, 1000, "상품명1");
		dtos[1] = new ProductDTO(2, 1123, "상품명2");
		dtos[2] = new ProductDTO(3, 1124, "상품명3");
		dtos[3] = new ProductDTO(4, 1125, "상품명4");
		dtos[4] = new ProductDTO(5, 1126, "상품명5");
		
		return dtos;
	}

	// 상품정보를 담고있는 배열 dtos를 입력받아 내부 내용(상품번호,명,가격)을 출력하는 메소드
	//display를 완성하기
	@Override
	public void display(ProductDTO[] dtos) {
		System.out.println(COMPANY_NAME);
		for(int i=0; i<dtos.length; i++) {
			System.out.println(dtos[i].getNum() + "." + dtos[i].getName() + " "+dtos[i].getPrice());			
		}
	}
	
	//각각의 메소드 출력은 ProductMain에서 한다.

}
