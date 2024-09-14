package TernaryOperator;

import java.util.Scanner;

public class StudentPassOrFail {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Student:- ");
		int marks = sc.nextInt();
		
		String markssheet = marks >= 33 ? "Student is Pass" :"Student is fail";
		System.out.println(markssheet);
	}

}
