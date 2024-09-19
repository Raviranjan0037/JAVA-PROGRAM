package question;

public class UsernameValidator {

	    public static class InvalidUsernameException extends Exception {
	        public InvalidUsernameException(String message) {
	            super(message);
	        }
	    }

	    public static void validateUsername(String username) throws InvalidUsernameException {
	        if (username == null || username.isEmpty()) {
	            throw new InvalidUsernameException("Username cannot be null or empty");
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            validateUsername("validUsername");
	            System.out.println("Username is valid");
	        } catch (InvalidUsernameException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            validateUsername(null);
	        } catch (InvalidUsernameException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            validateUsername("");
	        } catch (InvalidUsernameException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}