package com.wallace.motan;

public class ShippingServiceImpl implements ShippingService {
	
	public String hello(String name) {
        System.out.println(name + " invoked shipping service");
        return "Hello " + name + ", it's greeting from shipping service (group v1)";
    }
}
