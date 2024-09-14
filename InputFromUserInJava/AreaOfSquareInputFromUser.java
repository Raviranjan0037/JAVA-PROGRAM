package InputFromUserInJava;

import java.util.*;

public class AreaOfSquareInputFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side =sc.nextDouble();
		double area = side * side;
		System.out.print("Area of Square:- ");
		System.out.print(area);
	}

}
