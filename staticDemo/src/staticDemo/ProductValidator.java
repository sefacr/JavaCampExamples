package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("static constructor");
	}
	public ProductValidator() {
		System.out.println("normal constructor static methodda çalışmaz");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		System.out.println("constructor bu methodda çalışır");
	}
	
}
