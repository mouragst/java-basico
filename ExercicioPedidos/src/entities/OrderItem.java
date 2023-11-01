package entities;

public class OrderItem {
	
	private int quantity;
	private Double price;
	
	private Product product;
	
	public OrderItem() {
	}
	
	public OrderItem(int quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProducts() {
		return product;
	}

	public void setProducts(Product products) {
		this.product = products;
	}

	public double subTotal() {
		return quantity * price;
	}
	
	public String toString() {
		return getProducts().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity 
				+ ", Subtotal: "
				+ String.format("%.2f", subTotal());
	}
	
}
