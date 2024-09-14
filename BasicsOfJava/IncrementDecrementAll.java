package BasicsOfJava;

public class IncrementDecrementAll {
	public static void main(String[] args) {
		
		
//		  int x = 8; 
//		  System.out.println(x); 
//		  x++; 
//		  System.out.println(x); 
//		  x--;
//		  System.out.println(x); 
//		  --x; 
//		  System.out.println(x); 
//		  x++;
//		  System.out.println(x); 
//		  --x; 
//		  System.out.println(x); 
//		  --x;
//		  System.out.println(x);
//		 
		
		
		int x = 10;         
		System.out.println((x++ + x--) * (x++ - x--));
		
		int y = 5;         
		System.out.println((y-- - y++) * (y++ + y--));
		
		int z = 3;         
		System.out.println((z++ * z--) + (z-- / z++));
		
		int w = 7;        
		System.out.println((w-- + w++) * (w++ - w--));
		
		int v = 9;        
		System.out.println((v++ - v--) * (v-- + v++));
		
		int a = 8;         
		System.out.println((--a - a--) * (++a + a++));
		
		
	}

}