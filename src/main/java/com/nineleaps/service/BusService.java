package com.nineleaps.service;

import org.springframework.stereotype.Service;

import com.nineleaps.model.Vehicle;
import com.nineleaps.registry.AdapterService;

@Service(value = "Bus")
public class BusService  implements AdapterService<Vehicle>{
	
	@Override
	public void process(Vehicle request) {
		
		System.out.println("Inside Bus Service: "+request.toString());
	}
}
