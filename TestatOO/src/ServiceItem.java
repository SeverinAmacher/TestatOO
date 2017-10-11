
public class ServiceItem extends Item {
	private double price;
	
	public ServiceItem(String description) {
		super(description);
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public double getPrice() {
		return price;
	}
}
