
public class OrderTester {
	public static void main(String[] args) {
		ProductItem item1 = createProductItem("Laptop XY", 1, 1350);
		ServiceItem item2 = createServcieItem("Auto waschen", 25);
		ProductItem item3 = createProductItem("Handy XXX", 1, 250.95);
		ProductItem item4 = createProductItem("Stromkabel", 3, 5.50);
		ServiceItem item5 = createServcieItem("Wohnung putzen", 55);
		
		BundleItem item6 = createBundleItem("Ostern", 0.5);
		BundleItem item7 = createBundleItem("Osterhase", 0.75);
		item7.addItem(createProductItem("Schoggi", 6, 1.20));
		item7.addItem(createServcieItem("Eier verstecken", 10));
		item6.addItem(createProductItem("Eier", 6, 1.20));
		item6.addItem(createServcieItem("Eier anmalen", 10));
		ProductItem item8 = createProductItem("Samiklaus", 6, 1.20);
		item6.addItem(item8);
		item6.remove(item8);
		item6.addItem(item7);
		Order order = new Order(new Item[] {item1, item2, item3, item4, item5, item6});
		order.printItems();		
	}
	
	private static ProductItem createProductItem(String description, int amount, double pricePerUnit) {
		ProductItem productItem = new ProductItem(description);
		productItem.setAmount(amount);
		productItem.setPricePerUnit(pricePerUnit);
		return productItem;
	}
	
	private static ServiceItem createServcieItem(String description, double price) {
		ServiceItem serviceItem = new ServiceItem(description);
		serviceItem.setPrice(price);
		return serviceItem;
	}
	
	private static BundleItem createBundleItem(String description, double discount) {
		BundleItem item = new BundleItem(description);
		item.setDiscount(discount);
		return item;
	}
}
