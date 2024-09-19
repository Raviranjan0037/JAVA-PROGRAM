package lab4;

public class ExceptionHandling {

	public static void main(String[] args)
	{
		int[] numbers = {2,4,6,8,10};// Create array with 5 elements
		
		// Try block to catch the exception
		try {
			for (int i = 0; i <= numbers.length; i++) // Loop to access all elements and size
				{ 
	                System.out.println("Accessing index " + i + ": " + numbers[i]);
	                }
			}
		// Catch block to handle the exception
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception found: " + e);
	        System.out.println("You tried to access an index outside the array bounds 5.");
		}
	}
}
