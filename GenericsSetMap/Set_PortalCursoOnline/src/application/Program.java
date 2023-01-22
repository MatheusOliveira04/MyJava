package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int n = ler.nextInt();
		for(int i = 1; i <= n; i++) {
			int alunos = ler.nextInt();
			a.add(alunos);
		}
		
		System.out.print("How many students for course B?");
		n = ler.nextInt();
		for(int i = 1; i <= n; i++) {
			int alunos = ler.nextInt();
			b.add(alunos);
		}
		
		System.out.print("How many students for course C?");
		n = ler.nextInt();
		for(int i = 1; i <= n; i++) {
			int alunos = ler.nextInt();
			c.add(alunos);
		}
		
		Set<Integer> set = new HashSet<>(a);
		set.addAll(b);
		set.addAll(c);
		
		System.out.println("size: " + set.size());
		ler.close();
	}

}
