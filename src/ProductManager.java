package staticDemo;

public class ProductManager {
	static{
		System.out.println("static yapıcı blok çalıştı");
	}
	public void add(Product product) {
	int bisey=5;
	
	if(ProductValidator.isValid(product)) {
		System.out.println("eklendi");
	}else {
		System.out.println("ürün bilgileri geçersizdir.");
	}
	
}
	}
