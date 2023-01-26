package entities;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static String staticFunction(Product p) { //using Function in method static
		return p.getName().toUpperCase();
	} 
	
	public String nonStaticFunction () { //using Function in method
		return getName().toUpperCase();
	} 
	
	@Override
	public String toString() {
		return "Product [ name = " + name + ", price = " + price + "]";
	}
	
	
}
