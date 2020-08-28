package com.eparking.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eparking.app.dao.ParkingDAO;
import com.eparking.app.model.ParkingSpot;
import com.eparking.app.model.Vehical;
import com.eparking.app.util.ParkingUtil;

@Service
public class ParkingService {

	@Autowired
	private ParkingUtil util;

	@Autowired
	private ParkingDAO dao;

	public Object park(Vehical vehical) {
		Optional<ParkingSpot> optional = util.findSpot(dao.getAvaialbeSpots(), vehical.getType());
		if (optional.isPresent()) {
			util.fillSpot(dao.getFilledSpots(), optional.get(), vehical);
			return optional.get();
		}

		return "Parking Full";
	}

	public Object findSpot(String vehicalNo) {
		ParkingSpot spot = dao.getFilledSpots().get(vehicalNo);
		return spot != null ? spot : "Your vehical was not parked here";
	}

	public ParkingSpot clearSpot(String vehicalNo) {
		ParkingSpot spot = dao.getFilledSpots().get(vehicalNo);
		spot.setVehical(null);
		return spot;
	}

}
