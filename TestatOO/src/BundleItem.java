
public class BundleItem extends Item{
	private Item[] bundleItems;
	private double discount;
	
	public BundleItem(String description) {
		super(description);
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public double getPrice() {
		double price = 0;
		for(int i = 0; i < bundleItems.length; i++) {
			price += bundleItems[i].getPrice();
		}
		return price / 100 * (100 - discount);
	}
	
	@Override
	public void print() {
		for(int index = 0; index < bundleItems.length; index++) {
			System.out.println("Bezeichnung: " + this.description + "Rabatt: " +
					discount + " " + bundleItems[index]);
		}
	}
}
