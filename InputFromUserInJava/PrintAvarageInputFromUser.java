package InputFromUserInJava;

import java.util.*;

public class PrintAvarageInputFromUser {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1:- ");
		double num1 = sc.nextInt();

		System.out.println("Enter num2:- ");
		double num2 = sc.nextInt();

		System.out.println("Enter num3:- ");
		double num3 = sc.nextInt();

		
		double avarage = (num1 + num2 + num3)/3;
		
		System.out.println("Avarage Is:- "+avarage);
	}
}
