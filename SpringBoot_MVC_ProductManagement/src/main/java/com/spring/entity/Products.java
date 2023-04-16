package com.spring.entity;
import javax.persistence.*;

@Entity
@Table(name="product_items")
public class Products {
	@Id
	@GeneratedValue(strategy =   GenerationType.IDENTITY)
	private long id;
	private String productName;
	private String description;
	private String price;
	private String quantity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + productName + ", description=" + description + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

}
