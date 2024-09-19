package question;

public class PalindromeChecker {
	    public static boolean isPalindrome(String s) {
	      
	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        
	        s = s.replace(" ", "").toLowerCase();
	      
	         // Compare the string with its reverse
	       
	        String reversed = new StringBuilder(s).reverse().toString();
	        return s.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String inputString = "Madam";
	        if (isPalindrome(inputString)) {
	            System.out.println(inputString + " is a Palindrome");
	        } else {
	            System.out.println(inputString + " is not a Palindrome");
	        }
	    }
}