
public class Item {
	private final String description;

	public Item(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return 0d;
	}
	
	public void print() {
		System.out.println("Bezeichnung " + description);
	}
}
