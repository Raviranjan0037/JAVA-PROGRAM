package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rverse {
	 public static void main(String[] args) {
	        // Create a list of strings
	        List<String> stringList = new ArrayList<>();
	        stringList.add("tamanna");
	        stringList.add("anuj");
	        stringList.add("ayush");
	        stringList.add("nisha");

	        // Print the original list
	        System.out.println("Original List: " + stringList);

	        // Reverse the list
	        Collections.reverse(stringList);
	        System.out.println("Reversed List: " + stringList);
	    }


}

