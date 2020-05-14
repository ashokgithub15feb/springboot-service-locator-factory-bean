package com.nineleaps.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nineleaps.registry.ServiceResitory;

@Configuration
public class VehicleConfig {
	
	@Bean
	public FactoryBean<?> factoryBean()
	{
		final ServiceLocatorFactoryBean locatorFactoryBean = new ServiceLocatorFactoryBean();
		
		//if more the One impl of same type and what use apropiate impl at runtime 
		locatorFactoryBean.setServiceLocatorInterface(ServiceResitory.class);
		
		return locatorFactoryBean;
	}
}
