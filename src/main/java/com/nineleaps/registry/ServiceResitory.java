package com.nineleaps.registry;


public interface ServiceResitory {
	
	public <T> AdapterService<T> getService(String serviceName);
}
