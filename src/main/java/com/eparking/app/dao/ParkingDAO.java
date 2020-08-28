package com.eparking.app.dao;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.eparking.app.enums.VehicalType;
import com.eparking.app.model.ParkingSpot;

@Repository
public class ParkingDAO {

	public static List<ParkingSpot> availableSpot = new CopyOnWriteArrayList<>();
	public static Map<String, ParkingSpot> filledSpots = new ConcurrentHashMap<>();

	static {
		availableSpot.add(new ParkingSpot(0, 1, VehicalType.TWO_WHEELER));
		availableSpot.add(new ParkingSpot(0, 2, VehicalType.TWO_WHEELER));
		availableSpot.add(new ParkingSpot(1, 1, VehicalType.FOUR_WHEELER));
		availableSpot.add(new ParkingSpot(1, 2, VehicalType.FOUR_WHEELER));
	}

	public List<ParkingSpot> getAvaialbeSpots() {
		return availableSpot;
	}

	public Map<String, ParkingSpot> getFilledSpots() {
		return filledSpots;
	}
}
