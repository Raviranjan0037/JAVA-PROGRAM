package TernaryOperator;

import java.util.*;

public class EvenOddNumber {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number:- ");
			int number = sc.nextInt() ;
			
//			ternary operator
			String type = (number%2 == 0)? "Even Number" : "Odd Number";
			System.out.println(type);
	}
}