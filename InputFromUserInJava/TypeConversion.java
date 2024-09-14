// TYPE CONVERSING:-conversion between small data type into big data type
// (byte -< short -< int -< float -< long -< bouble)

package InputFromUserInJava;

import java.util.Scanner;

public class TypeConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short number = sc.nextByte();                // TRUE
		System.out.println(number);
		
//		int number = sc.nextShort();                 // TRUE
//	    System.out.println(number);
//		
//		float number = sc.nextInt();
//		System.out.println(number);                 // TRUE
//		
//		long number = sc.nextFloat();
//		System.out.println(number);                 // TRUE
//		
//		double number = sc.nextlong();
//		System.out.println(number);                 // TRUE
//		
//		
//		
//		
//		int number = sc.nextFloat();          // WRONG - Because float is big data typr than
//                                              // int data type so can not convert the value
//		System.out.println(number);
//		
	}

}
