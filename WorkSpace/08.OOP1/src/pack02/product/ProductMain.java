package pack02.product;

public class ProductMain {
	public static void main(String[] args) {
		//ProudctDTO를 하나 객체로 만들고 필드(변수,?) 전체에 값 할당 후 출력
		//Array(배열)->데이터타입[] 해당하는 타입을 담고 있는 배열->크기
		ProductDTO[] dtos = new ProductDTO[5];
		
		
		//ProductDTO dto1 = new ProductDTO(1 , 6900 , "스카프");
		//ProductDTO dto2 = new ProductDTO(2 , 5700 , "마늘");
		//ProductDTO dto3 = new ProductDTO(3 , 3600 , "커피");
		
		//dtos[0] = dto1;
		dtos[0] =  new ProductDTO(1 , 6900 , "스카프");
		dtos[1] = new ProductDTO(2 , 5700 , "마늘");
		dtos[2] = new ProductDTO(3 , 3600 , "커피");
		dtos[3] = new ProductDTO(4 , 3600 , "커피");
		dtos[4] = new ProductDTO(5 , 3600 , "커피");
		
		
		
		ProductDAO dao = new ProductDAO();
		dao.displays(dtos);
		
		//dao.display(dtos[1]);
		//dao.display(dtos[2]);
		
		
		//ProductDAO 클래스를 만듬.
		//display기능 추가
		//-> ProductDTO를 입력받아 내부에 있는 속성을 전체 출력함.
		
		//Main에서 ↑이용해서 내용 출력해보기
		
		
		
		
		
		
		
//		dto.setNum(1);
//		dto.name = "~~스카프";
//		dto.setPrice(6900);
//		System.out.println(dto.name + dto.getPrice() +"원");
//		
		//dto.price = -6900;
		//System.out.println(dto.num + " . " + dto.name + " : " + dto.price + "원");
	}
}
