package PatternQuestion;

public class ReverseTrianglePattern {
	public static void main(String[] args) {
		
		for(int i = 8; i <= 10; i--) {
			for(int j = 8; j <= i;j--) {
				System.out.println(" *");
			}
			System.out.println();
		}
	}

}
