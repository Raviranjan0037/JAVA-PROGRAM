package SwitchStatement;

import java.util.Scanner;

public class intSwitchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:- ");
		int number = sc.nextInt();
		
		switch(number) {
		case 1 : System.out.print("Litti-chokha");
		break;
		case 2 : System.out.print("Chicken-Litti");
		break;
		case 3 : System.out.print("Samosa");
		break;
		case 4 : System.out.print("Momos");
		break;
		case 5 : System.out.print("Coffee");
		break;
		case 6 : System.out.print("None Of These");
		}
	}
}