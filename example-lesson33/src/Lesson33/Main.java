package Lesson33;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("MacBook");
		product1.setDescription("M1 Pro");
		product1.setPrice(32000);
		product1.setStockAmount(3);
		
		Product product2 = new Product(2,"ASUS","Zen",3000,5,"Siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.add(product1);
		
		System.out.println(product1.getKod());
		System.out.println(product2.getRenk());
	}

}
