
public class OrderTester {
	public static void main(String[] args) {
		ProductItem item1 = createProductItem("Laptop XY", 1, 1350);
		ServiceItem item2 = createServcieItem("Auto waschen", 25);
		ProductItem item3 = createProductItem("Handy XXX", 1, 250.95);
		ProductItem item4 = createProductItem("Stromkabel", 3, 5.50);
		ServiceItem item5 = createServcieItem("Wohnung putzen", 55);
		
		Order order = new Order(new Item[] {item1, item2, item3, item4, item5});
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
}
