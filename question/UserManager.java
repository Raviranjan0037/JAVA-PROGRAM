package question;

public class UserManager {
	    public void createUser(String username) {
	    	
	        // Check if the user already exists
	    	
	        if (userExists(username)) {
	            throw new DuplicateUserException("User with username '" + username + "' already exists.");
	        }
	        // Create the user
	    }

	    private boolean userExists(String username) {
	    	
	        // Implement the logic to check if the user exists
	    	
	        return true; // Replace with actual logic
	    }
}
