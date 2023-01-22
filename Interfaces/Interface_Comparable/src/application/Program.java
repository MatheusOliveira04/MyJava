package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		List<Funcionarios> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){

			String a = br.readLine();
			
			while(a != null) {
				String[] vect = a.split(",");
				list.add(new Funcionarios(vect[0], Double.parseDouble(vect[1])));
				a = br.readLine();
			}

			Collections.sort(list);
			
			for(Funcionarios f : list) {
				System.out.println(f.getName() + ", " + f.getPrice()); 
			}
	} 
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			}
		}

}
