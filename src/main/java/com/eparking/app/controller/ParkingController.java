package com.eparking.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eparking.app.model.Vehical;
import com.eparking.app.service.ParkingService;

@RestController
@RequestMapping("/parking")
public class ParkingController {

	@Autowired
	private ParkingService service;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String welcome() {
		return "Welcome to e-Parking..";
	}

	@RequestMapping(value = "/park", method = RequestMethod.POST)
	public Object findSlotAndPark(@RequestBody Vehical vehical) {
		return service.park(vehical);
	}

	@RequestMapping(value = "/find/{vehicalNo}", method = RequestMethod.GET)
	public Object findSpot(@PathVariable(required = true) String vehicalNo) {
		return service.findSpot(vehicalNo);
	}

	@RequestMapping(value = "/clear/{vehicalNo}", method = RequestMethod.PUT)
	public Object clearSpot(@PathVariable(required = true) String vehicalNo) {
		return service.clearSpot(vehicalNo);
	}
}
