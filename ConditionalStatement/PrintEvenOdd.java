package ConditionalStatement;

import java.util.*;

public class PrintEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:- ");
		int number = sc.nextInt();
		
		if(number%2==0) {
			System.out.println("This is even number");
		}
			else {
				System.out.println("This is odd number");
			}
	}
}

