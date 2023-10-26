package WildAlaskan.product;
public abstract class Product {
	protected String name;
	protected double price;
	protected String type;

	public Product(String name, double price, String type) {
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}
}
