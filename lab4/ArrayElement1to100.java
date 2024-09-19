package lab4;

public class ArrayElement1to100 {
	    public static void main(String[] args) {
	        // Initialize an array of size 100
	        int[] array = new int[100];

	        // Populate the array with numbers from 1 to 100
	        for (int i = 0; i < array.length; i++) {
	            array[i] = i + 1;
	        }

	        // Print the array elements
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }
}