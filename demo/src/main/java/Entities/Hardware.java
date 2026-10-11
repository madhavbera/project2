package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hardware")
public class Hardware {
	@Id
	private int id;
	private String hardware_name;
	private  double hardware_price;
	public Hardware(int id, String hardware_name, double hardware_price) {
		super();
		this.id = id;
		this.hardware_name = hardware_name;
		this.hardware_price = hardware_price;
	}
	public Hardware() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHardware_name() {
		return hardware_name;
	}
	public void setHardware_name(String hardware_name) {
		this.hardware_name = hardware_name;
	}
	public double getHardware_price() {
		return hardware_price;
	}
	public void setHardware_price(double hardware_price) {
		this.hardware_price = hardware_price;
	}
	

}
