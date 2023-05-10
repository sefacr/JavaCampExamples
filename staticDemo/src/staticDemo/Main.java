package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product(1, "computer", 32500);
		manager.add(product);
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
	}

}
