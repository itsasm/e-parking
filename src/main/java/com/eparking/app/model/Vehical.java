package com.eparking.app.model;

import com.eparking.app.enums.VehicalType;

public class Vehical {

	private int id;
	private String model;
	private String make;
	private VehicalType type;
	private String vechicalNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public VehicalType getType() {
		return type;
	}

	public void setType(VehicalType type) {
		this.type = type;
	}

	public String getVechicalNo() {
		return vechicalNo;
	}

	public void setVechicalNo(String vechicalNo) {
		this.vechicalNo = vechicalNo;
	}

	public Vehical() {
		super();
	}

	@Override
	public String toString() {
		return "Vehical [id=" + id + ", model=" + model + ", make=" + make + ", type=" + type + ", vechicalNo="
				+ vechicalNo + "]";
	}

}
