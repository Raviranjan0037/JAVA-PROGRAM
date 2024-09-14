package ConditionalStatement;

public class LargestOf3 {
	public static void main(String[] args) {
		int a = 5;
		int b = 56;
		int c = 3;
		if(a>=b && a>=c){
			System.out.println("Largest is A");
		}
		else if(b>=c) {
			System.out.println("Largest is B");
		}
		else {
			System.out.println("Largest is C");
		}
	}

}
