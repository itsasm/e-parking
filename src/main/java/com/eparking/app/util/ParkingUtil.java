package com.eparking.app.util;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.eparking.app.enums.VehicalType;
import com.eparking.app.model.ParkingSpot;
import com.eparking.app.model.Vehical;

@Component
public class ParkingUtil {

	public Optional<ParkingSpot> findSpot(List<ParkingSpot> list, VehicalType vehicalType) {
		return list.stream().filter(e -> (e.getType() == vehicalType && e.getVehical() == null)).findFirst();
	}

	public void fillSpot(Map<String, ParkingSpot> filledSpots, ParkingSpot parkingSpot, Vehical vehical) {
		parkingSpot.setVehical(vehical);
		filledSpots.put(vehical.getVechicalNo(), parkingSpot);
	}

}
