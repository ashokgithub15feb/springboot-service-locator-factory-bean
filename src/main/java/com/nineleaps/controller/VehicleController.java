package com.nineleaps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nineleaps.model.Vehicle;
import com.nineleaps.registry.ServiceResitory;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

	//@Autowired
	private ServiceResitory serviceResitory;
	
	//Internal Server Error 500
//	 public VehicleController() {
//		 System.out.println("Default Constructor called!!!!!!");
//	 }
	
	public VehicleController(ServiceResitory serviceResitory)
	{
		System.out.println("Argument Constructor called!!!!!!");
		this.serviceResitory = serviceResitory;
	}
	
	@PostMapping
	public void processVehicleDeatils(@RequestBody Vehicle vehicle)
	{
		serviceResitory.getService(vehicle.getVehicleType()).process(vehicle);
	}
}
