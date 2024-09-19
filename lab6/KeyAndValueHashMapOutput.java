package lab6;

import java.util.HashMap;

public class KeyAndValueHashMapOutput {
	
	public static void main(String[] args) { // create a main method
		
		// create a HashMap with String Key and Value
		HashMap<String, String> hash = new HashMap<String, String>();
		hash.put("Capital of India", "New Delhi");    // adding the Value
		hash.put("Prime Minister of India", "Narendra Modi");
		hash.put("Defence Minister of India", "Rajnath Singh");
		
		// Print the output of the HashMap
		System.out.println(hash);
	}

}
