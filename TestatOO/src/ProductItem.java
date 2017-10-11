
public class ProductItem extends Item {
	private int amount;
	private double pricePerUnit;
	
	public ProductItem(String description) {
		super(description);
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	
	@Override
	public double getPrice() {
		return pricePerUnit;
	}
	
	@Override
	public void print() {
		System.out.println("Bezeichnung: " + description + " Anzahl: " + amount + " Stückpreis"
				+ pricePerUnit);
	}

}
