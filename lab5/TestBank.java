package lab5;

import java.util.ArrayList;

import practice1.Book;

public class TestBank {
	public static void main(String[] args) {
		Book b1= new Book(101,"truth","tanu");
		Book b2 = new Book(102,"maths","CHetan");
		
		ArrayList<Book> a= new  ArrayList<Book>();
		a.add(b1);
		a.add(b2);
		a.add(new Book(103,"false","tej"));
		System.out.println(a);

	}
}
