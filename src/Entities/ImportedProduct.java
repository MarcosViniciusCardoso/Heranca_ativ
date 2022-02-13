package Entities;

public class ImportedProduct extends Product{
	private Double customsFee; //taxa alfandegária
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	

	
	public double totalPrice() {
		return super.getPreco() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return"Nome do produto: " +getName()+"- Preço: "+getPreco()+ "- Taxa alfandegária: "+ String.format("%.2f", customsFee) + "- preco Total: " + String.format("%.2f", totalPrice());
	}
	
}
