package application;

import java.util.Locale;
import java.util.Scanner;

import Services.BrazilInterestService;
import Services.InterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(1.0);
		is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", is.payment(amount, months)));
		
		sc.close();
	}

}
