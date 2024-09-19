package lab2;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                 // User input
        System.out.print("Enter a number ");
        int num = scanner.nextInt();

                 // Check if the number is a Strong number
        if (isStrongNumber(num)) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");
        }

    }    
    // Function to check if a number is a Strong number
    public static boolean isStrongNumber(int num) {
        int originalNumber = num;
        int sum = 0;

        // Loop through each digit of the number
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit); 
            num /= 10; 
        }

        return sum == originalNumber;
    }

    // calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i; 
        }
        return fact;
    }
}

