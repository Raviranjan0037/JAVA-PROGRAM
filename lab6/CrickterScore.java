package lab6;

import java.util.HashMap;
import java.util.Map;

public class CrickterScore {
	
	public static void main(String[] args) {
		
		// create a HashMAp String and Integer
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Virat", 200);  // adding the Score
		map.put("Rohit", 120);
		map.put("KL Rahul", 90);
		map.put("Dhoni", 100);
		map.put("Gill", 75);
		map.put("Pant", 89);
		
		// Before the Search all Cricketer list
		System.out.println(map);
		
		
		// Search the Cricketer name return the Score
		System.out.println(map.get("Virat"));
		
	}

}
