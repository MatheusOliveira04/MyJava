package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		String path = "C:\\temp\\in3.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				int quantos = Integer.parseInt(fields[1]);
				
				if (map.containsKey(name)) {
					int votos = map.get(name);
					map.put(name, quantos + votos);
				}
				else {
					map.put(name, quantos);
				}
				line = br.readLine();
			}
			for (String key : map.keySet()) {
				System.out.println(key + ": " + map.get(key));
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
