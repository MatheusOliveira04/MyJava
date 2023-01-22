package Map_01;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Map<String,String> coockies = new HashMap<>();
		
		coockies.put("username", "maria");
		coockies.put("email","maria@gmail.com");
		coockies.put("phone", "998450742");
		
		coockies.remove("email");
		
		System.out.println("Contains 'phone' key: " + coockies.containsKey("phone"));
		System.out.println("Phone number: " + coockies.get("phone"));
		System.out.println("Email: " + coockies.get("email"));
		System.out.println("Size: " + coockies.size());
		
		System.out.println("ALL COOKIES:");
		for(String key : coockies.keySet()) {
			System.out.println((key + ": " + coockies.get(key)));
		}

	}

}
