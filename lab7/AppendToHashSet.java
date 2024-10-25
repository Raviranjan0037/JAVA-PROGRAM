package lab7;

import java.util.HashSet;

public class AppendToHashSet {
	public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add some initial elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Print the HashSet before adding new element
        System.out.println("HashSet before adding new element: " + set);

        // Element to be appended
        String newElement = "Date";

        // Append the new element to the HashSet
        set.add(newElement);

        // Print the HashSet after adding new element
        System.out.println("HashSet after adding new element: " + set);
    }

}
