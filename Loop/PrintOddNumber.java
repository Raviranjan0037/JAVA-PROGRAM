///////////////////////////METHOD- 1///////////////////////////////////////////////

//package Loop;
//
//public class PrintOddNumber {
//	public static void main(String[] args) {
//		
//		for(int i = 1; i <= 50; i= i+2) {
//			System.out.println(i);
//		}
//	}
//
//}

////////////////////////////////////METHOD-2///////////////////////////////////////////

package Loop;

public class PrintOddNumber {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i= i+1) {
			if(i%2!=0) {
			System.out.println(i);
			}
		}
	}

}
