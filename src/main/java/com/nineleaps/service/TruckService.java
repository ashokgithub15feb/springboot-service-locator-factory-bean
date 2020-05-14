package com.nineleaps.service;

import org.springframework.stereotype.Service;

import com.nineleaps.model.Vehicle;
import com.nineleaps.registry.AdapterService;

@Service(value = "Truck")
public class TruckService  implements AdapterService<Vehicle>{
	
	@Override
	public void process(Vehicle request) {
		
		System.out.println("Inside Truck Service: "+request.toString());
	}
}
