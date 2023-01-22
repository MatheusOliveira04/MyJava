package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		List<Rectangle> myRec = new ArrayList<>();
		myRec.add(new Rectangle(2,3));
		
	
		System.out.printf("Total area: %.2f" , totalArea(myRec));
	}
		
		public static double totalArea(List<? extends Shape> list) {
			double sum = 0.0;
			for (Shape s : list) {
				sum += s.area();
			}
			return sum;
		}

	

}
