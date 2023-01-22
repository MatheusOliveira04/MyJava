package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model_entities.Contract;
import model_entities.Installment;
import model_services.ContractService;
import model_services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = ler.nextInt();
		System.out.print("Data (dd/MM/yyyy):");
		LocalDate date = LocalDate.parse(ler.next(),fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = ler.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas:");
		int n = ler.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas: ");
		for (Installment installment : obj.getInstalments()) {
			System.out.println(installment);
		}
		
		ler.close();
	}

}
