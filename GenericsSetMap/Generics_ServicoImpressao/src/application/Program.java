package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many do you want?");
		int n = ler.nextInt();
		ler.nextLine();
		
		
		for(int i = 0; i < n; i++) {
			Integer a = ler.nextInt();
			ps.addValue(a);
		}
		ps.print();
		
		Integer x = ps.first();
		System.out.println("\nFirst: " + x);
		
		
		ler.close();
	}

}
