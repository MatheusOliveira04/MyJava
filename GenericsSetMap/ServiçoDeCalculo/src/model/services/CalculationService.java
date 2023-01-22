package model.services;

import java.util.List;

public class CalculationService{

	public static <T extends Comparable<T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("Error");		
			}
		T max = list.get(0);
		for (T x : list) {
			if(x.compareTo(max) > 0) {
				max = x;
			}
		} return max;
	}
}
