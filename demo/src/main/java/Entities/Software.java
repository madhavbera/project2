package Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="software")
public class Software {
	@Id
	private int id;
	private String software_type;
	@OneToOne
	@JoinColumn(name="hardware_id")
	private Hardware hardware;
	public Software(int id, String software_type,Hardware hardware) {
		super();
		this.id = id;
		this.software_type = software_type;
		this.hardware=hardware;
	}
	public Software() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoftware_type() {
		return software_type;
	}
	public void setSoftware_type(String software_type) {
		this.software_type = software_type;
	}
	public Hardware getHardware() {
		return hardware;
	}
	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}
	
	

}
