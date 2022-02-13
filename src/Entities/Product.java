package Entities;

public class Product {
	private String name;
	private Double price;
	
	public Product () {}

	
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

	public Double getPreco() {
		return price;
	}

	public void setPreco(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return "Nome: "+ name + " Pre�o: "+ String.format("%.2f ",price);  
	}
	
	public void imprimirdados() {
		System.out.println(this);
	}
	
	
}
