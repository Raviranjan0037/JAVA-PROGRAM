package question;

import java.util.ArrayList;

public class Bank {

	    int bookId;
	    String bookName;
	    String authorName;

	                 // Parameterized constructor
	    public Book(int bookId, String bookName, String authorName) {
	        this.bookId = bookId;
	        this.bookName = bookName;
	        this.authorName = authorName;
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Book Name: " + bookName);
	        System.out.println("Author Name: " + authorName);
	        System.out.println("------------------------");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Create an ArrayList of type Book
	        ArrayList<Book> bookList = new ArrayList<>();

	        // Create book objects and add to the ArrayList
	        bookList.add(new Book(1, "Java Programming", "John Smith"));
	        bookList.add(new Book(2, "Data Structures", "Jane Doe"));
	        bookList.add(new Book(3, "Algorithms", "Bob Johnson"));

	        // Display all book details using advanced for loop
	        System.out.println("Book Details:");
	        for (Book book : bookList) {
	            book.displayBookDetails();
	        }
	    }
	}