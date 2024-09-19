package question;
	import java.util.LinkedHashSet;
	import java.util.Set;

public class UniqueCharacters {
	
	    public static void main(String[] args) {
	        String inputString = "java";
	        Set<Character> uniqueChars = new LinkedHashSet<>();

	        for (char c : inputString.toCharArray()) {
	            uniqueChars.add(c);
	        }

	        for (char c : uniqueChars) {
	            System.out.print(c);
	        }
	    }
}