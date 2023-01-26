package util;

import java.util.function.Function;

import entities.Product;

public class MyFunction implements Function<Product,String>{

	@Override
	public String apply(Product t) {
		return t.getName().toUpperCase();
	}

	
}
