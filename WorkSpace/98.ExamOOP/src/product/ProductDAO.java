package product;

import common.Common;

public class ProductDAO {
	Common common;
	public ProductDAO(Common common) {
		this.common = common;
		System.out.println("참조 번지 : " + this.common);
	}
	
	public void addItem() {
		displayItems();
		System.out.println("가격 입력 엔터 , 수량 입력 엔터 , 상품명 입력 엔터 ");
		ProductDTO newDto = new ProductDTO(common.getIntScanner(100), 
				common.getIntScanner(0), common.getStrScanner());
		ProductDTO[] tempDtos = new ProductDTO[common.items.length+1];
		for (int i = 0; i < common.items.length; i++) {
			tempDtos[i] = common.items[i];
		}
		tempDtos[tempDtos.length-1] = newDto;
		common.items = tempDtos;
		displayItems();
	}
	
	public void buyItem() {
		displayItems();
		System.out.println("1~"+common.items.length + " 선택 ");
		int i = common.getIntScanner(1 , common.items.length)-1;
		if(common.items[i].getQty() == 0) {
			System.out.println("수량부족!!!!");
			return;
			//buyItem();
		}else if(common.loginInfo.getMoney() >= common.items[i].getPrice()) {
			System.out.println("구매 완료.");
			common.loginInfo.setMoney(common.loginInfo.getMoney()-common.items[i].getPrice());
			common.items[i].setQty(common.items[i].getQty()-1);
		}else {
			System.out.println("금액부족!!");
		}
		
	}

	public void displayItems() {
//		for (ProductDTO dto : common.items) {
//			foreach : 따로 변수를 하나 외부에 만들고 증감식 통해서 보여줘야함.	
//		}
		for(int i=0; i<common.items.length; i++) {
			System.out.print((i+1)+"."+common.items[i].getName());
			System.out.print("("+common.items[i].getPrice()+"원)");
			System.out.print(" "+common.items[i].getQty()+"개 남음\r\n");
		}
	}
	
	//상품정보 초기화
	public ProductDTO[] initItems() {
		ProductDTO[] dtos = new ProductDTO[3];
		dtos[0] = new ProductDTO(1000, 10, "마우스");
		dtos[1] = new ProductDTO(1900, 5, "키보드");
		dtos[2] = new ProductDTO(9000, 1, "스피커");
		return dtos;
	}
}
