package lab2;

import java.util.Arrays;

public class SecondHighestNumber {

    public static void main(String[] args) {
        // Declare the main array
        int[] array = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        //subarray from index 2 to 6
        int[] subArray = getSubArray(array, 2, 6);

        // Find the second highest number in the subarray
        int secondHighest = findSecondHighest(subArray);

        // Print the results
        System.out.println("Sub array: " + Arrays.toString(subArray));
        System.out.println("2nd Highest element: " + secondHighest);
    }

    // Method to extract a subarray from the given array between start and end indices
    public static int[] getSubArray(int[] array, int start, int end) {
        return Arrays.copyOfRange(array, start, end + 1); // end + 1 because end is inclusive
    }

    // Method to find the second highest number in the given array
    public static int findSecondHighest(int[] array) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num < highest) {
                secondHighest = num;
            }
        }

        return (secondHighest == Integer.MIN_VALUE) ? -1 : secondHighest;
    }
}
