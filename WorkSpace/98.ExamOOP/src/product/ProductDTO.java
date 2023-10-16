package product;

public class ProductDTO {
	private int price , qty ;
	private String name;
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public ProductDTO(int price, int qty, String name) {
		this.price = price;
		this.qty = qty;
		this.name = name;
	}
	
	
	
}
