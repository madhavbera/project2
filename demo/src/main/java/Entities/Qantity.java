package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Quantity")
public class Qantity {
	@Id
	private int id;
	private String quantity_name;
	private double quantity_price;
	public Qantity( String quantity_name, double quantity_price) {
		super();
//		this.id = id;
		this.quantity_name = quantity_name;
		this.quantity_price = quantity_price;
	}
	public Qantity() {
		super();
	}
	public int getQuantity_id() {
		return id;
	}
	public void setQuantity_id(int quantity_id) {
		this.id = quantity_id;
	}
	public String getQuantity_name() {
		return quantity_name;
	}
	public void setQuantity_name(String quantity_name) {
		this.quantity_name = quantity_name;
	}
	public double getQuantity_price() {
		return quantity_price;
	}
	public void setQuantity_price(double quantity_price) {
		this.quantity_price = quantity_price;
	}
	
	
	

}
