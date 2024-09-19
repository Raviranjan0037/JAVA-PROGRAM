package lab3;

import java.util.HashSet;

public class UniqueCharacters {

	public static void main(String[] args){
        String input = "java";
        findUniqueCharacters(input);
    }
	public static void findUniqueCharacters(String input)
	{
		HashSet<Character> uniqueChars = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();
        
        for (char c : input.toCharArray()) //loop
        	{
            if (!uniqueChars.add(c)) 
            {
                duplicates.add(c);
            }
        }
        
        uniqueChars.removeAll(duplicates);
        
        for (char c : uniqueChars) 
        {
            System.out.print(c);
        }
    }
}