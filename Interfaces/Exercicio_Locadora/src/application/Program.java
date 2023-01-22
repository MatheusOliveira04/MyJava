package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model_entities.CarRental;
import model_entities.Vehicle;
import model_services.BrazilTaxService;
import model_services.RentalService;

public class Program {

	public static void main(String[] args) {
		
		DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String model = ler.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(ler.nextLine(), ftm);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(ler.nextLine(), ftm);
		
		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Entre com o preço por hora: ");
		double pricePerHour = ler.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = ler.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		ler.close();
	}

}
