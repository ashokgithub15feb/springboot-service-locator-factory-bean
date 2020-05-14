package com.nineleaps.service;

import org.springframework.stereotype.Service;

import com.nineleaps.model.Vehicle;
import com.nineleaps.registry.AdapterService;

@Service(value = "Bike")
public class BikeService  implements AdapterService<Vehicle>{
	
	@Override
	public void process(Vehicle request) {
		
		System.out.println("Inside Bike Service: "+request.toString());
	}
}
