package com.fact;

public class FactoryManufacturer {
	
	public OS getInstance(String str) {
		if (str.equals("open"))
			return new Android();
		else if (str.equals("secure"))
			return new IOS();
		else
			return new Windows();
	}
	
}
