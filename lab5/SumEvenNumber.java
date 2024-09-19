package lab5;

import java.util.ArrayList;
import java.util.List;

public class SumEvenNumber {
	public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(22);
        numbers.add(33);
        numbers.add(40);
        numbers.add(55);

        // Calculate the sum of all even numbers
        int sum = sumOfEvenNumbers(numbers);

        // Print the result
        System.out.println("Sum of even numbers: " + sum);
    }

    /**
     * Calculates the sum of all even numbers in the given list.
     * 
     * @param numbers the list of integers
     * @return the sum of all even numbers
     */
    public static int sumOfEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
