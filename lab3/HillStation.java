package lab3;
public class HillStation //super class
{
	void location()
	{
		System.out.println("Location of the HillStation.");
		}
	void famous()
	{
		System.out.println("Manali is located in Himachal Pradesh.");
		}
	public class Manali extends HillStation //subclass-1
	{
		void location()
		{
			System.out.println("Manali located in HP.");
			}
		void famous()
		{
			System.out.println("Manali is famous for tourist place and wadiyaas.");
			}
		public class Mussoorie extends HillStation //subclass-2
		{
			void location()
			{
				System.out.println("Mussoorie located in UK.");
				}
			void famous()
			{
				System.out.println("Mussoorie is scenic beauty, good climate, and many attractions.");
				}
			}
		}
	public class Gulmarg extends HillStation //subclass-3
	{
		void location()
		{
			System.out.println("Gulmarg located in J&K.");
			}
		void famous()
		{
			System.out.println("Gulmarg is scenic beauty, good climate, and many attractions .");
			}
		}
	public class Main
	{
		public static void main(String[] args) //MAIN METHOD
		{
			// Creating an object of the superclass HillStations
			HillStation hillstation;
	        hillstation = new Manali();
	        System.out.println("Calling from Parent Class - Manali:");
	        hillstation.location();
	        hillstation.famous();

	        // Polymorphism
	        hillstation = new Mussoorie();
	        System.out.println("\nCalling from Parent Class- Mussoorie:");
	        hillstation.location();
	        hillstation.famous();

	        // Polymorphism
	        hillstation = new Gulmarg();
	        System.out.println("\nCalling from Parent Class- Gulmarg:");
	        hillstation.location();
	        hillstation.famous();
	        
	        Manali manali = new Manali();
	        manali.location();
	        manali.famous();
	        System.out.println("Manali:");

	        Mussoorie mussoorie = new Mussoorie();
	        mussoorie.location();
	        mussoorie.famous();
	        System.out.println("\nMussoorie:");
 
	        Gulmarg gulmarg = new Gulmarg();
	        gulmarg.location();
	        gulmarg.famous();
	        System.out.println("\nGulmarg:");
		}
	}
}