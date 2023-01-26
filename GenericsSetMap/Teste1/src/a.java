import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Double> arr = new ArrayList<>();
		
		int n = 0; 
		while(n < 5) {
		Double a = ler.nextDouble();
			arr.add(a);
			n++;
		}
		
		double ar = arr.get(0); 
		for(double c : arr) {
			if(c != ar) {
				System.out.println(c);
			}
		}
		System.out.println("----");
		System.out.println(ar);
		ler.close();

	}

}
