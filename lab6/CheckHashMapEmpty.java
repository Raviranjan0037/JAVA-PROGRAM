package lab6;

import java.util.HashMap;

public class CheckHashMapEmpty {
    public static void main(String[] args) { // creating main method
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Adding an element to the HashMap
        map.put(1, "Java");
        map.put(1, "python");
        map.put(3, "React");
        map.put(4, "PHP");

        
        // Check again if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
}
