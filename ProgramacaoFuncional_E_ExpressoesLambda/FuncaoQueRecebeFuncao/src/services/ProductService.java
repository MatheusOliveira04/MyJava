package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductService {

	public double filterSum(List<Product> list, Predicate<Product> criteria) {
		double sum = 0.0;
		for(Product product : list) {
			if(criteria.test(product)) {
				sum += product.getPrice(); 
			}
		}
		return sum;
	}
}
