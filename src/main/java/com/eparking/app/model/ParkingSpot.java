package com.eparking.app.model;

import com.eparking.app.enums.VehicalType;

public class ParkingSpot {
	private int floor;
	private int slotNo;
	private VehicalType type;
	private Vehical vehical = null;

	public ParkingSpot() {}

	public ParkingSpot(int floor, int slotNo, VehicalType type) {
		this.floor = floor;
		this.slotNo = slotNo;
		this.type = type;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getSlotNo() {
		return slotNo;
	}

	public void setSlotNo(int slotNo) {
		this.slotNo = slotNo;
	}

	public VehicalType getType() {
		return type;
	}

	public void setType(VehicalType type) {
		this.type = type;
	}

	public Vehical getVehical() {
		return vehical;
	}

	public void setVehical(Vehical vehical) {
		this.vehical = vehical;
	}

	@Override
	public String toString() {
		return "ParkingSpot [floor=" + floor + ", slotNo=" + slotNo + ", type=" + type + ", vehical=" + vehical + "]";
	}

}
