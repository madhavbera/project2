package Entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class Product {
	  @jakarta.persistence.Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
        private int Id;
//	  @Column(name="Product_name")
	  private String ProductName;
	  private float price;
	  @Column(name="product_discount")
	  private int discount;
	  public Product( String ProductName, float price,int discount) {
		super();
	
		this.ProductName = ProductName;
		this.price = price;
		this.discount=discount;
	  }
	  public Product() {
		super();
	  }
	  
	  public int getDiscount() {
		return discount;
	}
	  public void setDiscount(int discount) {
		  this.discount = discount;
	  }
	  public int getId() {
		  return Id;
	  }
	  public void setId(int id) {
		  Id = id;
	  }
	  public String getProduct_name() {
		  return ProductName;
	  }
	  public void setProduct_name(String ProductName) {
		
		  this.ProductName = ProductName;
	  }
	  public float getPrice() {
		  return price;
	  }
	  public void setPrice(float price) {
		  this.price = price;
	  }
	  
        
}
