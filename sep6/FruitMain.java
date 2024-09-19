package sep6;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FruitMain {
    public static void main(String[] args) {
    	
        // Create a list of fruits with duplicates
    	
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Apple"));
        fruitList.add(new Fruit("Mango"));
        fruitList.add(new Fruit("Banana"));
        fruitList.add(new Fruit("Orange"));
        fruitList.add(new Fruit("Mango"));

        System.out.println("Original list with duplicates:");
        for (Fruit fruit : fruitList) {
            System.out.println(fruit.getName());
        }

        // Remove duplicates using LinkedHashSet
        
        Set<Fruit> fruitSet = new LinkedHashSet<>(fruitList);
        List<Fruit> uniqueFruitList = new ArrayList<>(fruitSet);

        System.out.println("\nList after removing duplicates:");
        for (Fruit fruit : uniqueFruitList) {
            System.out.println(fruit.getName());
        }
    }
}