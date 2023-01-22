package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDouble = Arrays.asList(1.5, 2.2);
		List<Object> myObj = new ArrayList<>();

		copy(myInts, myObj);
		print(myObj);
		copy(myDouble, myObj);
		print(myObj);
		
		int i = myInts.get(0);
	}
	
	public static void copy(List<? extends Number> a, List<? super Number> b) {
		if(a.isEmpty()) {
			throw new IllegalStateException("Erro, a lista está vazia!");
		}
		for(Number c : a) {
			b.add(c);
		}
	}
	public static void print(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
