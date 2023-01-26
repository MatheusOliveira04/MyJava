import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		List<Double> arr = new ArrayList<>();

		double f = 0;
		int n = 0;
		double a = 0;
		while (n < 5) {
			a = ler.nextDouble();
			arr.add(a);
			n++;
		
		}
		
		System.out.println("----");
		f = 0;
		for (double c : arr) {
			if (c != a) {
				f = c;
				System.out.println(f);
			}
		}

		System.out.println("----");
		System.out.println();
		System.out.println(a);
		ler.close();
	}

}
