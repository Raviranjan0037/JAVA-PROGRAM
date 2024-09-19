///////////////////////////////////METHOD 1////////////////////////////////////////////////////////
package Loop;

import java.util.Scanner;

public class PrintNNumberOfTable {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Table of:- ");
		int n = sc.nextInt();
		
		for(int i= 1; i <=10; i++) {
			System.out.println(n*i);
		}
		
	}

}

//////////////////////////////////////////METHOD - 2///////////////////////////////////////
//package Loop;
//
//import java.util.Scanner;
//
//public class PrintNNumberOfTable {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Table of:- ");
//		int n = sc.nextInt();
//		
//		for(int i= 1; i <=10; i++) {
//			System.out.println(n+"*"+i+"="+n*i);
//		}
//		
//	}
//
//}
