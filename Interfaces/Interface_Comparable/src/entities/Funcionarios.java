package entities;

public class Funcionarios implements Comparable<Funcionarios>{

	private String name;
	private Double price;
	
	public Funcionarios(String name, Double price) {
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

	@Override
	public int compareTo(Funcionarios o) {
		return -price.compareTo(o.getPrice());
	}
	
	
}
