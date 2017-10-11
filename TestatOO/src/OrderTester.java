
public class OrderTester {
	public static void main(String[] args) {
		ProductItem item1 = new ProductItem("Laptop XY");
		ServiceItem item2 = new ServiceItem("Auto waschen");
		ProductItem item3 = new ProductItem("Handy XXX");
		ProductItem item4 = new ProductItem("Stromkabel");
		ServiceItem item5 = new ServiceItem("Wohnung putzen");
		Item[] items = new Item[] {item1, item2, item3, item4, item5};
		
		Order order = new Order(items);
		order.printItems();		
	}
}
