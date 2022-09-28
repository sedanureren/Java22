package h2.ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product2=new Product(1,"laptop","asus",1000,2,"Siyah");
		Product product=new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus");
		product.setPrice(5000);
		product.setStockAmount(3);
		ProductManager manager= new ProductManager();
		manager.Add(product);
		System.out.println(product.getKod());
		System.out.println(product2.getKod());
	}

}
