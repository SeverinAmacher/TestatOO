public class BundleItem extends Item {
	private Item[] bundleItems;
	private double discount;
	
	public BundleItem(String description) {
		super(description);
		bundleItems = new Item[50];
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public void addItem(Item item) {
		for(int i = 0; i < bundleItems.length; i++) {
			if(bundleItems[i] == null) {
				bundleItems[i] = item;
				break;
			}
		}
	}
	
	public void remove(Item item) {
		for(int i = 0; i < bundleItems.length; i++) {
			if(bundleItems != null && bundleItems[i].equals(item)) {
				bundleItems[i] = null;
				break;
			}
		}
	}
	
	@Override
	public double getPrice() {
		double price = 0;
		for(Item item : bundleItems) {
			if(item != null) {
				price += item.getPrice();
			}
		}
		return price / 100 * (100 - discount);
	}
	
	@Override
	public void print() {
		System.out.println("BundleItem");
		System.out.println("Bezeichnung: " + this.description + " Rabatt: " + this.discount);
		for(Item item : bundleItems) {
			if(item != null) {	
				item.print();
			}
		}
	}
}
