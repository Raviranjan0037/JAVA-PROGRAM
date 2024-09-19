package lab3;

import java.util.Scanner;

public class Animal//parent class 
{
	void makesound()
	{
		System.out.println("Animal makes a sound.");
	}
	public class Dog extends Animal//child class-1
	{
		void makesound()
		{
			System.out.println("Dog Barks.");
		}
	}
	public class Cat extends Animal//child class-2
	{
		void makesound()
		{
			System.out.println("Cat Meow.");
		}
	}
	public class Main
	{
		public static void main(String[] args)//main method
		{
			Scanner sc =new Scanner(System.in);//import scanner
			
			System.out.println("Choose animal: ");
	        System.out.println("1.Dog");
	        System.out.println("2.Cat");
	        System.out.println("3.other Animal");
	        System.out.print("Enter your choice (1/2/3): ");
	        
	        int choice = sc.nextInt();
	        Animal animal;
	        
	        switch (choice) //switch case
	        {
            case 1:
                animal = new Dog();  // Create a Dog object
                break;
            case 2:
                animal = new Cat();  // Create a Cat object
                break;
            case 3:
                animal = new Animal();  // Create a other Animal object
                break;
            default:
                System.out.println("Invalid choice.");
                animal = new Animal();
                break;
                }
	        
	        System.out.println("Animal sound: ");
	        animal.makesound();
	        
	        sc.close();//close scanner
		}
	}
	
}
