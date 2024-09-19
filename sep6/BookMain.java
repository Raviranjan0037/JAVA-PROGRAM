package sep6;

import java.util.ArrayList;

public class BookMain {

	    public static void main(String[] args) {
	        // Create an ArrayList of type Book
	        ArrayList<Book> bookList = new ArrayList<>();

	        // Create book objects and add to the list
	        bookList.add(new Book(1, "Java Programming", "John Smith"));
	        bookList.add(new Book(2, "Python Crash Course", "Jane Doe"));
	        bookList.add(new Book(3, "C++ Fundamentals", "Bob Johnson"));

	        // Display all book details using advanced for loop
	        for (Book book : bookList) {
	            System.out.println("Book ID: " + book.getBookId());
	            System.out.println("Book Name: " + book.getBookName());
	            System.out.println("Author Name: " + book.getAuthorName());
	            System.out.println("------------------------");
	        }
	    }
}