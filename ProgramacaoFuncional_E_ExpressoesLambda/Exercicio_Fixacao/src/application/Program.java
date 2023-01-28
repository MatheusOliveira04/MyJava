package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		String path = "C:\\temp\\in5.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				emp.add(new Employee(fields[0],fields[1],Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double value = ler.nextDouble();
			
			Comparator<String> comp = (e1,e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());
			
			List<String> email = emp.stream()
					.filter(x -> x.getPrice() > value)
					.map(y -> y.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
					
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", value) + ":");
			email.forEach(System.out::println);
			
			Double sum = emp.stream()
					.filter(x -> x.getName().charAt(0) == 'M')
					.map(x -> x.getPrice())
					.reduce(0.0,(x, y) -> x + y);
					
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));
			
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		ler.close();
	}

}
